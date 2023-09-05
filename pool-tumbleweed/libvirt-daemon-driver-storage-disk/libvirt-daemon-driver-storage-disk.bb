SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "c42d3fa10c6297913a00bb53cdbc862fa1e3211c0a4c84edc9a55ac7d59a6c490016dee0f8e51c71156b0816ea92ec7ab0cfccda3db040d7464ebc2bdbe293a4"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-disk \
libvirt-storage-backend-disk.so"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt.so.0 \
parted"

inherit rpm
