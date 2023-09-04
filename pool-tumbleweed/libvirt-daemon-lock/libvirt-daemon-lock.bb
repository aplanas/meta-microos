SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-lock-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "99f22addc1f9dc4c31b634ee9d2d27a82aae043fa51b99f12d325214407c77c1d208f484dc9014935a43f55d2d3e65b859de0715c3684de2039497c3a6f644f8"

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
