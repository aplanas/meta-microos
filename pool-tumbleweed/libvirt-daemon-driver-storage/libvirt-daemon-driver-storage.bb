SUMMARY = "Storage driver plugin including all backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using LVM, iSCSI, \
parted and more."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "a456e8ce9c0b1f4d69e51056dd9a9196c6894322b90fbef75fe624ebaf3a559d84175b6d8d72d71c7ff97581d192743965426e0562996e151d31bf896c0fecf6"

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
