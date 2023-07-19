SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-lxc-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "f76505ecdfeb2c73092366200a83e880a6c0b3f0f97070d8e3fbd653360a87ae73be1cbe5f71948a0ee7458195444c558cd349fe0bee6e23a2d4ad2d55424a89"

RPROVIDES:${PN} += "libvirt-daemon-lxc"

RDEPENDS:${PN} += "libvirt-daemon-driver-interface \
libvirt-daemon-driver-lxc \
libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-daemon-log \
libvirt-daemon-proxy"

inherit rpm
