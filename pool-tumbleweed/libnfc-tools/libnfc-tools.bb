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

RPM_NAME = "libnfc-tools-1.8.0-1.13.aarch64.rpm"
RPM_HASH = "6455b4cf7d2f616ffd33d9480678ef3caa964309ba1e3a638dd6cea86b6428044b7e9c3e659aba43a26b533192363b86c9bd9e26a4c71adf51a678ddd9a3fdb3"

RPROVIDES:${PN} += "libnfc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6 \
libreadline.so.8"

inherit rpm
