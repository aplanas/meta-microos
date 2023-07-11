SUMMARY = "Qt5 3D tools"
DESCRIPTION = "Tools for libqt5-qt3d module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qt3d-tools-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "2ba64e54c24c6dc8ee2a81b303cbd32850dfdeb8632e12e65ef51b1c3cc64d8b1e168c696efd7054c595bb82dd238856ecb54e923da9c90da71720e46e0d9592"

RPROVIDES:${PN} += "libqt5-qt3d-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libassimp.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
