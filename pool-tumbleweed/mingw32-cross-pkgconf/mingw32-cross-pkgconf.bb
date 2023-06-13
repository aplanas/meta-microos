SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-cross-pkgconf-1.6.3-5.1.aarch64.rpm"
RPM_HASH = "9cfda332afc0e8cd4c21030bae830939b881b3646dc2216421dee0422e7bf507499223af48b6788c43fa595672e925f422c3482a1de985d8f24b9ac08de9162d"

RPROVIDES:${PN} += "mingw32-cross-pkg-config \
mingw32-cross-pkgconf \
mingw32-cross-pkgconf(aarch-64) \
mingw32-cross-pkgconf-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
mingw32-filesystem \
pkg-config"

inherit rpm
