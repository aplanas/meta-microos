SUMMARY = "Embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "ktexteditor-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "f10ede600ba8158e5fe5e0c0bc4f57f9fc5835a4d456c2e35213316e2cef5082d4fff411ac982904b7cca914f590f9530fc4aa53f78e985901fc2fbf97f51d2c"

RPROVIDES:${PN} += "ktexteditor \
libKF5TextEditor.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libeditorconfig.so.0 \
libm.so.6 \
libstdc++.so.6 \
syntax-highlighting"

inherit rpm
