SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "d8af12d1b8746cf0ca4d57c9427c2e9cb9a02d47010f0882545b78182765793c74852b89f70adc3bbf61b2971efde49bcde2d3f8d79818f539df3d37e1739b2f"

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
