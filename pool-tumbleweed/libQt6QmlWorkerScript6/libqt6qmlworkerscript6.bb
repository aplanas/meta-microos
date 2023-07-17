SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlWorkerScript6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "6758367162c2158ae6a22b69bae678108c52336e547e096ba133c9d21b355575300d873877854d75549ced10e3f55f5c3f02b283b914302fc043b794ebf357a5"

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
