SUMMARY = "Storage driver plugin for rbd"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for rbd \
volumes using the ceph protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-rbd-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "5cc17d77ada3290bd3a7af941328fc9b9652ee4ed0bf9eca8fe192a1943c500c85f685eec277d0df7b551a31c856bbc89f6135c911713e03625c83d8eed76d75"

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
