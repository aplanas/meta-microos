SUMMARY = "A spell checker and morphological analyzer library"
DESCRIPTION = "Hunspell is a spell checker and morphological analyzer library and \
program designed for languages with rich morphology and complex word \
compounding or character encoding. Hunspell interfaces: Ispell-like \
terminal interface using Curses library, Ispell pipe interface, \
LibreOffice or OpenOffice.org UNO module."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "72b8857588b02abe3211eaa36283cae8010f3c0a4a4648921a1973d3865875d99b937a32cab2c0a2c4e14ecf2d13f149008cf031d11d16fbe22df64ca4e5510a"

RPROVIDES:${PN} += "hunspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libncursesw.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
myspell-en-US"

inherit rpm
