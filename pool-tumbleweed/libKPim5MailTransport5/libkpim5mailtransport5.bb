SUMMARY = "Mail Transport library for KDE PIM applications"
DESCRIPTION = "The Mail Transport library for KDE PIM functionality"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5MailTransport5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "73d2db3338b8bcad2f9a17322e1d0f7ff747d7a3bfc9e6d7384829b6f1668a3e653a1e1b5f83f5f9ce5a9c4a4bb68c3aafab2c617f1bacf85166ff4db53169da"

RPROVIDES:${PN} += "libKPim5MailTransport.so.5 \
libKPim5MailTransport5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmailtransport \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
