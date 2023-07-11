SUMMARY = "LeechCraft Removable storage devices Manager"
DESCRIPTION = "This package provides a Vrooby plugin for LeechCraft \
which allows to watch removable storage devices via D-Bus and udisks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-vrooby-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "0c4691c61d374d311278e760c92046178e898a8037f247bfb1608096c314d6e22012dbe75fb34ec47990efd2465833ecfd353f96d1402a9fbd13215de6bec800"

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
