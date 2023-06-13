SUMMARY = "Header files for fontconfig"
DESCRIPTION = "This package countains all include files, libraries, configuration \
files needed for compiling applications which use the fontconfig \
library."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-devel-2.14.2-1.3.aarch64.rpm"
RPM_HASH = "38ce0aa65920eb07f6df2df931820d3cbbf6dcff964d4ae7f1b1e73dea0c49f1698a1b4b376cf05e9e5d4ac5dadceaf8a5986217044ba688903d0d1a4047188e"

RPROVIDES:${PN} += "fontconfig-devel \
fontconfig-devel(aarch-64) \
pkgconfig(fontconfig)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gettext-devel \
glibc-devel \
libfontconfig1 \
pkgconfig(expat) \
pkgconfig(freetype2)"

inherit rpm
