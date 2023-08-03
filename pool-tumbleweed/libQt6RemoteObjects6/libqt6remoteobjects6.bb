SUMMARY = "Qt 6 RemoteObjects library"
DESCRIPTION = "The Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6RemoteObjects6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e4082be9f97c15cdfdb3b67352c9ae4d92ad09d024a68950fbe1538420614ff3de5692b4c276e011ea587263bf7ba89ffdf0b5fa98272b41e042878e30d8d918"

RPROVIDES:${PN} += "libQt6RemoteObjects.so.6 \
libQt6RemoteObjects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
