SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-pkgconf-1.6.3-5.3.noarch.rpm"
RPM_HASH = "bfc52d47ed5b668023a278c848ec3509c476abea1950acca4bb934c0b1975ed7759dc58a99aace12e4133a8f42f977bddb80ea2df201375ca91ce7d1bd6faffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-pkgconf \
mingw32-libpkgconf-3.dll \
mingw32-pkg-config \
mingw32-pkg-libpkgconf \
mingw32-pkgconf"

RDEPENDS:${PN} += ""

inherit rpm
