SUMMARY = "Cockpit user interface for virtual machines"
DESCRIPTION = "Cockpit component for managing virtual machines. \
 \
If 'virt-install' is installed, you can also create new virtual machines."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "298"

RPM_NAME = "cockpit-machines-298-1.1.noarch.rpm"
RPM_HASH = "a6854790ae89e69b2350a9e880e8d5917a83a32771345fb995a795e364a96088f4cb738d290229f33ee2cec7a9d0e1a0c5c6103107141ea9972a8cf53cdb1932"
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
