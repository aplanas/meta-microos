SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "03aa064de38d804a5f88b54b30442c4d85bd6c366b405ec57940ae0f1b0c4aaadc2dbf8b1894e9a6ab9bd4f8d69d3a717629dd23d30d69331262baf4f3f91c10"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-disk \
libvirt-daemon-driver-storage-disk(aarch-64) \
libvirt_storage_backend_disk.so()(64bit)"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libvirt-daemon-driver-storage-core \
libvirt.so.0()(64bit) \
parted"

inherit rpm
