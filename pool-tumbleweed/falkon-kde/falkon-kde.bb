SUMMARY = "Plugin for tighter integration of KDE technologies"
DESCRIPTION = "Plugin for the Falkon browser that allows tighter integration of KDE technologies, \
such as storing passwords in KWallet."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "falkon-kde-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a73d5cc522b6ee594c7a5d72cc0396112046147d47ec70500a1d6d15aed486829afc0a3412058d280fc5cb6fb2f2bbdbe1060425d3da270874af8b15bf725c63"

RPROVIDES:${PN} += "falkon-kde \
falkon-kwallet \
qupzilla-kwallet"

RDEPENDS:${PN} += "falkon \
kwalletd5 \
ld-linux-aarch64.so.1 \
libFalkonPrivate.so.3 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
