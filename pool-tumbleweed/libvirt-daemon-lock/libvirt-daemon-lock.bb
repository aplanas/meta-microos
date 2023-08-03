SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-lock-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "81af96f6afdc9a9f607475fb170b622f4632c2df268ec4095c9124eff9d28bb21941fd3e03c641eab72b6bdddf31291f585e634769d2b201bf4d70ce1e933015"

RPROVIDES:${PN} += "config-libvirt-daemon-lock \
libvirt-daemon-lock"

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
