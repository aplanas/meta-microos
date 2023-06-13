SUMMARY = "OpenConnect support for plasma-nm5"
DESCRIPTION = "OpenConnect plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-openconnect-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "45853593b78dbf66393d23793a294451638bb702c005fc208edfce023ab3bd330bc8c962305390d4293aa7629d4dad0c09908d4007de2d41fc254a0e1eb584b2"

RPROVIDES:${PN} += "NetworkManager-openconnect-frontend \
plasma-nm-openconnect \
plasma-nm5-openconnect \
plasma-nm5-openconnect(aarch-64)"

RDEPENDS:${PN} += "NetworkManager-openconnect \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libopenconnect.so.5()(64bit) \
libopenconnect.so.5(OPENCONNECT_5.0)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_2)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_8)(64bit) \
libplasmanm_editor.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
openconnect \
plasma-nm5"

inherit rpm
