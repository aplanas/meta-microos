SUMMARY = "Storage driver plugin including all backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using LVM, iSCSI, \
parted and more."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "dfe295fbd9772eded18ab505c8943b647f25cc776d440ce745eae8d9f125e9d6795026bd657c6b86f5f40d998cbdeccfb32a5c65ef4d6e6e558684586c128fcc"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage"

RDEPENDS:${PN} += "libvirt-daemon-driver-storage-core \
libvirt-daemon-driver-storage-disk \
libvirt-daemon-driver-storage-iscsi \
libvirt-daemon-driver-storage-iscsi-direct \
libvirt-daemon-driver-storage-logical \
libvirt-daemon-driver-storage-mpath \
libvirt-daemon-driver-storage-rbd \
libvirt-daemon-driver-storage-scsi"

inherit rpm
