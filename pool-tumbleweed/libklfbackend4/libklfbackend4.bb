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

RPM_NAME = "libklfbackend4-4.1.0-1.14.aarch64.rpm"
RPM_HASH = "4a1bccdffb11cace13ac023764b880d7d903a522b46a3868371c62189e86e6009b5dc79095100fbce2445c4d3a79a79e39e6ca9f1b1bf426b91a63b2dd0fb11d"

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
