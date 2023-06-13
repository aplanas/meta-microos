SUMMARY = "Database Application"
DESCRIPTION = "Kexi is a visual database applications creator, competing with \
programs like MS Access or Filemaker."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GFDL-1.2-only"

PV = "3.2.0"

RPM_NAME = "kexi-3.2.0-8.8.aarch64.rpm"
RPM_HASH = "a874d33109a4bd046513261d82e4275d9d9c1cef73e66dcf34245e388ee2840d1d5d9d8b1cdaa91788fdf6d38f74af43b1133fe46f419574aa025466814e6d7a"

RPROVIDES:${PN} += "application() \
application(org.kde.kexi-3.2.desktop) \
calligra-kexi \
kexi \
kexi(aarch-64) \
libkexicore3.2.so.3.2()(64bit) \
libkexidatatable3.2.so.3.2()(64bit) \
libkexidataviewcommon3.2.so.3.2()(64bit) \
libkexiextendedwidgets3.2.so.3.2()(64bit) \
libkexiformutils3.2.so.3.2()(64bit) \
libkexiguiutils3.2.so.3.2()(64bit) \
libkeximain3.2.so.3.2()(64bit) \
libkeximigrate3.2.so.3.2()(64bit) \
libkexirelationsview3.2.so.3.2()(64bit) \
libkexiundo3.2.so.3.2()(64bit) \
libkexiutils3.2.so.3.2()(64bit) \
libkformdesigner3.2.so.3.2()(64bit) \
metainfo() \
metainfo(org.kde.kexi-3.2.appdata.xml) \
mimehandler(application/vnd.oasis.opendocument.database) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/x-kexi-connectiondata) \
mimehandler(application/x-kexiproject-shortcut) \
mimehandler(application/x-kexiproject-sqlite) \
mimehandler(application/x-kexiproject-sqlite3) \
mimehandler(application/x-msaccess) \
mimehandler(application/x-sqlite3) \
mimehandler(text/csv) \
mimehandler(text/tab-separated-values)"

RDEPENDS:${PN} += "(breeze5-icons-rcc or breeze5-icons < 5.78.0) \
/sbin/ldconfig \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libKDb3.so.4()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPropertyCore3.so.4()(64bit) \
libKPropertyWidgets3.so.4()(64bit) \
libKReport3.so.4()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
