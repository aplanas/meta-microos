SUMMARY = "Single Sign On Framework for Qt"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "libsignon-qt5-1-8.60-2.19.aarch64.rpm"
RPM_HASH = "581f531efc366709ee4d33d193b4b6a451e0fcaeef54f98d96ca96b780293012b3ec0c29e4afdd791cec924d75b5de2a5810196fd97315b00c9eb3c1c1389a8f"

RPROVIDES:${PN} += "libsignon-qt5-1 \
libsignon-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
