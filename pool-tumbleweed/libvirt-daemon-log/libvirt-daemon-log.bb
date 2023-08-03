SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-log-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "a5b6c14adb0c19ca3f23050a06c1c340916a85945d5ad123706401f0b70d5c5dee03c42e03287309e113a95dbb50623fe6958592eb8e115cfed2a5129331f1a8"

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
