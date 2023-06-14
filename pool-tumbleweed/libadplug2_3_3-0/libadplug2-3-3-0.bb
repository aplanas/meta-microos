SUMMARY = "AdLib Sound Player Library"
DESCRIPTION = "AdPlug is a hardware independent AdLib sound player library. \
AdPlug plays sound data, originally created for the AdLib (OPL2) and \
Sound Blaster (Dual OPL2/OPL3) audio boards, directly from its original \
format on top of an emulator or by using the real hardware. \
No OPL chip is required for playback."
LICENSE = "LGPL-2.1-only"

PV = "2.3.3"

RPM_NAME = "libadplug2_3_3-0-2.3.3-1.3.aarch64.rpm"
RPM_HASH = "14417cf4fbd02ac55ca9fa2f41998b51390bd03c7d3baf4f4ea9b32cbf70ba737df9d4d79f3e8578a3e676b040c00ea0b3378bd13a0887eab1630638a6a53bba"

RPROVIDES:${PN} += "libadplug-2.3.3.so.0 \
libadplug2-3-3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbinio.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
