SUMMARY = "Additional Plasma5 Widgets"
DESCRIPTION = "Additional plasmoids from upstream for use on the Plasma workspace."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-addons-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "ffde8718c9b9f61f90423b924429b2bec077f53fe0a29639b84ce38694fde908748bf6acb1d8655bdf19a327d007ba5435628c63bd2ea8fe813d65a5c7c2c6b2"

RPROVIDES:${PN} += "libcolorpickerplugin.so \
libdictplugin.so \
libdiskquotaplugin.so \
libfifteenpuzzleplugin.so \
libmediaframeplugin.so \
libnightcolorcontrolplugin.so \
libnotesplugin.so \
libplasma-wallpaper-potdplugin.so \
libplasmacalendaralternatecalendarconfig.so \
libplasmacalendarastronomicaleventsconfig.so \
libplasmapotdprovidercore.so.1 \
libprofiles-qml-plugin.so \
libpurposeplugin.so \
libquicklaunchplugin.so \
libtimerplugin.so \
libweatherplugin.so \
plasma-addons \
plasma5-addons \
qt5qmlimport-org.kde.plasma.private.colorpicker.2 \
qt5qmlimport-org.kde.plasma.private.dict.1 \
qt5qmlimport-org.kde.plasma.private.diskquota.1 \
qt5qmlimport-org.kde.plasma.private.fifteenpuzzle.0 \
qt5qmlimport-org.kde.plasma.private.mediaframe.2 \
qt5qmlimport-org.kde.plasma.private.nightcolorcontrol.1 \
qt5qmlimport-org.kde.plasma.private.notes.0 \
qt5qmlimport-org.kde.plasma.private.profiles.1 \
qt5qmlimport-org.kde.plasma.private.purpose.1 \
qt5qmlimport-org.kde.plasma.private.quicklaunch.1 \
qt5qmlimport-org.kde.plasma.private.timer.0 \
qt5qmlimport-org.kde.plasma.private.weather.1 \
qt5qmlimport-org.kde.plasma.wallpapers.potd.1 \
qt5qmlimport-org.kde.plasmacalendar.alternatecalendarconfig.1 \
qt5qmlimport-org.kde.plasmacalendar.astronomicaleventsconfig.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CalendarEvents.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5Runner.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5UnitConversion.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
purpose \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Styles.Plasma.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrols.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.kwin.2 \
qt5qmlimport-org.kde.kwin.3 \
qt5qmlimport-org.kde.kwin.private.effects.1 \
qt5qmlimport-org.kde.kwindowsystem.1 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.colorpicker.2 \
qt5qmlimport-org.kde.plasma.private.dict.1 \
qt5qmlimport-org.kde.plasma.private.diskquota.1 \
qt5qmlimport-org.kde.plasma.private.fifteenpuzzle.0 \
qt5qmlimport-org.kde.plasma.private.mediaframe.2 \
qt5qmlimport-org.kde.plasma.private.nightcolorcontrol.1 \
qt5qmlimport-org.kde.plasma.private.notes.0 \
qt5qmlimport-org.kde.plasma.private.profiles.1 \
qt5qmlimport-org.kde.plasma.private.purpose.1 \
qt5qmlimport-org.kde.plasma.private.quicklaunch.1 \
qt5qmlimport-org.kde.plasma.private.sessions.2 \
qt5qmlimport-org.kde.plasma.private.timer.0 \
qt5qmlimport-org.kde.plasma.private.weather.1 \
qt5qmlimport-org.kde.plasma.wallpapers.potd.1 \
qt5qmlimport-org.kde.plasma.workspace.calendar.2 \
qt5qmlimport-org.kde.plasma.workspace.components.2 \
qt5qmlimport-org.kde.plasmacalendar.alternatecalendarconfig.1 \
qt5qmlimport-org.kde.plasmacalendar.astronomicaleventsconfig.1 \
qt5qmlimport-org.kde.purpose.1"

inherit rpm
