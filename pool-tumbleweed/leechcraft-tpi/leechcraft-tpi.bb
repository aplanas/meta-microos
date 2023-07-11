SUMMARY = "LeechCraft Task Progress Indicator Module"
DESCRIPTION = "This package provides a Task Progress Indicator quark plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tpi-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "e575f7b87f3fc40801985b34f086f08ad965c118ad2c05c30304a859aabba2635fc4cfd0328845c5d7351e052fb31ba71fbdda93210e06b34a1e0b80f696ce41"

RPROVIDES:${PN} += "leechcraft-tpi \
libleechcraft-tpi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
