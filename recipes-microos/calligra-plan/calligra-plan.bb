SUMMARY = "Project Management Application"
DESCRIPTION = "Plan is the project management application of the Calligra Suite."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "calligra-plan-3.3.0-2.9.aarch64.rpm"
RPM_HASH = "2561fdb45b2256b5ef99706ddeeea15d958a4f0d50294c5a9c68297de3abf6997511f75902a75b748c922175343f1483c9af673a705a6d5eae29779acfbf465c"

RPROVIDES:${PN} += "application() \
application(org.kde.calligraplan.desktop) \
application(org.kde.calligraplanwork.desktop) \
calligra-plan \
calligra-plan(aarch-64) \
config(calligra-plan) \
libkdeinit5_calligraplan.so()(64bit) \
libkdeinit5_calligraplanwork.so()(64bit) \
libplankernel.so.18()(64bit) \
libplankundo2.so.18()(64bit) \
libplanmain.so.18()(64bit) \
libplanmodels.so.18()(64bit) \
libplanodf.so.18()(64bit) \
libplanplugin.so.18()(64bit) \
libplanprivate.so.18()(64bit) \
libplanstore.so.18()(64bit) \
libplantjscheduler.so()(64bit) \
libplanui.so.18()(64bit) \
libplanwidgets.so.18()(64bit) \
libplanwidgetutils.so.18()(64bit) \
libplanworkfactory.so.18()(64bit) \
metainfo() \
metainfo(org.kde.calligraplan.appdata.xml) \
mimehandler(application/x-vnd.kde.kplato.work) \
mimehandler(application/x-vnd.kde.plan) \
mimehandler(application/x-vnd.kde.plan.work)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kcoreaddons \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKChart.so.2()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKGantt.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libqca-qt5.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
