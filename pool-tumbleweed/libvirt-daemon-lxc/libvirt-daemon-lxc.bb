SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-lxc-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "3c245075e6169f59208f749721ccb5acc94632068d4a41eb538800ba9ab56ea9d4cd033bf25beb7ad8e729d012b34fca29ba2953a1cea423c679bccd68430986"

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
