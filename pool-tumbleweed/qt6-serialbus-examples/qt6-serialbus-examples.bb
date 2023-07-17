SUMMARY = "Examples for the qt6-serialbus modules"
DESCRIPTION = "Examples for the qt6-serialbus modules."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f71b6a6157003576e6195dd7ff600e9543fd3fa865ac64dc326bf7e9c0e8fa35a43d4d3832de921f3afa1960989641fa4095883430a4fb7fcfea9a91d9fd2ff0"

RPROVIDES:${PN} += "qt6-serialbus-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6SerialBus.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
