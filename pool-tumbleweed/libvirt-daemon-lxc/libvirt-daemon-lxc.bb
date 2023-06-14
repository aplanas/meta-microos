SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-lxc-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "9ff7e74da87782338169457f1fdf33e73b99bfb1015a389c5f74c15439be1ab6a3e6c5079e32c9aae854e3ab23a31e053635a0a5dd7dacfedbf2866cf555fbf8"

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
