SUMMARY = "Qt 6 RemoteObjects library"
DESCRIPTION = "The Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6RemoteObjects6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9092ab6d99dc202abcdc79e2ffc9a0a2dc94fdd5881db0d01a8b6dfb77e35d8ed598fb22d89bcf13ded9b8fc29eeaf5286b81493f3f56f2c6e6c5ee51a8a0205"

RPROVIDES:${PN} += "libQt6RemoteObjects.so.6 \
libQt6RemoteObjects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
