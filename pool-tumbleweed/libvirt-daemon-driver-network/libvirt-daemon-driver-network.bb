SUMMARY = "Network driver plugin for the libvirtd daemon"
DESCRIPTION = "The network driver plugin for the libvirtd daemon, providing \
an implementation of the virtual network APIs using the Linux \
bridge capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-network-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "9efea9263e437f91162b83d5fe338e29131c6572ca4b0540476260396053bc7aeff4e0736b3ddc36501f7be59c6d866f428b6a1734d602e28590802f1869bcf3"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-network \
libvirt-daemon-driver-network \
libvirt-driver-network.so"

RDEPENDS:${PN} += "/bin/sh \
dnsmasq \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
