SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-lock-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "4e424d42b738e71075a2b19f91745adc9b4f6e78b6e083e267403fe168319f3485233255d002f327d73fe4f82247c654ee30600f3ae33323c65efe9af4c87efd"

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
