SUMMARY = "Storage driver plugin for rbd"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for rbd \
volumes using the ceph protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-rbd-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "f5fd6f73c649a11d586928f793e74080ae1d6a2e613b12f8ddd75f5c3b01a2d37fd9bb66dc38ba1a39fa1c2cacb36d8ab98922cf8c55ff6df108a7f411a11582"

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
