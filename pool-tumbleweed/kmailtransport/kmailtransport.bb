SUMMARY = "KDE PIM Libraries: Mailtransport layer"
DESCRIPTION = "This package contains library to provide mailtransport functionality for \
KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmailtransport-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "45cbb04530732fbb88c331f236e898e8c98033685421713da00fdbd56372cfa0ef858020dcfb3cc22801e29b04cab7157ca26b219640bfda8f5c299e8c537d24"

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
