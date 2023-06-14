SUMMARY = "A tool for implementing USB device usage policy"
DESCRIPTION = "The USBGuard software framework helps to protect your computer against rogue USB \
devices by implementing basic whitelisting/blacklisting capabilities based on \
USB device attributes."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "54fbca408dbebae38825b492c0192d674c3017d36a4772a6a0bfd7bf069b5275dbe6d7119ee5b13a98e5d57550bebafd111b6ed50cbce560ba6a8a1fa21d4c5a"

RPROVIDES:${PN} += "config-usbguard \
usbguard"

RDEPENDS:${PN} += "/bin/sh \
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
