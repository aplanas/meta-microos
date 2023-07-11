SUMMARY = "Bluetooth Low-Complexity, Sub-Band Codec Utilities"
DESCRIPTION = "The package contains utilities for using the SBC codec."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "sbc-1.5-2.12.aarch64.rpm"
RPM_HASH = "80e19361f3752c5f7e6723001d9623367b1353a2121a71ed0e13719ceb4d089231e6b719aeffb22a3ed5866a3ed5f7fd8262da0819dc0d7554c0937f485a4a0e"

RPROVIDES:${PN} += "sbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
