SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Nfc6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "5b4d8f3fe4d115cf39eb07aa96d08b67504e6acdce43eab94d1f3a3f46293769a0bbc4531ef9cfb773c8fbf3815161c50caf68a425b6e2c95175ad3b17e550de"

RPROVIDES:${PN} += "libQt6Nfc.so.6 \
libQt6Nfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libpcsclite.so.1 \
libstdc++.so.6"

inherit rpm
