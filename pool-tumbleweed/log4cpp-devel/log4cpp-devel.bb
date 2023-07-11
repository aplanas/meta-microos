SUMMARY = "Development tools for Log for C++"
DESCRIPTION = "The log4cpp-devel package contains the static libraries and header files \
needed for development with log4cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.1.3"

RPM_NAME = "log4cpp-devel-1.1.3-2.20.aarch64.rpm"
RPM_HASH = "d28e91ceeed00b918997195c51267edbfd291891a8cc1e59790851dbc1fb3b6a7549bd3eef1c1847eb14b09012530757f2f12235bfdb1217c8762bbefb5e2159"

RPROVIDES:${PN} += "log4cpp-devel \
pkgconfig-log4cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblog4cpp5"

inherit rpm
