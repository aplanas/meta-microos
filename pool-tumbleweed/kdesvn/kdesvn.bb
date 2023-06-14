SUMMARY = "KDE Subversion Client"
DESCRIPTION = "kdesvn is a GUI client for subversion repositories."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "kdesvn-2.1.0-1.21.aarch64.rpm"
RPM_HASH = "f4eadf462f4a64620c23501735379da338616e40bfc40e3a23b43f05bf1bf673e1e490f1c7ac7bb02d7b5de0e312651eb1b25dcd84bfd6397b3abb9e0257df93"

RPROVIDES:${PN} += "kde4-kdesvn \
kdesvn"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0"

inherit rpm
