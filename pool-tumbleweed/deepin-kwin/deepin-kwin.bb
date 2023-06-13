SUMMARY = "Deepin Window Manager"
DESCRIPTION = "deepin-kWin is the window manager of the Deepin desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "5.25.0"

RPM_NAME = "deepin-kwin-5.25.0-1.2.aarch64.rpm"
RPM_HASH = "b38732709582832adeab7393e3ac84b641733d4c44c17718532b53cf75a5b79bb29f9209d83b06a068affd1aa156a1777dc63af2be30b156bf1e56837e1baf8d"

RPROVIDES:${PN} += "application() \
application(org.kde.deepin-kwin_rules_dialog.desktop) \
config(deepin-kwin) \
deepin-kwin \
deepin-kwin(aarch-64) \
deepin-kwin5 \
libKWinNightColorPlugin.so()(64bit) \
libdecorationplugin.so()(64bit) \
libdeepin-kcmkwincommon.so.5()(64bit) \
libdeepin-kwin.so.5()(64bit) \
libdeepin-kwineffects.so.13()(64bit) \
libdeepin-kwinglutils.so.13()(64bit) \
libdeepin-kwinxrenderutils.so.13()(64bit) \
libkdecorationprivatedeclarative.so()(64bit) \
libplastikplugin.so()(64bit) \
qt5qmlimport(org.deepin.kwin.decoration.0) \
qt5qmlimport(org.kde.kwin.decorations.plastik.1) \
qt5qmlimport(org.kde.kwin.private.kdecoration.1) \
windowmanager"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
Mesa-libEGL1 \
breeze5-decoration \
kdialog \
kirigami2 \
kitemmodels-imports \
ld-linux-aarch64.so.1()(64bit) \
libDWaylandClient.so.5()(64bit) \
libDWaylandServer.so.5()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5GlobalAccelPrivate.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IdleTime.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5WindowSystem5 \
libKF5XmlGui.so.5()(64bit) \
libKScreenLocker.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libQt5Multimedia5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libdrm.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libinput.so.10()(64bit) \
libkdecorations2.so.5()(64bit) \
libkdecorations2private.so.10()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libqaccessibilityclient-qt5.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwayland-egl.so.1()(64bit) \
libwayland-server.so.0()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-damage.so.0()(64bit) \
libxcb-glx.so.0()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
permissions \
plasma-framework \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtMultimedia.5) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.deepin.kwin.decoration.0) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kconfig.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kitemmodels.1) \
qt5qmlimport(org.kde.kquickcontrols.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.kwin.2) \
qt5qmlimport(org.kde.kwin.3) \
qt5qmlimport(org.kde.kwin.decorations.plastik.1) \
qt5qmlimport(org.kde.kwin.private.kdecoration.1) \
qt5qmlimport(org.kde.milou.0) \
qt5qmlimport(org.kde.newstuff.1) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2)"

inherit rpm
