SUMMARY = "KDE Window Manager"
DESCRIPTION = "KWin is the window manager of the K desktop environment."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "kwin5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "b0db7cd7aa54edd250b071aaf42cdf151005fa2ed8bab5eebb37c5a900f508e1526b3fd70e4262e95654c5d518bb2e62ee16e7ce4b9c9d72079d708146d24fd3"

RPROVIDES:${PN} += "kwin5 \
libKWinNightColorPlugin.so \
libdecorationplugin.so \
libeffectsplugin.so \
libkcmkwincommon.so.5 \
libkdecorationprivatedeclarative.so \
libkwin.so.5 \
libkwineffects.so.14 \
libkwinglutils.so.14 \
libplastikplugin.so \
qt5qmlimport-org.kde.kwin.2 \
qt5qmlimport-org.kde.kwin.3 \
qt5qmlimport-org.kde.kwin.decoration.0 \
qt5qmlimport-org.kde.kwin.decorations.plastik.1 \
qt5qmlimport-org.kde.kwin.private.effects.1 \
qt5qmlimport-org.kde.kwin.private.kdecoration.1 \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
Mesa-libEGL1 \
breeze5-decoration \
kdialog \
kirigami2 \
kitemmodels-imports \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libKF5Activities.so.5 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GlobalAccelPrivate.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5KCMUtils.so.5 \
libKF5KCMUtilsCore.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5WindowSystem5 \
libKF5XmlGui.so.5 \
libKScreenLocker.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Multimedia5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11-xcb.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libinput.so.10 \
libkdecorations2.so.5 \
libkdecorations2private.so.10 \
liblcms2.so.2 \
libm.so.6 \
libpipewire-0.3.so.0 \
libqaccessibilityclient-qt5.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-cursor.so.0 \
libxcb-damage.so.0 \
libxcb-glx.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxcvt.so.0 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
permissions \
plasma-framework \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcmutils.1 \
qt5qmlimport-org.kde.kconfig.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrols.2 \
qt5qmlimport-org.kde.kwin.2 \
qt5qmlimport-org.kde.kwin.3 \
qt5qmlimport-org.kde.kwin.decoration.0 \
qt5qmlimport-org.kde.kwin.decorations.plastik.1 \
qt5qmlimport-org.kde.kwin.private.effects.1 \
qt5qmlimport-org.kde.kwin.private.kdecoration.1 \
qt5qmlimport-org.kde.milou.0 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

inherit rpm
