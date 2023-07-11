SUMMARY = "Programmer for Texas Instruments 8051-based System-On-Chip devices"
DESCRIPTION = "cc-tool provides support for Texas Instruments CC Debugger for Linux in order \
to program 8051-based System-On-Chip devices: CC254x CC253x CC243x CC251x CC111x."
LICENSE = "GPL-2.0-only"

PV = "0.26"

RPM_NAME = "cc-tool-0.26-1.34.aarch64.rpm"
RPM_HASH = "0589cb75321c59ca11ebc2e7da119bb266fefb29f36d2d47d2fb92ccc0f890ce60ab1b0c4efee4b5bb9d81ed990b18c049ce125a5bd28ccb178878ef1ae40baf"

RPROVIDES:${PN} += "cc-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
