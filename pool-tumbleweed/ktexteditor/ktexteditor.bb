SUMMARY = "Embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "ktexteditor-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a7c2c3302c6c7cc700d94d01b9c105952bc54e2aa9c705e747e98db84a1612ed8baf3c35ab630e7b6625bbea344fbf2da1d206b6c930bb4dab3ea9384857adcd"

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
