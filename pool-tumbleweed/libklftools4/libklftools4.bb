SUMMARY = "KLatexFormula tool library"
DESCRIPTION = "A C++/Qt4 library containing general-purpose GUI tools. \
 \
These tools were originially written for use by klatexformula, but they have \
been promoted to a library for use in any application."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "libklftools4-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "73a649c247c2673e54602c3fc6812092677c333c4a2e84fb90d4ebc21f708f319bc56329486e6f181cba0ffa99a0f365f603cdee03b62183e2438f2883c28630"

RPROVIDES:${PN} += "libklftools \
libklftools.so.4()(64bit) \
libklftools4 \
libklftools4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
