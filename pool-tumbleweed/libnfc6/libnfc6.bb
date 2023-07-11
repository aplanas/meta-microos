SUMMARY = "Library for Near Field Communication"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc6-1.8.0-1.13.aarch64.rpm"
RPM_HASH = "9559979d40ca59fdc5660bf90efd739af3edf228dadd831b56f0f7c6941623da4b544a37f1e180fa0821218db5d0426ca803f82d685cab54f5ab1e2d5f527a94"

RPROVIDES:${PN} += "libnfc.so.6 \
libnfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
