SUMMARY = "A nwfilter driver plugin for the libvirtd daemon"
DESCRIPTION = "The nwfilter driver plugin for the libvirtd daemon, providing \
an implementation of the firewall APIs using the ebtables, \
iptables and ip6tables capabilities"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-nwfilter-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "813bfd8e4e9c5008c8c36453957e7cd021f6165e1fbd09f1760e23eb6c823cbf5e7f95fee500a3df832be3f1a98e67d10ad19c2f356919b765946847fdf1116a"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-nwfilter \
libvirt-driver-nwfilter.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ebtables \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcap.so.1 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
