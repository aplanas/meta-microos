SUMMARY = "Deepin Window Manager"
DESCRIPTION = "deepin-kWin is the window manager of the Deepin desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "5.25.0"

RPM_NAME = "deepin-kwin-5.25.0-1.2.aarch64.rpm"
RPM_HASH = "b38732709582832adeab7393e3ac84b641733d4c44c17718532b53cf75a5b79bb29f9209d83b06a068affd1aa156a1777dc63af2be30b156bf1e56837e1baf8d"

RPROVIDES:${PN} += "config-deepin-kwin \
deepin-kwin \
deepin-kwin5 \
libKWinNightColorPlugin.so \
libdecorationplugin.so \
libdeepin-kcmkwincommon.so.5 \
libdeepin-kwin.so.5 \
libdeepin-kwineffects.so.13 \
libdeepin-kwinglutils.so.13 \
libdeepin-kwinxrenderutils.so.13 \
libkdecorationprivatedeclarative.so \
libplastikplugin.so \
qt5qmlimport-org.deepin.kwin.decoration.0 \
qt5qmlimport-org.kde.kwin.decorations.plastik.1 \
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
libDWaylandClient.so.5 \
libDWaylandServer.so.5 \
libKF5Activities.so.5 \
libKF5AuthCore.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5Declarative.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GlobalAccelPrivate.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5KCMUtils.so.5 \
libKF5NewStuff.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
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
libXtst.so.6 \
libc.so.6 \
libcap.so.2 \
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
libwayland-egl.so.1 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-cursor.so.0 \
libxcb-damage.so.0 \
libxcb-glx.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
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
qt5qmlimport-org.deepin.kwin.decoration.0 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kconfig.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrols.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.kwin.2 \
qt5qmlimport-org.kde.kwin.3 \
qt5qmlimport-org.kde.kwin.decorations.plastik.1 \
qt5qmlimport-org.kde.kwin.private.kdecoration.1 \
qt5qmlimport-org.kde.milou.0 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2"

inherit rpm
