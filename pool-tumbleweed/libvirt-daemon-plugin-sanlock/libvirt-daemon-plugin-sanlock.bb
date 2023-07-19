SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "10069a5d201cae76439bae373a01dce31684fb4334974a2cbb2681380ee1b59b8fc4fa067d11c78e1724162a5b0418db488beb41f3fdb6a12eb0e4d76ac93faf"

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
