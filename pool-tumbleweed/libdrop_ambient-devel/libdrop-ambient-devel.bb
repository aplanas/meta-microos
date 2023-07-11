SUMMARY = "Devel package for libdrop_ambient0"
DESCRIPTION = "This package contains the files needed for developing \
applications that need to use the libdrop_ambient library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libdrop_ambient-devel-0.8.3-2.3.aarch64.rpm"
RPM_HASH = "5c22e63af79ea8edef2a837b0d1a499c85b7ebad84f5601c1af9f5782f2c2e65ba509f44c72ae538372bf5ede909e01b6d7babb6e98e38ef323622e94653c477"

RPROVIDES:${PN} += "libdrop-ambient-devel"

RDEPENDS:${PN} += "libdrop-ambient0"

inherit rpm
