SUMMARY = "Library for implementing USB device usage policy"
DESCRIPTION = "The USBGuard software framework helps to protect your computer against rogue USB \
devices by implementing basic whitelisting/blacklisting capabilities based on \
USB device attributes."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "libusbguard1-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "fe0ae8ebc54fb1ba3a247556a8866069f398a8b0af67548771a66a0c9bef1aeb4f3ded7c5cd21dc2045ad7a79e270874652302c12c4a528bffffd245491850f2"

RPROVIDES:${PN} += "libusbguard.so.1 \
libusbguard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libqb.so.100 \
libsodium.so.23 \
libstdc++.so.6"

inherit rpm
