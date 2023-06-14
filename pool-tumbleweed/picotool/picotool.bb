SUMMARY = "Tool to inspect RP2040 binaries"
DESCRIPTION = "Picotool is a tool for inspecting RP2040 binaries, and interacting with RP2040 devices when they are in BOOTSEL mode."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "picotool-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "47e0b3bcedb663af310cb1a65f8a88f98fa4109501a247400f89670e8a521c4d8c63f1d8b0f4cbefa7a6258148fb64945d76c8454f52eefbd4fc2bebb8fc98a2"

RPROVIDES:${PN} += "picotool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
