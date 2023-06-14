SUMMARY = "Encryption Tool"
DESCRIPTION = "Kgpg is a simple GUI for gpg"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kgpg-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "003229645d21768684d026845150522444b76b53d0ec5a7c460ae6ac85190540fc8da7a4219fc95d0f6e1d97751155769f5ae69558b98a677b62e6df0d34218b"

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
