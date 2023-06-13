SUMMARY = "Spreadsheet Application"
DESCRIPTION = "Sheets is the spreadsheet application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-sheets-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "fe7f6cb0d0dcb0ffef3c5d0548044bceeaf71edcb301bdb285e7688ced32dd4c71ea6bc2c5b1cfd3b13ec64146fb5f9d357148c62629f0c09827f011f9564558"

RPROVIDES:${PN} += "application() \
application(org.kde.calligrasheets.desktop) \
calligra-sheets \
calligra-sheets(aarch-64) \
libcalligrasheetscommon.so.17()(64bit) \
libcalligrasheetsodf.so.17()(64bit) \
libkdeinit5_calligrasheets.so()(64bit) \
metainfo() \
metainfo(org.kde.calligrasheets.appdata.xml) \
mimehandler(application/vnd.ms-excel) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet) \
mimehandler(application/vnd.openxmlformats-officedocument.spreadsheetml.sheet) \
mimehandler(application/vnd.openxmlformats-officedocument.spreadsheetml.template) \
mimehandler(application/x-kspread) \
mimehandler(application/x-quattropro) \
mimehandler(text/csv)"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KDELibs4Support.so.5()(64bit) \
libKF5KHtml.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5KrossCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libflake.so.17()(64bit) \
libgcc_s.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libkokross.so.17()(64bit) \
libkomain.so.17()(64bit) \
libkomsooxml.so.17()(64bit) \
libkoodf.so.17()(64bit) \
libkoodf2.so.17()(64bit) \
libkoplugin.so.17()(64bit) \
libkostore.so.17()(64bit) \
libkotext.so.17()(64bit) \
libkoversion.so.17()(64bit) \
libkowidgets.so.17()(64bit) \
libkowidgetutils.so.17()(64bit) \
libkundo2.so.17()(64bit) \
libm.so.6()(64bit) \
libpigmentcms.so.17()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
