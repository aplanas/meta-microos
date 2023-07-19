SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "287b405d03d96b8f9b7a590cd829594c81419ba234d3d77e628380f793b0639e5ce3a51090d0bd013f115bf6f93350b10281f92edb7be34a6efc294951dea46f"

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
