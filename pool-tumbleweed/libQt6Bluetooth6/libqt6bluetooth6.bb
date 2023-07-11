SUMMARY = "Qt 6 bluetooth library"
DESCRIPTION = "Provides access to Bluetooth hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Bluetooth6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7b160d5abeabfc61472f83e3eec6b5c62e41cb113d8515ae70dead094a555ca3964bd31be3f19206c1e295de95ea8fa6572c9d5c1996ed6d6a0aab810ef0180a"

RPROVIDES:${PN} += "libQt6Bluetooth.so.6 \
libQt6Bluetooth6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
