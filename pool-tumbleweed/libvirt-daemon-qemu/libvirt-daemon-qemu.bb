SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-qemu-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "a0e75e02a27d0f6fa6f7121d88670be190abea384d5372bc6688aab71d296e1a43585d4abc85b35165b5cf4b2729fdd877a3876dae102d5df81281f416da3975"

RPROVIDES:${PN} += "libvirt-daemon-qemu"

RDEPENDS:${PN} += "libvirt-daemon-driver-interface \
libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-daemon-lock \
libvirt-daemon-log \
libvirt-daemon-plugin-lockd \
libvirt-daemon-proxy"

inherit rpm
