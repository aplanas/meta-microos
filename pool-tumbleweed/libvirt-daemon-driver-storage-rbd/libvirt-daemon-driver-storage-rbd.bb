SUMMARY = "Storage driver plugin for rbd"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for rbd \
volumes using the ceph protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-rbd-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "503b5560c7b6c73bf1e10c6841d30539a866dfca9fbe5255a435a6f2d45c36485846f4272a5e1021212d058faf2f40c706a2aa5f93596f9c7d674c45bf2afd52"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-rbd \
libvirt-storage-backend-rbd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
librados.so.2 \
librbd.so.1 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
