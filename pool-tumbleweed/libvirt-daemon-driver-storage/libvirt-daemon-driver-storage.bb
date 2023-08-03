SUMMARY = "Storage driver plugin including all backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using LVM, iSCSI, \
parted and more."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "15a52df5149e20056abc3c6807424c442cb6fade889b997ebecd051b6ff0efd0cb2db663d72a3be2d7a61ea19f72e6869c09b91f24b6bd3d2be1cd51c3a35b35"

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
