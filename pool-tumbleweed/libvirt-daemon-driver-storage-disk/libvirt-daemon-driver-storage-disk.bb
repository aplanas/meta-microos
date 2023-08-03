SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "e7ac8258d4fdcdb1bd0348a5bd2541946ad04504fe0647138a434e2103604693b571c3b348fb979e234e5da4756ad5e627be73a1aba48322c957baee7294a2d8"

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
