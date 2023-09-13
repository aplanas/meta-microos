SUMMARY = "Network driver plugin for the libvirtd daemon"
DESCRIPTION = "The network driver plugin for the libvirtd daemon, providing \
an implementation of the virtual network APIs using the Linux \
bridge capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-network-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "b957b894916b4b005a4c53be347099e35e630937128814f951acc07fb62f72800abed75017910daca850f0d89b0cd31f2bee3a812e7f0a2b609fd7122269381b"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-network \
libvirt-daemon-driver-network \
libvirt-driver-network.so"

RDEPENDS:${PN} += "/usr/bin/sh \
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
