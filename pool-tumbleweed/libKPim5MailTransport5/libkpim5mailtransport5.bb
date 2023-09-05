SUMMARY = "Mail Transport library for KDE PIM applications"
DESCRIPTION = "The Mail Transport library for KDE PIM functionality"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5MailTransport5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "085ada494f4ed0c12560ff1b58dd9ae1c0b55196da31d40cf13cbe5cfc91632b3812424a46869531d4e82a86333f80a34e6c5b99f41433b436198196285b5075"

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
