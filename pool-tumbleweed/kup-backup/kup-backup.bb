SUMMARY = "Backup scheduler for the Plasma desktop"
DESCRIPTION = "Kup is created for helping people to keep up-to-date backups of their personal files. \
Connecting a USB hard drive is the primary supported way to store files, but saving \
files to a server over a network connection is also possible for advanced users. \
 \
When you plug in your external hard drive Kup will automatically start copying your \
latest changes, but of course it will only do so if you have been active on your \
computer for some number of hours since the last time you took a backup (and it can \
of course ask you first, before copying anything). In general Kup tries to not \
disturb you needlessly."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "kup-backup-0.9.1-2.5.aarch64.rpm"
RPM_HASH = "a05f8cc0250799b2861389a2c524fae0912ef6575a83e9878303684ae82acc83d9784d71368ce87bfbcb8cf5e8db9b32ad77ce0b31b0135504b0939425a7730d"

RPROVIDES:${PN} += "kup-backup \
libkdeinit5-kup-daemon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Plasma.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgit2.so.1.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
