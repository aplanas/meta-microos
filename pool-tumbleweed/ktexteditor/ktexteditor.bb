SUMMARY = "Embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "ktexteditor-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "563322abe63bbe35f659ef8f537bbf822ae63b622ad0bf97e7a2296959321f40afc60c38d80f71228aa45d4d0eeb9d5ed97857552f40203a62ad34e134a7b48a"

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
