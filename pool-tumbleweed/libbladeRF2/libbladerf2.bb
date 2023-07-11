SUMMARY = "SDR radio receiver library"
DESCRIPTION = "Library for bladeRF, an SDR transceiver."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "libbladeRF2-2.5.0-16.4.aarch64.rpm"
RPM_HASH = "7da9b45d914c07e504d4a239d8fcc4f6a955f18dacad4225252909c82688c4bf36f57f9356538b6563811a1d4c99ba3d7ce6e8653873e46e35c89c76daeb8d7e"

RPROVIDES:${PN} += "libbladeRF.so.2 \
libbladeRF2"

RDEPENDS:${PN} += "/sbin/ldconfig \
bladeRF-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
