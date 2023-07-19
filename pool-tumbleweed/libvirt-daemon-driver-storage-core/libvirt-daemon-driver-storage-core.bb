SUMMARY = "Storage driver plugin including base backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using files, local disks, LVM, SCSI, \
iSCSI, and multipath storage."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-core-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "9279111d5cb0c05b8b6b481605d5cae5f1b3abedc09de84994e9af344aff8e23c55dbdf98ebacc8725e79870bb0899b3259bd01bf000b7510a14c691db62636a"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-storage-core \
libvirt-daemon-driver-storage-core \
libvirt-driver-storage.so \
libvirt-storage-backend-fs.so \
libvirt-storage-file-fs.so"

RDEPENDS:${PN} += "/usr/bin/qemu-img \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libparted.so.2 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.2 \
nfs-utils \
util-linux"

inherit rpm
