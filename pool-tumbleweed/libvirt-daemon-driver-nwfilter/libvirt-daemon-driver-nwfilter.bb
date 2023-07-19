SUMMARY = "A nwfilter driver plugin for the libvirtd daemon"
DESCRIPTION = "The nwfilter driver plugin for the libvirtd daemon, providing \
an implementation of the firewall APIs using the ebtables, \
iptables and ip6tables capabilities"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-nwfilter-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "85527c3f84e205ffda1250e6266cef54badfa0df176a0c7819d0ff12388ee5f4485eed111470645c5531d6ecf5ad7b6e67068362834af8ec232a31b5ce6c8227"

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
