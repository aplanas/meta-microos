SUMMARY = "Tools for Near Field Communication"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator. \
 \
This package contains the NFC utilities."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc-tools-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "3f724abb876fa053259e86b76e35f30af562be7df1ebf66603505e69aa84b129fffcc8cc7aba0abb2ab5661fbe3eddf7fa4b5918ae275df75ab7fdd2c8869761"

RPROVIDES:${PN} += "libnfc-tools \
libnfc-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnfc.so.6()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
