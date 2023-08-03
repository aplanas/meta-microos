SUMMARY = "Examples for the qt6-serialbus modules"
DESCRIPTION = "Examples for the qt6-serialbus modules."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialbus-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a0357aa27743fa25d95f6b50495c043f0a3129f084f262e8b6b44d9663ac94ed896e2a47085219cd643a1d21189f13a852d08e00508650fbb6d0dcff1008a745"

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
