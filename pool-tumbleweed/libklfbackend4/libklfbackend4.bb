SUMMARY = "KLatexFormula backend library (Qt4)"
DESCRIPTION = "A C++/Qt library to generate images (PNG, EPS, PDF, plus all Qt-supported image \
formats) from LaTeX equations. \
 \
This library implements the base functionality of KLatexFormula. This library \
is compiled for Qt 4. \
 \
See also packages klatexformula and libklfbackend-qt3."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "libklfbackend4-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "4be958a4c547df8e13885384696fcb837e715d99901286c333e54a8c27041819078533ac62f33c1bd7dc3089578a9e81b6cbc6d5c9aea4b6ff1aaa4479cd7690"

RPROVIDES:${PN} += "libklfbackend \
libklfbackend.so.4 \
libklfbackend4"

RDEPENDS:${PN} += "/sbin/ldconfig \
gs \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libklftools.so.4 \
libstdc++.so.6 \
texlive-latex"

inherit rpm
