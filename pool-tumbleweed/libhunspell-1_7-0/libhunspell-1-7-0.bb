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

RPM_NAME = "libhunspell-1_7-0-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "ff120822cb594d79f9b1bd7c14deae6686c060db69076e0d60344cbe868b6426a622777699b48257d854ecdd1e5b1a67d4f009ab61967eb65f25aeaa4155e06b"

RPROVIDES:${PN} += "libhunspell-1-7-0 \
libhunspell-1.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
