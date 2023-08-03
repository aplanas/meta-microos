SUMMARY = "Examples for the qt6-virtualkeyboard modules"
DESCRIPTION = "Examples for the qt6-virtualkeyboard modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-virtualkeyboard-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ba45b89542461e103d46d9f9b266d98d3a8dc206ef337f7a46fee10e3fbf934acb7d8e4f2fbb276eeace31d980d31f09c24aa449959f8c63c81913c02bd2c4e1"

RPROVIDES:${PN} += "qt6-virtualkeyboard-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
