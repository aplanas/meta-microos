SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Nfc6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a086e690fedfd41d124562beac96ea2f4589585d162740bfb73f88f94a408832ec1e938696567181965899a419677e030bee1d0ef58e0cf589913465d68b69f4"

RPROVIDES:${PN} += "libQt6Nfc.so.6 \
libQt6Nfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libpcsclite.so.1 \
libstdc++.so.6"

inherit rpm
