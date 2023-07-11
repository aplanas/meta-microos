SUMMARY = "Storage driver plugin including base backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using files, local disks, LVM, SCSI, \
iSCSI, and multipath storage."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-core-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "b89f3d6a5db5220c6dcf59ae6447c61499baf8ae002d5de7b1ef13bafe926a2c8197d6174d198e91edc194af44e7926e93370a933fd8404b8d6cc3a3f74ad4f5"

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
