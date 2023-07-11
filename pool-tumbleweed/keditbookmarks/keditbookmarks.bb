SUMMARY = "KDE Bookmark Editor"
DESCRIPTION = "This is an editor to edit your KDE-wide bookmark set."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "keditbookmarks-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "38b70044aa4b53cc36766e9da3a8c4aa27e7bc0d6a2911fa9e1ff7e7ff5ab283fc8ab82a1d54495ac50e809cc3e67bcd1a534f9a9c2cde6c4b6960ca13a4b238"

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
