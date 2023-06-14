SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Nfc6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "990301419f81472bb8708731870ce6edcb610246479a4f4e253a26b432542fbee2f7371b4b95ba5d9e2ea6ba07ff6facd7bb000e8a12cc3bbefe552ede0163c6"

RPROVIDES:${PN} += "libQt6Nfc.so.6 \
libQt6Nfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libpcsclite.so.1 \
libstdc++.so.6"

inherit rpm
