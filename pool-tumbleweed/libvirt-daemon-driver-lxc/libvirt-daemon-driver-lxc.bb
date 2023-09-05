SUMMARY = "LXC driver plugin for the libvirtd daemon"
DESCRIPTION = "The LXC driver plugin for the libvirtd daemon, providing \
an implementation of the hypervisor driver APIs using \
the Linux kernel"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-lxc-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "0ed5b7fe41d56e2be26ce76617141d0c6ebbfc52ff300a8828f1d73665bb5b13f0e445c40b27de37e718b10a55164a1a393000fc94bfc4dab39dfc1fb74052f3"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-lxc \
libvirt-daemon-driver-lxc \
libvirt-driver-lxc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libfuse.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-driver-network \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
modutils \
systemd-container"

inherit rpm
