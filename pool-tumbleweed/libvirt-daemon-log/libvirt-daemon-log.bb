SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-log-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "b8562f0a122ce4cdb609f5a2f154a10f870a960e83959b12523b2dbad3132e9e71812a26af420d4519790b4248957bc5ce4637390cb683a3f2237f7efffa7a53"

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
