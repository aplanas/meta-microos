SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-qemu-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "cf477a0dcbd17c779c18a8d3d55d589ed3991d049854ba6f152c9cd6a324ff3e3a72e62d907645da43f1a889233dec2e17d23fc9646ab8b6cdf4a3dc4946060c"

RPROVIDES:${PN} += "libvirt-daemon-qemu \
libvirt-daemon-qemu(aarch-64)"

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
