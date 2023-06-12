SUMMARY = "Cockpit user interface for virtual machines"
DESCRIPTION = "Cockpit component for managing virtual machines. \
 \
If 'virt-install' is installed, you can also create new virtual machines."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "270.2"

RPM_NAME = "cockpit-machines-270.2-3.3.noarch.rpm"
RPM_HASH = "807705a5dfaf9dddc26f2bb9a58d0761b68df13d40a5d313ad7c2acf8a8eab448b83b6af0f7a3b163b70ec9e366268feae3e6f4de1fbf74a35ec4be985bacce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-machines \
metainfo() \
metainfo(org.cockpit-project.machines.metainfo.xml)"
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
