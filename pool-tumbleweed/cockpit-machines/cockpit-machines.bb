SUMMARY = "Cockpit user interface for virtual machines"
DESCRIPTION = "Cockpit component for managing virtual machines. \
 \
If 'virt-install' is installed, you can also create new virtual machines."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "292"

RPM_NAME = "cockpit-machines-292-1.1.noarch.rpm"
RPM_HASH = "36c7f7116997129521abad9d0dfa9c0fa80d8f2e7d6a2c93266e40ecb54b3122d96d36c72d2025cca65fc3d94dba688ac644b0808e23214740cfb56f2cdcdedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-machines"

RDEPENDS:${PN} += "cockpit-bridge \
libvirt-client \
libvirt-daemon-qemu \
libvirt-dbus \
qemu-block-curl \
qemu-chardev-spice \
qemu-hw-display-qxl \
qemu-hw-usb-redirect \
virt-install"

inherit rpm
