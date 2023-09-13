SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-lxc-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "a6136c0ab2e1309392a92bdf2fb451205908f0b8a87475413ecdf581f80194c9bf8cac2967af7d9ebf91d0643b3662692dc2742aef193abfdf0696579a92a745"

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
