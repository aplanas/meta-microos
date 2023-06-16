SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-log-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "30ac46ba5ec84d50317755db622a39d78fbbb5a511348c0fc6b21585bffb823c7b42f1aa8e87a4050bced285c555a0b8c4ae501746aa40d517c156318c7c3128"

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
