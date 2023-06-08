SUMMARY = "Plugin for tighter integration of KDE technologies"
DESCRIPTION = "Plugin for the Falkon browser that allows tighter integration of KDE technologies, \
such as storing passwords in KWallet."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "falkon-kde-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bd17958d8697ea43bc7b86ed9c19f343dd66191bf680544a7bb06da116d59be810c12def022d3e2ecb3a6968e8cef416355484efd91cb88ee11c763d1811f6ae"

RPROVIDES:${PN} += "falkon-kde falkon-kde(aarch-64) falkon-kwallet qupzilla-kwallet"
RDEPENDS:${PN} += "falkon kwalletd5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFalkonPrivate.so.3()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Purpose.so.5()(64bit) libKF5PurposeWidgets.so.5()(64bit) libKF5Wallet.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
