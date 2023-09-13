SUMMARY = "Storage driver plugin for gluster"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for gluster \
volumes using libgfapi."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-gluster-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "f524c4b088bb8aca16b9ba6026651391c69e17072092f6ea1bd4090740201edb80bbe1640ffacb50107eb2d79c7a0a14d50b8476ab4156d5277c0423d7aa49d5"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-gluster \
libvirt-storage-backend-gluster.so \
libvirt-storage-file-gluster.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfapi.so.0 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
