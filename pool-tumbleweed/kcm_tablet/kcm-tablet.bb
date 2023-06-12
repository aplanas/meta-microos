SUMMARY = "KDE Config Module for Wacom Tablets"
DESCRIPTION = "This module implements a GUI for the Wacom Linux Drivers and extends it \
with profile support to handle different button / pen layouts per profile. \
 \
For hardware support have a look at http://www.linuxwacom.sourceforge.net \
 \
All tablets can be set up as long as they are found with the wacom kernel module."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "kcm_tablet-3.2.0-5.7.aarch64.rpm"
RPM_HASH = "671de70db9d08a5c706ca0c9c46aba4405d8403b997f9e6fcc3d8c63f7ba9503366f34f024596a31b36df600735c1300d749546f67b15c5039bcd4b7cba2ec62"

RPROVIDES:${PN} += "application() \
application(kde_wacom_tabletfinder.desktop) \
kcm_tablet \
kcm_tablet(aarch-64) \
metainfo() \
metainfo(org.kde.plasma.wacomtablet.appdata.xml) \
metainfo(org.kde.wacomtablet.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwacom.so.9()(64bit) \
libwacom.so.9(LIBWACOM_2.0)(64bit) \
libxcb-xinput.so.0()(64bit) \
libxcb.so.1()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
xf86-input-wacom"

inherit rpm
