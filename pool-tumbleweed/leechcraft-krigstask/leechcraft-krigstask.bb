SUMMARY = "LeechCraft Applications Switcher Module"
DESCRIPTION = "This package provides an applications switcher quark for LeechCraft SB2."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-krigstask-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "8afd02b9b4986f09a9b849b649b0e583d563813fa6f5e27682194918c6d96301158a77b54defafb8765930df22b93e16eb195bf7c996f85f9aaf879d089c34cf"

RPROVIDES:${PN} += "leechcraft-krigstask \
libleechcraft-krigstask.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libXcomposite.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-x11-qt5.so.0.6.75 \
libstdc++.so.6 \
libxcb-composite.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
