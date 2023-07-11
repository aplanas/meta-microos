SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng12-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng12. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-devel-1.2.59-2.7.aarch64.rpm"
RPM_HASH = "03336a8c7e1e74db4c38903046e5bafed3cce7ee5ae84e9f34d33f06b8abb87ea51a71a1263128ab09daccf86b65099cf89c780c4e354688838793756f1cc816"

RPROVIDES:${PN} += "libpng12-devel \
pkgconfig-libpng12"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpng12-0 \
pkg-config \
zlib-devel"

inherit rpm
