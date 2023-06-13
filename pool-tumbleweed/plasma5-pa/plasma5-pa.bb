SUMMARY = "The Plasma5 Volume Manager"
DESCRIPTION = "A volume manager plasmoid superseding kmix."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-pa-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fa65d1aa9c8af41ac73b24f985d7c080a7fb8513e35f3727023a1aba181fffd3a94e8cb72d27d7ec83c9eade019c97b9a979363381304f4b7c10c97829d3888a"

RPROVIDES:${PN} += "application() \
application(kcm_pulseaudio.desktop) \
libplasma-volume-declarative.so()(64bit) \
metainfo() \
metainfo(org.kde.plasma.volume.appdata.xml) \
plasma5-pa \
plasma5-pa(aarch-64) \
qt5qmlimport(org.kde.plasma.private.volume.0) \
qt5qmlimport(org.kde.plasma.private.volume.1)"

RDEPENDS:${PN} += "(pulseaudio-module-x11 or pipewire-pulseaudio) \
/usr/bin/perl \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcanberra.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kcoreaddons.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
qt5qmlimport(org.kde.plasma.private.volume.0)"

inherit rpm
