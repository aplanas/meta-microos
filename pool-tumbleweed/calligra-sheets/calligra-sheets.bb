SUMMARY = "Spreadsheet Application"
DESCRIPTION = "Sheets is the spreadsheet application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-sheets-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "33aa47e194c8529ab9a08efad126101a5511d692fea5939732a1fc68a0cb52cde9c98f5094b9c58b17760eca4c1de7deae23fafbf226f120ce6a643d8c0b10ba"

RPROVIDES:${PN} += "calligra-sheets \
libcalligrasheetscommon.so.17 \
libcalligrasheetsodf.so.17 \
libkdeinit5-calligrasheets.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KHtml.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5KrossCore.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libflake.so.17 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libkokross.so.17 \
libkomain.so.17 \
libkomsooxml.so.17 \
libkoodf.so.17 \
libkoodf2.so.17 \
libkoplugin.so.17 \
libkostore.so.17 \
libkotext.so.17 \
libkoversion.so.17 \
libkowidgets.so.17 \
libkowidgetutils.so.17 \
libkundo2.so.17 \
libm.so.6 \
libpigmentcms.so.17 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
