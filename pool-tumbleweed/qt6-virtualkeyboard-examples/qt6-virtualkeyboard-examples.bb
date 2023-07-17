SUMMARY = "Examples for the qt6-virtualkeyboard modules"
DESCRIPTION = "Examples for the qt6-virtualkeyboard modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b2a55eff5beb757ef22684f0c89518e244f0fa6825265303c2748780f542d1defeefe5ca4441a975ca2a5872f298ef864e77f01ec9da625f997f5f54caf16a1c"

RPROVIDES:${PN} += "qt6-virtualkeyboard-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
