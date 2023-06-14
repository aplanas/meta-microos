SUMMARY = "LeechCraft Launcher Module"
DESCRIPTION = "This package provides a third-party application launcher plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-launchy-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "bda8e5dd52caf4f9d5ee98ce6e33eb6c7148e14d6b120a97144aa4e9bf252e2642e0764523e0631996432bdf6426b5fb8ca345307c56360055f4a1d52416df3b"

RPROVIDES:${PN} += "leechcraft-launchy \
libleechcraft-launchy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xdg-qt5.so.0.6.75 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
