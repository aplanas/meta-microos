SUMMARY = "LXC driver plugin for the libvirtd daemon"
DESCRIPTION = "The LXC driver plugin for the libvirtd daemon, providing \
an implementation of the hypervisor driver APIs using \
the Linux kernel"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-lxc-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "f378dde4fe4d4ed1b3d4377e24bf1133b54abe2e298ff3b9cd5f3462b3f3838bb2ba20847e0658855f1eb6dd6994d1dbdcc57f79af81e32faadbbcc84db0a1aa"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-lxc) \
libvirt-daemon-driver-lxc \
libvirt-daemon-driver-lxc(aarch-64) \
libvirt_driver_lxc.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libcap-ng.so.0()(64bit) \
libfuse.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-daemon-common \
libvirt-daemon-driver-network \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
modutils \
systemd-container"

inherit rpm
