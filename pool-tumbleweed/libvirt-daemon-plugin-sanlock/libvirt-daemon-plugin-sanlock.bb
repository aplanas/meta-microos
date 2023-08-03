SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "5155bd9540ab024281837f00e7c0e45bd22c3117eca2e0aced81b8f733f8ac1bff39f1caf452b5b6b707b4d65c0b38a687fc81e91005085e49e3eafe85cf8991"

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
