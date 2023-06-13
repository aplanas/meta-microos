SUMMARY = "PPTP support for plasma-nm5"
DESCRIPTION = "Point-To-Point Tunneling Protocol (PPTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-pptp-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "239e1f513b68255691605239f28296db8cf1e0b2ee42f510049e8c955cb537a038b3cbc28cac8d1fb194a8074d1f9936b5900e2d2ce95a23d6b3b2f1681b6f0f"

RPROVIDES:${PN} += "NetworkManager-pptp-frontend \
plasma-nm-pptp \
plasma-nm5-pptp \
plasma-nm5-pptp(aarch-64)"

RDEPENDS:${PN} += "NetworkManager-pptp \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libplasmanm_editor.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
plasma-nm5"

inherit rpm
