SUMMARY = "Storage driver plugin including all backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using LVM, iSCSI, \
parted and more."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "b971ece9392f66d65027f7b5b2fba6e68c424189f72ccd4b0158c623178da98f672fc267e76023e25807d0ad0964f37ccf896f5bc7d154d3cce9b7fc50497a1e"

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
