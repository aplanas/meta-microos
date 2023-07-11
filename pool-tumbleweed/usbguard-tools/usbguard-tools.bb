SUMMARY = "USBGuard Tools"
DESCRIPTION = "The usbguard-tools package contains optional tools from the USBGuard \
software framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-tools-1.1.2-3.2.aarch64.rpm"
RPM_HASH = "5f198c1c2d30f41b9b889a3a8e3b4bce9ae57895195d12d17af01d4733b56694a8988e54de5e483f8dd9b6bf8048841f11e3659955586dd821d5613cc6154863"

RPROVIDES:${PN} += "usbguard-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusbguard.so.1 \
usbguard"

inherit rpm
