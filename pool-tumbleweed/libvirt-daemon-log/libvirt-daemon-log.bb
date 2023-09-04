SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-log-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "f3a81ab6ceb8c939ddcdbe606041bb09feb46501f4faaaeb786c1ed9bd579540845350af7e5ee6297bca9e1344620d595f6e17ab376625100785174bcbce2f62"

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
