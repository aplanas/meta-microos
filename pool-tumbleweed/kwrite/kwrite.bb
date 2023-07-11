SUMMARY = "KDE Text Editor"
DESCRIPTION = "KWrite is a text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kwrite-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "540462c69f0a8f70b2641272ec77b62f1e84e0c3826153adaf5dec720baa511a4e12f52a327782a4b8a6ca8fdbbb27124fc1f8096032384f0e64b260e51b1dcc"

RPROVIDES:${PN} += "kwrite"

RDEPENDS:${PN} += "kate-plugins \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkateprivate.so.23.04.3"

inherit rpm
