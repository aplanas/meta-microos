SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-cross-pkgconf-1.6.3-5.1.aarch64.rpm"
RPM_HASH = "1dcd4a5b27ad1fedb5e967427d27d11edc709d667b0e6ccfecdb651fdb47bc05c6584568eb35caf27ea6f8dcd31759bfefc2d0df326667dcbf7e89896105c6b3"

RPROVIDES:${PN} += "mingw64-cross-pkg-config \
mingw64-cross-pkgconf \
mingw64-cross-pkgconf(aarch-64) \
mingw64-cross-pkgconf-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
mingw64-filesystem \
pkg-config"

inherit rpm
