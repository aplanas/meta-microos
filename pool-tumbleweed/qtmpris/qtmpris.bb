SUMMARY = "Qt and QML MPRIS interface and adaptor"
DESCRIPTION = "MPRIS v.2 specification implementation for Qt and QML plugin."
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "qtmpris-1.0.6-2.8.aarch64.rpm"
RPM_HASH = "4c26108b2c7b61b492a9b5b82217621cfe07ab1acb8730bf4c4282299efdd34590762107bfae96c3c9950805486ac0f07b86aa9236cf689afcb3e45b6a3b67b4"

RPROVIDES:${PN} += "libmpris-qt5-qml-plugin.so \
qt5qmlimport-org.nemomobile.mpris.1 \
qtmpris"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmpris-qt5.so.1 \
libstdc++.so.6"

inherit rpm
