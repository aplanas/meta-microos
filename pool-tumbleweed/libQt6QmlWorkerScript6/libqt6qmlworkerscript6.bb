SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "aaadf8858edea34c4377b50f6aebc0286bbb0fcab14fa17136f17aa917298f2b8bea2798b5e225a06b76d05008ace94e0d3e7fcf4e495f224a90f37f05ea1510"

RPROVIDES:${PN} += "libQt6QmlWorkerScript.so.6 \
libQt6QmlWorkerScript6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
