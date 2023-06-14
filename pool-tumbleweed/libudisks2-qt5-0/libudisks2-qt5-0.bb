SUMMARY = "Development tools for Deepin Anything"
DESCRIPTION = "UDisks2 library with Qt5 \
 \
UDisks2 DBus interfaces binding of Qt5."
LICENSE = "LGPL-3.0+"

PV = "5.0.6"

RPM_NAME = "libudisks2-qt5-0-5.0.6-1.8.aarch64.rpm"
RPM_HASH = "d1366304fe73d4c6545cc59fefa7d554b2a2a6b13b38c6fbab94882ed69c298b47e31bc33b1dd088d6bcb13d6ff3b9425c85c02fe4238aef9213654fb6b64f41"

RPROVIDES:${PN} += "libudisks2-qt5-0 \
libudisks2-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
