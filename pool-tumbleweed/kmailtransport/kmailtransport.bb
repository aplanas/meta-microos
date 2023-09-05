SUMMARY = "KDE PIM Libraries: Mailtransport layer"
DESCRIPTION = "This package contains library to provide mailtransport functionality for \
KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmailtransport-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "aa0efb51e2a6385e5541d9f6932414a3f3ac5a09b777c01608934d34f37a6867c06b2b71f1f7fb2c482b72a350219b92199248fc89842f07021b1defddf2b762"

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
libKPim5GAPICore.so.5 \
libKPim5MailTransport.so.5 \
libKPim5SMTP.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
