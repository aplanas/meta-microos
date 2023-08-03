SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Nfc6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3c36cabf47af8e39b72a066e1e478f84fe90c19a9e392efbb7f7849989f3124d61fd08345cec1d0165cb73ba12cf53639a3ccbccc39074edabaa0c2cb7ba84d5"

RPROVIDES:${PN} += "libQt6Nfc.so.6 \
libQt6Nfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libpcsclite.so.1 \
libstdc++.so.6"

inherit rpm
