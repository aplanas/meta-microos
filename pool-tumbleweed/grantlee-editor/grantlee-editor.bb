SUMMARY = "Messageviewer header theme editor based on Grantlee"
DESCRIPTION = "A theme editor for messageviewer based on Grantlee. Once created or modified, \
the themes can be used in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "grantlee-editor-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0cd2e39e7b940e9f667d11d079fac6b764ecced59d4b3165ac0ee062283f9038c1767929e79c52e9bb8e2a73931d59ed970280adf9e438a6f8fc413e625ccc3c"

RPROVIDES:${PN} += "grantlee-editor \
libgrantleethemeeditor.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kaddressbook \
kmail-application-icons \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5Mime.so.5 \
libKPim5PimCommon.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
