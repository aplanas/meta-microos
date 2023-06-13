SUMMARY = "Storage driver plugin for rbd"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for rbd \
volumes using the ceph protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-rbd-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "95ab2fac2e964e4a43cae0cb537c92386a31e4c42ab962a186f933ad4e1abffa83be4980be78b3d1b0330291fcde0b253da24ea57468be8cf76481f06db4e9e0"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-rbd \
libvirt-daemon-driver-storage-rbd(aarch-64) \
libvirt_storage_backend_rbd.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
librados.so.2()(64bit) \
librbd.so.1()(64bit) \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0()(64bit)"

inherit rpm
