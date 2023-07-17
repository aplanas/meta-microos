SUMMARY = "Qt 6 RemoteObjects library"
DESCRIPTION = "The Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6RemoteObjects6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "654d1ae6b3cf530e1960532ac87cc358023bb973c375168240052240e7db90b722a040d84c502866b9349d0f3937a7fdbad79dcbdb8a515363c26d5bdc1ace2e"

RPROVIDES:${PN} += "libQt6RemoteObjects.so.6 \
libQt6RemoteObjects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
