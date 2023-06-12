SUMMARY = "Mail Transport library for KDE PIM applications"
DESCRIPTION = "The Mail Transport library for KDE PIM functionality"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5MailTransport5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "73d2db3338b8bcad2f9a17322e1d0f7ff747d7a3bfc9e6d7384829b6f1668a3e653a1e1b5f83f5f9ce5a9c4a4bb68c3aafab2c617f1bacf85166ff4db53169da"

RPROVIDES:${PN} += "libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransport5 \
libKPim5MailTransport5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kmailtransport \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
