SUMMARY = "QT bindings for GSettings"
DESCRIPTION = "Qt/QML bindings for GSettings."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "gsettings-qt-0.2-1.9.aarch64.rpm"
RPM_HASH = "96cdb59f73b36400974d2aaf787d4d6ccf14413dd66afea4844d18a7c39021c26e53cf8c78a09607f447a486bccbf1121a3786a5aede4cee1db4eb6d4b7c69ce"

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
