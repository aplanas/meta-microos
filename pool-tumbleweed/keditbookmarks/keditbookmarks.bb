SUMMARY = "KDE Bookmark Editor"
DESCRIPTION = "This is an editor to edit your KDE-wide bookmark set."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "keditbookmarks-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2e15f3f0f17ca7addb2ff5b2db18af6d4aba7462a0d34b20b8ddacf4128161139bfc0723de2346ec8cb6b1566d5215eb11b2cc4902fe3eedf148299f0f075d80"

RPROVIDES:${PN} += "keditbookmarks \
libkbookmarkmodel-private.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
