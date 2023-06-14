SUMMARY = "Qt and QML MPRIS interface and adaptor"
DESCRIPTION = "MPRIS v.2 specification implementation for Qt and QML plugin."
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "qtmpris-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "8b1c19009471325510d7085424bd04cf3cdcd0bfde7141f5848287a2c27c823dc591c2e5715b659e1edf55b3a221797672da23691856eea70fac3c521221b53e"

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
