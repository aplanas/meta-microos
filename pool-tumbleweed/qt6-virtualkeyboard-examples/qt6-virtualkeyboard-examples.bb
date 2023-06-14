SUMMARY = "Examples for the qt6-virtualkeyboard modules"
DESCRIPTION = "Examples for the qt6-virtualkeyboard modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6358fa2b6d41707ff4716b7a05d9a30cd256be8a7fd8e034ea92708fff161db7a4be49b3844019af12f44776323316d76b646c629e9d25127f6cc48955798a0e"

RPROVIDES:${PN} += "qt6-virtualkeyboard-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
