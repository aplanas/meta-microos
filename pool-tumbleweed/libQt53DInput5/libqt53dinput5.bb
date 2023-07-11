SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Input module provides classes for handling user input in \
applications using Qt3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DInput5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "17aeb9751c27aa9fd465d24ca867363b83eb50d12dabfea1b9f06d6e85ea73ffa9c7c7f0f91f6703cd44bb5690c65f062464f375bd61cf26de700be3697b835f"

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
