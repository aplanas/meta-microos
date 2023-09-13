SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-qemu-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "aeb6e028f94679c3d23aec2b52d97c894e1ba4c30556a0665dc070d0fb41c331e19e46565cee4f78062e7166260a27540c25a6cd4ed3fae49893437f7368139d"

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
