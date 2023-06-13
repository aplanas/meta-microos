SUMMARY = "USBGuard Tools"
DESCRIPTION = "The usbguard-tools package contains optional tools from the USBGuard \
software framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-tools-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "c671098a45df58ea4286a5047d6f58745d29024206901621215152289107cf7fa16288472a3a1cbabe75ae1f9d1cc70f5e293cbc95bf5b5dea46463e4f4ecc6d"

RPROVIDES:${PN} += "usbguard-tools \
usbguard-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libusbguard.so.1()(64bit) \
usbguard"

inherit rpm
