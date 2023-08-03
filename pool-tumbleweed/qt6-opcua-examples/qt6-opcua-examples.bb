SUMMARY = "Examples for the qt6-opcua modules"
DESCRIPTION = "Examples for the qt6-opcua modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f3a196157761bedf943afafa13cd744a4d9e4d77a44516f5b6e6680db16469ac4abf51e1523bc8f5269312b58bb7a81dc76b1c1820f1a1d93377ecfef39cc88d"

RPROVIDES:${PN} += "qt6-opcua-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpcUa.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
