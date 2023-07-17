SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Attica5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6cf5d4ce7f745953df70a17786991a8baf0199f0c6b457b34303f63dcf6436dd01509e78be5677505104503ec578f52ab0a8e2c0d99b75d903f3a1dba4636c82"

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
