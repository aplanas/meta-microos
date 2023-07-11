SUMMARY = "Library for implementing USB device usage policy"
DESCRIPTION = "The USBGuard software framework helps to protect your computer against rogue USB \
devices by implementing basic whitelisting/blacklisting capabilities based on \
USB device attributes."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "libusbguard1-1.1.2-3.2.aarch64.rpm"
RPM_HASH = "dc79954d4284e316b17a379c0e63deb9682efe3647b4f9deb992e3b0e86e74c481b26d4254f60b17885d955f223ad40e548809e79c07a474ca48c77b45a7c42b"

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
