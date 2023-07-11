SUMMARY = "LeechCraft Azoth - VKontakte Module"
DESCRIPTION = "This package provides a special protocol subplugin for extensive VKontakte \
messaging support for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-murm-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "5193e58cc16108402656c2b9333c13c83083c17e1b23f836f827ebfcfeb050aa8127c007b7e8586d74a05d65fdcf153130eb85de4e730439ade81aace58a6b24"

RPROVIDES:${PN} += "leechcraft-azoth-murm \
leechcraft-azoth-protocolplugin \
libleechcraft-azoth-murm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-svcauth-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
