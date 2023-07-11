SUMMARY = "QT bindings for GSettings"
DESCRIPTION = "Qt/QML bindings for GSettings."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "gsettings-qt-0.2-1.10.aarch64.rpm"
RPM_HASH = "8996bbb8fca4a57b7c600dd31a13d1c2d440fc94ff0992be53a222623956dd7efdf8994b4de2889b5a6477ba4155b1223c4c3748aec8290b5006b237fedf1315"

RPROVIDES:${PN} += "gsettings-qt \
libGSettingsQmlPlugin.so \
qt5qmlimport-GSettings.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libstdc++.so.6"

inherit rpm
