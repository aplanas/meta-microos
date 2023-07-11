SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Attica5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "c8a90900d8d862863e7f1630794ba31f6f66347b8a1ac4b47ebd4002daee88b0bfaa32375e982067f8a9cabcb1c3b736ed79731f247c8df9f4de368ba238d475"

RPROVIDES:${PN} += "libKF5Attica.so.5 \
libKF5Attica5"

RDEPENDS:${PN} += "/sbin/ldconfig \
attica-qt5 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
