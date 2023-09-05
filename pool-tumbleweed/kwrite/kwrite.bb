SUMMARY = "KDE Text Editor"
DESCRIPTION = "KWrite is a text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "kwrite-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b9a881c9bf147f771cf11a9fff7ed8c6fc29f32837b823687970cbeace4708295d47b88cb1800f5c305d34a884aa1d0cb73d58eae8ae3739191ce0b77de28575"

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
libkateprivate.so.23.08.0"

inherit rpm
