SUMMARY = "Mail Transport library for KDE PIM applications"
DESCRIPTION = "The Mail Transport library for KDE PIM functionality"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5MailTransport5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b327cc7e0c8f770a2186edb95c9620e5726f95b4226ca938def121c1182b6855efab63be6e82e84ace051bbbd5285eb63e81ac0c496a49d996c23e07406053d4"

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
