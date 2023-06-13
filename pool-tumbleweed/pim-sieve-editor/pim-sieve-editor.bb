SUMMARY = "Sieve scripts editor for KDE PIM applications"
DESCRIPTION = "This package provides an editor, complete with syntax highlighting and \
command completion, to edit Sieve scripts ('server side filtering') \
in KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pim-sieve-editor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f38dcf87f7835760e54182e435ffb89fd4d20a8df864978bbb7d08e3cedc86e0850051361da8abe69edf2a4b2399f1ca9dafc34289a3d88ce2466a4304f806b8"

RPROVIDES:${PN} += "application() \
application(org.kde.sieveeditor.desktop) \
libsieveeditor.so.5()(64bit) \
metainfo() \
metainfo(org.kde.sieveeditor.appdata.xml) \
pim-sieve-editor \
pim-sieve-editor(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmail \
ld-linux-aarch64.so.1()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5KManageSieve.so.5()(64bit) \
libKPim5KSieveUi.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKUserFeedbackCore.so.1()(64bit) \
libKUserFeedbackWidgets.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
