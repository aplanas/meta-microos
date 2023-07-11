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

RPM_NAME = "libnfc-devel-1.8.0-1.13.aarch64.rpm"
RPM_HASH = "f3265d4d68b690afc50531d62b723f6a40c73500df7c2b19e71b456b6350d1a2b784f95b6e4987a277208bbc69b62d7541774c9918157e12ed9b028a832a22c1"

RPROVIDES:${PN} += "libnfc-devel \
pkgconfig-libnfc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfc6 \
pkgconfig-libusb"

inherit rpm
