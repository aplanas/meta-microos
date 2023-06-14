SUMMARY = "KDE Bookmark Editor"
DESCRIPTION = "This is an editor to edit your KDE-wide bookmark set."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "keditbookmarks-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b7212ef856dd85aab5e5711462619159f193cf4fcdd383c44542c1a6b2b547464e59e06de3571831ff2ed63d169b0b86398287667902e7b9f4c681757bb4d1ee"

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
