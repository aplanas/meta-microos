SUMMARY = "Encryption Tool"
DESCRIPTION = "Kgpg is a simple GUI for gpg"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kgpg-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ac232c67e7ca299747fed629aef1e78973745e558cff0d91e8dcb88a799d27a55224e06b9e5bc73d419926f78a37b3c7c33805eea7c99f435494d3bdcfc71d8a"

RPROVIDES:${PN} += "config-kgpg \
kgpg"

RDEPENDS:${PN} += "gpg2 \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5ContactEditor.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
