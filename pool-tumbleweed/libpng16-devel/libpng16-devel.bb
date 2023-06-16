SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng16. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-devel-1.6.39-4.1.aarch64.rpm"
RPM_HASH = "06663b505e5511b3c8bb18992586d0e42f33133d950cd00fda71ac71aa9e7efe741166aef46f3d220ec08d3e23e72506ad019543d5f2424add6d12a040ed8a5c"

RPROVIDES:${PN} += "libpng16-devel \
pkgconfig-libpng16"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpng16-16 \
pkgconfig \
pkgconfig-zlib"

inherit rpm
