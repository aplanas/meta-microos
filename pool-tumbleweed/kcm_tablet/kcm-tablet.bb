SUMMARY = "KDE Config Module for Wacom Tablets"
DESCRIPTION = "This module implements a GUI for the Wacom Linux Drivers and extends it \
with profile support to handle different button / pen layouts per profile. \
 \
For hardware support have a look at http://www.linuxwacom.sourceforge.net \
 \
All tablets can be set up as long as they are found with the wacom kernel module."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "kcm_tablet-3.2.0-5.8.aarch64.rpm"
RPM_HASH = "9c861f8c988ae4cc8e0b09f57a02ac538cc68d06b0b577b16e610e790506837cf244120131ff8c5a75403cefa7a418657474d3ae49a8ef9cc34d96494e22bd05"

RPROVIDES:${PN} += "kcm-tablet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Plasma.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libXi.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwacom.so.9 \
libxcb-xinput.so.0 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
xf86-input-wacom"

inherit rpm
