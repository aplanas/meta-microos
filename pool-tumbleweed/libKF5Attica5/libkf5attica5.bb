SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Attica5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d4c549f4c4289f2f5ea33d6695718866cf1fc1a58cd8bdb64a3481480d43be9056075f0855b04c29b9a3dde190eef84efe4b8dd637372aea4da65e49a0ce1477"

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
