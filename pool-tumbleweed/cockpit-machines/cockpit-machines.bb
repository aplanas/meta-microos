SUMMARY = "Cockpit user interface for virtual machines"
DESCRIPTION = "Cockpit component for managing virtual machines. \
 \
If 'virt-install' is installed, you can also create new virtual machines."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "296"

RPM_NAME = "cockpit-machines-296-1.1.noarch.rpm"
RPM_HASH = "d8fb589af657e904e7c4e0306104aeb5e5f13c8ad80edda5ca9416fa7bf13ed3c02d7eb6f7ecab6ef7e4f53ea82358ccbab09619b0c98b5de26497dc1cbf1e5e"
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
