SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "f2db3ad17d74e7e38cdbb99186f7d4b1561959a405c1aa2f2fdaec14c1899139723d35e0564840e4c2fbae0ffe65e425f3a58ee59d176b14b1f139a34b1494e7"

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
