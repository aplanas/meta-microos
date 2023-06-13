SUMMARY = "Bluetooth Low-Complexity, Sub-Band Codec Utilities"
DESCRIPTION = "The package contains utilities for using the SBC codec."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "sbc-1.5-2.11.aarch64.rpm"
RPM_HASH = "87814dc678c1c5ae0d6473b4b2ddd55b8a37ed123cf8ae71622fb398f3e541eb7faa71f5090f2ba403a4a2c41aa540d1dd961f5aace4d99c36609c6c518c2602"

RPROVIDES:${PN} += "sbc \
sbc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
