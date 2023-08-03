SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-qemu-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "fbb0a35346d42e18616f520fa54b4fd4fc479aa0d6a13628a67b0d0b72bac14ee1dd418669885d286311fbc4719f1b6bb24f1203953f55c2193a2f5486dce5e7"

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
