SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng16. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "libpng-2.0"

PV = "1.6.40"

RPM_NAME = "libpng16-devel-1.6.40-1.1.aarch64.rpm"
RPM_HASH = "e256045e8813b51a763785f3b95676c6db8fb1f5b308a9e282ff38ed94903fd260c672b1e79e67a87052006b7585b84730e07b9a0ae1be1edcaf048fbb781bcb"

RPROVIDES:${PN} += "libpng16-devel \
pkgconfig-libpng16"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpng16-16 \
pkgconfig \
pkgconfig-zlib"

inherit rpm
