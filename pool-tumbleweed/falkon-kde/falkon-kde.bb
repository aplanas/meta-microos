SUMMARY = "Plugin for tighter integration of KDE technologies"
DESCRIPTION = "Plugin for the Falkon browser that allows tighter integration of KDE technologies, \
such as storing passwords in KWallet."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "falkon-kde-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6ed08f6ac21e446c77ac0186bca89bdf68dbc638a7e6be43caae690e6ae0d0b47bbd6c061ffefdd0fae3254cb6de062adc2cb3f02e98dc640a6a9c8e63428cea"

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
