SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-pkgconf-1.6.3-5.3.noarch.rpm"
RPM_HASH = "14e485d36efe82b353c131f3e6f91be19e97dca29ee41b31629e05062b0f106c7b7cd1013474fb124662ac2fbaad8e7df6a5109da73f3b2b78380bc3c59ab54d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-pkgconf \
mingw64-libpkgconf-3.dll \
mingw64-pkg-config \
mingw64-pkg-libpkgconf \
mingw64-pkgconf"

RDEPENDS:${PN} += ""

inherit rpm
