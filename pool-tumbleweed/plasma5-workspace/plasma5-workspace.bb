SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a Plasma workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-workspace-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "3b0b12bc284c9e5ea1904107d989e682826838b41daddf25589196362cd936284328de2af19db0747cab5220d4bd7c516473f560c9df67db98720f53d0cd455a"

RPROVIDES:${PN} += "config-plasma5-workspace \
dbus-org.freedesktop.Notifications \
kde-user-manager \
libappmenuplugin.so \
libcalendarplugin.so \
libcolorcorrectplugin.so \
libcontainmentlayoutmanagerplugin.so \
libdigitalclockplugin.so \
libholidayeventshelperplugin.so \
libkeyboardlayoutplugin.so \
libkfontinst.so.5 \
libkfontinstui.so.5 \
libkickerplugin.so \
liblookandfeelqmlplugin.so \
libmediacontrollerplugin.so \
libnotificationmanagerplugin.so \
libplasma-wallpaper-imageplugin.so \
libplasmashellprivateplugin.so \
libsessionsprivateplugin.so \
libtaskmanagerplugin.so \
libtrianglemousefilterplugin.so \
plasma5-workspace \
plasma5-workspace-branding \
plasma5-workspace-branding-upstream \
plasma5-workspace-zsh-completion \
qt5qmlimport-org.kde.colorcorrect.0 \
qt5qmlimport-org.kde.holidayeventshelperplugin.1 \
qt5qmlimport-org.kde.notificationmanager.1 \
qt5qmlimport-org.kde.plasma.lookandfeel.1 \
qt5qmlimport-org.kde.plasma.private.appmenu.1 \
qt5qmlimport-org.kde.plasma.private.containmentlayoutmanager.1 \
qt5qmlimport-org.kde.plasma.private.digitalclock.1 \
qt5qmlimport-org.kde.plasma.private.kicker.0 \
qt5qmlimport-org.kde.plasma.private.mediacontroller.1 \
qt5qmlimport-org.kde.plasma.private.sessions.2 \
qt5qmlimport-org.kde.plasma.private.shell.2 \
qt5qmlimport-org.kde.plasma.shell.2 \
qt5qmlimport-org.kde.plasma.wallpapers.image.2 \
qt5qmlimport-org.kde.plasma.workspace.calendar.1 \
qt5qmlimport-org.kde.plasma.workspace.calendar.2 \
qt5qmlimport-org.kde.plasma.workspace.components.2 \
qt5qmlimport-org.kde.plasma.workspace.dialogs.1 \
qt5qmlimport-org.kde.plasma.workspace.keyboardlayout.1 \
qt5qmlimport-org.kde.plasma.workspace.trianglemousefilter.1 \
qt5qmlimport-org.kde.taskmanager.0"

RDEPENDS:${PN} += "/usr/bin/sh \
accountsservice \
awk \
breeze \
cpp \
drkonqi5 \
frameworkintegration-plugin \
gmenudbusmenuproxy \
kactivitymanagerd \
kde-cli-tools5 \
kded \
kdelibs4support \
kglobalaccel5 \
kinit \
knewstuff-imports \
kquickcharts \
kscreen5 \
kscreenlocker \
ksystemstats5 \
kuserfeedback-imports \
kwin5 \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.2 \
libICE.so.6 \
libKF5Activities.so.5 \
libKF5ActivitiesStats.so.1 \
libKF5Archive.so.5 \
libKF5AuthCore.so.5 \
libKF5Baloo.so.5 \
libKF5Bookmarks.so.5 \
libKF5CalendarEvents.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5Declarative.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5IdleTime.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KExiv2.so.15.0.0 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Package.so.5 \
libKF5Parts.so.5 \
libKF5People.so.5 \
libKF5PeopleWidgets.so.5 \
libKF5Plasma.so.5 \
libKF5PlasmaQuick.so.5 \
libKF5Prison.so.5 \
libKF5QuickAddons.so.5 \
libKF5Runner.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WaylandClient.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPipeWire.so.5 \
libKScreenLocker.so.5 \
libKSysGuardSensorFaces.so.1 \
libKUserFeedbackCore.so.1 \
libLayerShellQtInterface.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libSM.so.6 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXft.so.2 \
libXrender.so.1 \
libc.so.6 \
libcolorcorrect.so.5 \
libcrypt.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgps.so.30 \
libicui18n.so.73 \
libicuuc.so.73 \
libkrdb.so \
libkscreen2-plugin \
libksgrd.so.9 \
libkworkspace5.so.5 \
libm.so.6 \
libnotificationmanager.so.1 \
libphonon4qt5.so.4 \
libplasma-geolocation-interface.so.5 \
libprocesscore.so.9 \
libprocessui.so.9 \
libqalculate.so.22 \
libqt5-qdbus \
libqt5-qtpaths \
libqt5-qtquickcontrols \
libstdc++.so.6 \
libtaskmanager.so.6 \
libwayland-client.so.0 \
libweather-ion.so.7 \
libxcb-image.so.0 \
libxcb-randr.so.0 \
libxcb.so.1 \
libz.so.1 \
milou5 \
plasma-framework \
plasma-framework-components \
plasma5-workspace-libs \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.activities.0 \
qt5qmlimport-org.kde.colorcorrect.0 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.holidayeventshelperplugin.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kconfig.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kholidays.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrols.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.ksysguard.faces.1 \
qt5qmlimport-org.kde.ksysguard.sensors.1 \
qt5qmlimport-org.kde.kwin.2 \
qt5qmlimport-org.kde.kwindowsystem.1 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.notificationmanager.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.lookandfeel.1 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.wallpapers.image.2 \
qt5qmlimport-org.kde.plasma.workspace.calendar.2 \
qt5qmlimport-org.kde.plasma.workspace.components.2 \
qt5qmlimport-org.kde.plasma.workspace.dialogs.1 \
qt5qmlimport-org.kde.plasma.workspace.keyboardlayout.1 \
qt5qmlimport-org.kde.prison.1 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.taskmanager.0 \
qt5qmlimport-org.kde.userfeedback.1 \
solid-imports \
xembedsniproxy \
xprop \
xrdb \
xsetroot"

inherit rpm
