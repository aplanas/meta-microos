SUMMARY = "Library for Near Field Communication"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc6-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "b729272565f4157e12cab89d1cc52e0d5026f5909214c6b2421cecccd6f4efdd45f4c7ec8311a4c7844b781bf0f7dc8f4887edfbcfcf432b10509db4f745bf66"

RPROVIDES:${PN} += "libnfc.so.6 \
libnfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
