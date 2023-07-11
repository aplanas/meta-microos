SUMMARY = "KDE PIM Libraries: Mailtransport layer"
DESCRIPTION = "This package contains library to provide mailtransport functionality for \
KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmailtransport-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a7cd043690ce04ed46a21a0d1b4ebc73d8bdcf3147ed68e60a26599ea8d5e881bb0d13d0513c9f0035f0297b85fa9a85b0b0f5b1c18aa726d5462c996b2dcf1c"

RPROVIDES:${PN} += "kmailtransport"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5GAPICore.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5Mime.so.5 \
libKPim5SMTP.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
