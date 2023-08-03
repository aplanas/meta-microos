SUMMARY = "Tool to inspect RP2040 binaries"
DESCRIPTION = "Picotool is a tool for inspecting RP2040 binaries, and interacting with RP2040 devices when they are in BOOTSEL mode."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "picotool-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "a36b366354ab0081a49e3ebd11727f88f7dc803c31e01681ce91377413fff1037ac9fccf2563437c9b0860b2b79cd8a64987035996e1550a506713a730496261"

RPROVIDES:${PN} += "picotool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
