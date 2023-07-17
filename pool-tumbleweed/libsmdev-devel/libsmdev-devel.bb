SUMMARY = "Development files for libsmdev, a storage media access library"
DESCRIPTION = "libsmdev is a library to access and read storage media devices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmdev."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-devel-20221028-2.12.aarch64.rpm"
RPM_HASH = "cf50c94365f30e5cdf2a1a7a329d9dbf6c7d644a48ecb8d8c844f94581beb2a4a39c72e6e078fde4d14d6c7292d9563cfaf25fb5bef7c7664c0e7e26c5792797"

RPROVIDES:${PN} += "libsmdev-devel \
pkgconfig-libsmdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmdev1"

inherit rpm
