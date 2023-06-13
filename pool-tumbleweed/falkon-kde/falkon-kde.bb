SUMMARY = "Plugin for tighter integration of KDE technologies"
DESCRIPTION = "Plugin for the Falkon browser that allows tighter integration of KDE technologies, \
such as storing passwords in KWallet."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "falkon-kde-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a73d5cc522b6ee594c7a5d72cc0396112046147d47ec70500a1d6d15aed486829afc0a3412058d280fc5cb6fb2f2bbdbe1060425d3da270874af8b15bf725c63"

RPROVIDES:${PN} += "falkon-kde \
falkon-kde(aarch-64) \
falkon-kwallet \
qupzilla-kwallet"

RDEPENDS:${PN} += "falkon \
kwalletd5 \
ld-linux-aarch64.so.1()(64bit) \
libFalkonPrivate.so.3()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
