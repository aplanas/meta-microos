SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "solid-tools-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "a521130e67b357d22939a9df0640806004441ecc4ed325c7908db3a21c8b4e3d4b4aceaf63e4dc81ed876267fc5f18d7463ef1baca2295bdfc395f4ff3a9625a"

RPROVIDES:${PN} += "solid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
