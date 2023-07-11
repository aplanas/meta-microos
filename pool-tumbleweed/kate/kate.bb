SUMMARY = "Advanced Text Editor"
DESCRIPTION = "Kate is an advanced text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kate-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "140a5c4bca108bef6a24495f568ec4e4546fd4c26fc773a5683bfa17bda8798d3277e88a4f1a6845a4364618117b0760eba1a3364338b3f60dd61ec05a4a9d55"

RPROVIDES:${PN} += "kate \
kate5 \
libkateprivate.so.23.04.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
kate-plugins \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
