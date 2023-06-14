SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0a1ff25ee70e2833937d18e48ab5109d02924fabd14e997b9fa632a28c52862667d570d164310c22866bd5af8ec5cad1e31da59b15e5d55e2f936d36aaf4291e"

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
