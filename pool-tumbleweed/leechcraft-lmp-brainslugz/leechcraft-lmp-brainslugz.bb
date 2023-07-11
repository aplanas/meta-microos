SUMMARY = "LeechCraft Collection Checker Module"
DESCRIPTION = "This package provides a collection checker plugin for LeechCraft \
to check the completeness of collections."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-brainslugz-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "b760460bb65d5a8d1c2f14c09ba330654ed58a3f30f75e9d118d33e927d423e13cc7c10560718746bde428687587d0ff9b253ee08fd12ef6f56d4770ac09a4c7"

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
