SUMMARY = "Secret driver plugin for the libvirtd daemon"
DESCRIPTION = "The secret driver plugin for the libvirtd daemon, providing \
an implementation of the secret key APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-secret-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "8ea8c2f285e850422c10d0747db5ab4d0eb896f9ba0de8a905eeed50bd3643b6e937e2cbd1c4319ee5f7e714280f2c1b1d8e229bc6e7514a52a9910eee727295"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-secret \
libvirt-daemon-driver-secret \
libvirt-driver-secret.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
