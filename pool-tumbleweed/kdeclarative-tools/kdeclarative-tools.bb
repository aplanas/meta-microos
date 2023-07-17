SUMMARY = "KDeclarative tools"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdeclarative-tools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "56aeafb8dad0fcbaafe42463fb282122613ec5eb573bed4ca92cabc74a42ee84067fc85430f20d16afdf43fb6819dd89c8e5fa252fda98fa7d4cb8747e336783"

RPROVIDES:${PN} += "kdeclarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
