SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-lxc-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "32aef1c3a842aa1f90aef057baa063faaea95cfd9cc66f98e0089a1d25fea5df749be1b9daa5c5f46753e4a3ab4d862fff97e7ad0ed1b585a9898069520dd96b"

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
