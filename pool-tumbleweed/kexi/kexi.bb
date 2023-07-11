SUMMARY = "Database Application"
DESCRIPTION = "Kexi is a visual database applications creator, competing with \
programs like MS Access or Filemaker."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GFDL-1.2-only"

PV = "3.2.0"

RPM_NAME = "kexi-3.2.0-8.9.aarch64.rpm"
RPM_HASH = "e1c98d313a32df71b7dc7264d24bb13a23e602009e7459f45bd7b29613db5728d5f218a45cb66ba7d0e859c6f03ccc942f6742c0ecd688a4423cf0fb487dd1e4"

RPROVIDES:${PN} += "calligra-kexi \
kexi \
libkexicore3.2.so.3.2 \
libkexidatatable3.2.so.3.2 \
libkexidataviewcommon3.2.so.3.2 \
libkexiextendedwidgets3.2.so.3.2 \
libkexiformutils3.2.so.3.2 \
libkexiguiutils3.2.so.3.2 \
libkeximain3.2.so.3.2 \
libkeximigrate3.2.so.3.2 \
libkexirelationsview3.2.so.3.2 \
libkexiundo3.2.so.3.2 \
libkexiutils3.2.so.3.2 \
libkformdesigner3.2.so.3.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKDb3.so.4 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPropertyCore3.so.4 \
libKPropertyWidgets3.so.4 \
libKReport3.so.4 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
