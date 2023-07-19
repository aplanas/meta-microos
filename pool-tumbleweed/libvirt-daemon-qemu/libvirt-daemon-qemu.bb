SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-qemu-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "86ee1a077f9e4df199512bc064a606944a1636eebea1b244b2b457ef4664489a8b903e891ff71e85fced3dda097a760a53f609709377e6db51856514d9d7dd04"

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
