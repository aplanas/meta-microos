SUMMARY = "LeechCraft Text and Images Handler Module"
DESCRIPTION = "This package provides a Leechcraft quark handling text and images \
dropped on it. \
 \
The dropped data is then sent to a data filter chosen by the user. \
See more at http://leechcraft.org/concepts-data-filters ."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-ooronee-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "ff0e1dbe013380c20377f74c5933398bd1259e7432a1c9d6496b4b339353fdfab4099bdb76e0a52cfe3c7bb45c59092e6faabeebbc1cbdece3f016ab8c3b3d46"

RPROVIDES:${PN} += "leechcraft-ooronee \
libleechcraft-ooronee.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
