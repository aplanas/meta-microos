SUMMARY = "Oxygen's KWin decoration"
DESCRIPTION = "This package contains the libraries Oxygen's KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "oxygen5-decoration-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "7667d4a48b76d18dcedbb24533f126a46b1121e6982c4ca0a5c3f4f958252d6aef811f6e69793eaf9670cce37a3d9bf3b754f610040355487b477792c56d46e1"

RPROVIDES:${PN} += "oxygen-decoration5 \
oxygen5-decoration \
oxygen5-decoration(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libkdecorations2.so.5()(64bit) \
liboxygenstyle5.so.5()(64bit) \
liboxygenstyleconfig5.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
