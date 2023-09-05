SUMMARY = "Plugin for tighter integration of KDE technologies"
DESCRIPTION = "Plugin for the Falkon browser that allows tighter integration of KDE technologies, \
such as storing passwords in KWallet."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "falkon-kde-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e19de1fd492fcfa7cb151c4096dd1a2b1ee4e66132554fa8a5c6c066e7c0388aa1c452486d40d629f6daaecee2d97af6da1d3ccfa278e6bd9905cbf9f10a4c6a"

RPROVIDES:${PN} += "falkon-kde \
falkon-kwallet \
qupzilla-kwallet"

RDEPENDS:${PN} += "falkon \
kwalletd5 \
ld-linux-aarch64.so.1 \
libFalkonPrivate.so.3 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5JobWidgets.so.5 \
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
