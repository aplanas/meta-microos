SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a02157a7e740eb3f5f64c15551d7dc7dadebe30f12a3dab6538751369117c5b3f6eaedecb4b4d2e812a85aaca93177591e6b700dd1fcf4f20437d81db380297b"

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
