SUMMARY = "LeechCraft Collection Checker Module"
DESCRIPTION = "This package provides a collection checker plugin for LeechCraft \
to check the completeness of collections."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-brainslugz-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b8058f7de89afd729fcd6a6338ba4333169c52ed89256a3fc580da8af5e0ea39c4ef90d772cd1db6fdea6c668da3fcf4905ad7ffcf5cfc8486e3c85bcb0b3328"

RPROVIDES:${PN} += "leechcraft-lmp-brainslugz \
libleechcraft-lmp-brainslugz.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
leechcraft-musiczombie \
leechcraft-scrobbler \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
