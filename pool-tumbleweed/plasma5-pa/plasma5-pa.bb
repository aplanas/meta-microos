SUMMARY = "The Plasma5 Volume Manager"
DESCRIPTION = "A volume manager plasmoid superseding kmix."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-pa-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fa65d1aa9c8af41ac73b24f985d7c080a7fb8513e35f3727023a1aba181fffd3a94e8cb72d27d7ec83c9eade019c97b9a979363381304f4b7c10c97829d3888a"

RPROVIDES:${PN} += "libplasma-volume-declarative.so \
plasma5-pa \
qt5qmlimport-org.kde.plasma.private.volume.0 \
qt5qmlimport-org.kde.plasma.private.volume.1"

RDEPENDS:${PN} += "/usr/bin/perl \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcanberra.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.volume.0"

inherit rpm
