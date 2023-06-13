SUMMARY = "A spell checker and morphological analyzer library"
DESCRIPTION = "Hunspell is a spell checker and morphological analyzer library and \
program designed for languages with rich morphology and complex word \
compounding or character encoding. Hunspell interfaces: Ispell-like \
terminal interface using Curses library, Ispell pipe interface, \
LibreOffice or OpenOffice.org UNO module."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "657d574ee53797dc65d6f78987d6a7f7ae343d43fde1f4dabc42933eb2842f27a101fc3a9e0304fb86cfd309289dbeecf834d35d6b49589afe06cfa6f4b77a61"

RPROVIDES:${PN} += "hunspell \
hunspell(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
myspell-en_US"

inherit rpm
