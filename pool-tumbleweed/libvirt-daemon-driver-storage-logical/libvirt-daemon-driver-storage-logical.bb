SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "86ba1bc569bb9c7b526f91892a0701485e33e1b136b2146d02cdef0f6ed459bffe8f206cb86a1ba9d5326b91bb3952b209e5bca7dc4c88474578d1c8b91d9792"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-logical \
libvirt-storage-backend-logical.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0 \
lvm2"

inherit rpm
