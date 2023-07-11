SUMMARY = "A tool for implementing USB device usage policy"
DESCRIPTION = "The USBGuard software framework helps to protect your computer against rogue USB \
devices by implementing basic whitelisting/blacklisting capabilities based on \
USB device attributes."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-1.1.2-3.2.aarch64.rpm"
RPM_HASH = "9982284c476751031acedc7fe3fc9866f619a9804c25d6c3e752357145ab9979af6525b48d506c0c18ef1d534bf1d13478489ba7a775685916c19d1ffbe41969"

RPROVIDES:${PN} += "config-usbguard \
usbguard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
libseccomp.so.2 \
libstdc++.so.6 \
libusbguard.so.1 \
systemd"

inherit rpm
