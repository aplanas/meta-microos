SUMMARY = "Sieve scripts editor for KDE PIM applications"
DESCRIPTION = "This package provides an editor, complete with syntax highlighting and \
command completion, to edit Sieve scripts ('server side filtering') \
in KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pim-sieve-editor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f38dcf87f7835760e54182e435ffb89fd4d20a8df864978bbb7d08e3cedc86e0850051361da8abe69edf2a4b2399f1ca9dafc34289a3d88ce2466a4304f806b8"

RPROVIDES:${PN} += "libsieveeditor.so.5 \
pim-sieve-editor"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmail \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5KManageSieve.so.5 \
libKPim5KSieveUi.so.5 \
libKPim5MailTransport.so.5 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
