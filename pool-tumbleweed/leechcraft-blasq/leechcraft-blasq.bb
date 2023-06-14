SUMMARY = "LeechCraft Image storage Module"
DESCRIPTION = "This package provides a modular image storage plugin for LeechCraft \
which supports different cloud image stores like Picasa or Flickr."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-blasq-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "c8aed23644fde80917f88e5e94eed56120450a3e2bc25ce5bb15a68e058a8e311d4ea5adb083949cb0d56514361f6a09366654082d1a720b028c65a56fd9562a"

RPROVIDES:${PN} += "leechcraft-blasq \
libleechcraft-blasq.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-blasq-subplugin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
