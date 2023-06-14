SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Attica5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1a6e2ae74202ea8d7655e0064b5b96c5734e8acc62a18e9c9af2065846da86070098109ec75176d89a7e2a52edc4d6dec7be7d04be09d897bf7d2d65053080d5"

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
