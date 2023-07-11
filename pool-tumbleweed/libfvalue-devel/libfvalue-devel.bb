SUMMARY = "Development files for libfvalue"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfvalue."
LICENSE = "LGPL-3.0-or-later"

PV = "20220120"

RPM_NAME = "libfvalue-devel-20220120-3.6.aarch64.rpm"
RPM_HASH = "57d139ff8df5dfc236c60af312c051c8d81d502b656a94ff32e5946c5d80d47caf5a6550ac6ca293c499712cde393dfbdcf680ddf7d8019af1ff70a1473d0904"

RPROVIDES:${PN} += "libfvalue-devel \
pkgconfig-libfvalue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfvalue1"

inherit rpm
