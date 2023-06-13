SUMMARY = "Storage driver plugin including base backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using files, local disks, LVM, SCSI, \
iSCSI, and multipath storage."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-core-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "8e7a16e540ddd307896744d60571aaf8bcf9a9ffbd94f80f7f62d3a185c742bd2607984b42c6d4e7e68ad1fead0c2f295bf7d882a800c104201e6a3593df9bb1"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-storage-core) \
libvirt-daemon-driver-storage-core \
libvirt-daemon-driver-storage-core(aarch-64) \
libvirt_driver_storage.so()(64bit) \
libvirt_storage_backend_fs.so()(64bit) \
libvirt_storage_file_fs.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/qemu-img \
ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libparted.so.2()(64bit) \
libselinux.so.1()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
libxml2.so.2()(64bit) \
nfs-utils \
util-linux"

inherit rpm
