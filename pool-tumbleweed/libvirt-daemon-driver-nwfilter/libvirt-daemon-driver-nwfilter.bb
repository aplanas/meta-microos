SUMMARY = "A nwfilter driver plugin for the libvirtd daemon"
DESCRIPTION = "The nwfilter driver plugin for the libvirtd daemon, providing \
an implementation of the firewall APIs using the ebtables, \
iptables and ip6tables capabilities"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-nwfilter-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "6d2a09ba357987e473235e2378870928dbb26cd22afb600ead695edd47dabde948fdb991ba2b78d8b1846bbb8856d301cfad62b783421a669ffa5e35ddd71b1e"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-nwfilter) \
libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-nwfilter(aarch-64) \
libvirt_driver_nwfilter.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ebtables \
iptables \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpcap.so.1()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit)"

inherit rpm
