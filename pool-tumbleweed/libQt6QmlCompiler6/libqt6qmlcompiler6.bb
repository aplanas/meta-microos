SUMMARY = "Qt6 QmlCompiler library"
DESCRIPTION = "The Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QmlCompiler6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "944b43e3056e707aa571a25e2271f0ac1b7b9d092aaf9491f20a38cf0eadb4e165fc44d765f0c0912aedd0b63f37110dddab96386491d81083b044a8f84cece3"

RPROVIDES:${PN} += "libQt6QmlCompiler.so.6 \
libQt6QmlCompiler6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
