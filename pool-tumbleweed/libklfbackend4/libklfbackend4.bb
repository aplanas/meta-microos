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
libklfbackend.so.4()(64bit) \
libklfbackend4 \
libklfbackend4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libklftools.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
texlive-latex"

inherit rpm
