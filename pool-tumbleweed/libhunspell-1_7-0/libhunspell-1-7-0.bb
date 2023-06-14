SUMMARY = "A spell checker and morphological analyzer library"
DESCRIPTION = "Hunspell is a spell checker and morphological analyzer library and \
program designed for languages with rich morphology and complex word \
compounding or character encoding. Hunspell interfaces: Ispell-like \
terminal interface using Curses library, Ispell pipe interface, \
LibreOffice or OpenOffice.org UNO module. \
 \
This package contains the shared library."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libhunspell-1_7-0-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "d79ce710c2380cd1c98fbbb2352a9da1b8ac519bca6ad725de74dec03e0cff28d5c41cb1e44ae7a495aee75ce8df2ba1f3f71806f7e4ba195ef3198679034f13"

RPROVIDES:${PN} += "libhunspell-1-7-0 \
libhunspell-1.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
