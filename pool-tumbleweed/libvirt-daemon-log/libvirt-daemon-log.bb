SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-log-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "6f5c2a8d4ee9e297bebb54b052e00a5de2d4f02483441ab4b1d2ec1f1b61f0de5278a9005baf98d4b812e8acea9a5e06eaf305e5fa24ba1db95b6a97ca0b21a4"

RPROVIDES:${PN} += "config-libvirt-daemon-log \
libvirt-daemon-log"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
