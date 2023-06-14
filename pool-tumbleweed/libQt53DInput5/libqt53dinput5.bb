SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Input module provides classes for handling user input in \
applications using Qt3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DInput5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "a293ec5934a2ebd588f54e6264def9a4911bdd9bce6f7270c399baaf341acde53b4628ab1c73f862ac9831c36417cdabe7668650efabfd8792f574f64f9f34d3"

RPROVIDES:${PN} += "libQt53DInput.so.5 \
libQt53DInput5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
