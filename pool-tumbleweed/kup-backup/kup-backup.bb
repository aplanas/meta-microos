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
kup-backup(aarch-64) \
libkdeinit5_kup-daemon.so()(64bit) \
metainfo() \
metainfo(org.kde.kup.appdata.xml) \
metainfo(org.kde.kupapplet.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IdleTime.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgit2.so.1.6()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
