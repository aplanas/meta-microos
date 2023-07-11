SUMMARY = "Tool to inspect RP2040 binaries"
DESCRIPTION = "Picotool is a tool for inspecting RP2040 binaries, and interacting with RP2040 devices when they are in BOOTSEL mode."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "picotool-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "dab772bcab9b3b24ec87e79149af06aa18743ec93fdbde27742e2e2084ff9c5514f1d4923a29678489fbfcba3b2e2526c0992f73d264a562bfe53fea4495cae3"

RPROVIDES:${PN} += "picotool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
