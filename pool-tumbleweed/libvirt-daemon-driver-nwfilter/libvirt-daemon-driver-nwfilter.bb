SUMMARY = "A nwfilter driver plugin for the libvirtd daemon"
DESCRIPTION = "The nwfilter driver plugin for the libvirtd daemon, providing \
an implementation of the firewall APIs using the ebtables, \
iptables and ip6tables capabilities"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-nwfilter-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "6d2a09ba357987e473235e2378870928dbb26cd22afb600ead695edd47dabde948fdb991ba2b78d8b1846bbb8856d301cfad62b783421a669ffa5e35ddd71b1e"

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
