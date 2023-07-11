SUMMARY = "Project Management Application"
DESCRIPTION = "Plan is the project management application of the Calligra Suite."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "calligra-plan-3.3.0-2.10.aarch64.rpm"
RPM_HASH = "9842f8e9f62d8b8580537a3d977fe1120888ddd965021bbe0be00ece399ac93c4cb08ac8734400f4b938a9f6ea5c792f5ff935e71c9782f19caece0f781d50b4"

RPROVIDES:${PN} += "calligra-plan \
config-calligra-plan \
libkdeinit5-calligraplan.so \
libkdeinit5-calligraplanwork.so \
libplankernel.so.18 \
libplankundo2.so.18 \
libplanmain.so.18 \
libplanmodels.so.18 \
libplanodf.so.18 \
libplanplugin.so.18 \
libplanprivate.so.18 \
libplanstore.so.18 \
libplantjscheduler.so \
libplanui.so.18 \
libplanwidgets.so.18 \
libplanwidgetutils.so.18 \
libplanworkfactory.so.18"

RDEPENDS:${PN} += "/sbin/ldconfig \
kcoreaddons \
ld-linux-aarch64.so.1 \
libKChart.so.2 \
libKF5Activities.so.5 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKGantt.so.2 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
