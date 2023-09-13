SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "5aae84fb32281cf8eaa027dcf5e3363caaeda819c09a4cb75f9e44a5b7b379f83d4bdf8b94ca004b56892cbefc43890aae31d6a78633186ad53d71d86ca92836"

RPROVIDES:${PN} += "config-libvirt-daemon-plugin-sanlock \
libvirt-daemon-plugin-sanlock \
libvirt-lock-sanlock"

RDEPENDS:${PN} += "/usr/bin/sh \
augeas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libsanlock-client.so.1 \
libvirt-libs \
libvirt.so.0 \
sanlock"

inherit rpm
