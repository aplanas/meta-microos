SUMMARY = "Examples for the qt6-remoteobjects modules"
DESCRIPTION = "Examples for the qt6-remoteobjects modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2d3269b467ac8235c98f5cb4232fa90b74f4ad101140fac26ab19533a9978abf643177d47e7214ccc4905009d4fa36f91ce58eacba3aeb9ecb68f7a280d34070"

RPROVIDES:${PN} += "libqmlqrotimeexampleplugin.so \
qt6-remoteobjects-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
