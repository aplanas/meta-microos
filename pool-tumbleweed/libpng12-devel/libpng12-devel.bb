SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng12-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng12. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-devel-1.2.59-2.6.aarch64.rpm"
RPM_HASH = "eabd8d11360c4e54c33ed629df4fb53538ed2ec1a6fda3bea8e5127701a9efecec6d3b1a698dfa8fbdfca5a7a4517e678da35a48c1ab6215c396a158e6c84901"

RPROVIDES:${PN} += "libpng12-devel \
libpng12-devel(aarch-64) \
pkgconfig(libpng12)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libpng12-0 \
pkgconf-pkg-config \
zlib-devel"

inherit rpm
