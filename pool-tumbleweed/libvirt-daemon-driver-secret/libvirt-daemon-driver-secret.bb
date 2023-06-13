SUMMARY = "Secret driver plugin for the libvirtd daemon"
DESCRIPTION = "The secret driver plugin for the libvirtd daemon, providing \
an implementation of the secret key APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-secret-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "240b90045b5933cbd4ab3fed8bd1b2f8aef7db838e6f75fdb9fa19c4fe128297cd5dfe97ee92f2d9d0c1de558bb9350d715a274965162f7a3af1518bff3ac124"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-secret) \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-secret(aarch-64) \
libvirt_driver_secret.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-daemon-common \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit)"

inherit rpm
