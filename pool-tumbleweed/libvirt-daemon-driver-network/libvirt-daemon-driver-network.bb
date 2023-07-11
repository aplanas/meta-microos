SUMMARY = "Network driver plugin for the libvirtd daemon"
DESCRIPTION = "The network driver plugin for the libvirtd daemon, providing \
an implementation of the virtual network APIs using the Linux \
bridge capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-network-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "8df111cdcaeee62659e3bbc34cffbdcf9cd8cea557495414c6ff7f4aecf458c78106905f455356fb5c88120589f84ce76678eaa62c7f6b23b161aac58499e539"

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
