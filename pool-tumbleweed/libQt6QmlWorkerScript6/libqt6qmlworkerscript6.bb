SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "2f83c11ddda96afbe159b3dae0cd22e074a04baf8260b97aa413d0d678b83e4fc4a99cc8b76097ac8a17c5d1ba9844b55f76fd03c3a72d62461d0d86fab46952"

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
