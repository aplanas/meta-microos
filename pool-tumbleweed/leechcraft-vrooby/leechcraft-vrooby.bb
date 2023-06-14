SUMMARY = "LeechCraft Removable storage devices Manager"
DESCRIPTION = "This package provides a Vrooby plugin for LeechCraft \
which allows to watch removable storage devices via D-Bus and udisks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-vrooby-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "84517257f4e3c15b6b7cb294d885e979956a8769b381036a88a1e9a22762fe5ef5d4f0f878fc7d37602c11769c638fc45999553cbff81dde14fed0fba1a1ee45"

RPROVIDES:${PN} += "leechcraft-vrooby \
libleechcraft-vrooby.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1"

inherit rpm
