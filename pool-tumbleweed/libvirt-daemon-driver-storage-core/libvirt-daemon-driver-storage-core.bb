SUMMARY = "Storage driver plugin including base backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using files, local disks, LVM, SCSI, \
iSCSI, and multipath storage."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-core-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "f1c3e4e3abc2e71bfbb7241210e158b1aa62e85aaf955c39f83aae11d24ff26966a06858b7829f01efb9783174e6a7674ffddd70257c3c04db66c5e04a32c9bd"

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
