SUMMARY = "SDR radio receiver library"
DESCRIPTION = "Library for bladeRF, an SDR transceiver."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "libbladeRF2-2.5.0-16.3.aarch64.rpm"
RPM_HASH = "652370beeca7b082fc98fdcdcf8a0b4274cbbbfc6e556e6f5b20b586d40169f86b3352622ac7b4a833ecb5a890b4c3d7442807eeb46b2874c0b1df1aa8565153"

RPROVIDES:${PN} += "libbladeRF.so.2 \
libbladeRF2"

RDEPENDS:${PN} += "/sbin/ldconfig \
bladeRF-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
