SUMMARY = "Development files for the Near Field Communications library"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator. \
 \
This package contains the libnfc development files."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc-devel-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "600a8ff2fcc3c6184ac5040116b3ee141d708faec3dc6c5d74e714441e832318896169947e54dc5b5fd077ae6c53182c0cfe5cba3e7a435775fefb2f11e0c27b"

RPROVIDES:${PN} += "libnfc-devel \
libnfc-devel(aarch-64) \
pkgconfig(libnfc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfc6 \
pkgconfig(libusb)"

inherit rpm
