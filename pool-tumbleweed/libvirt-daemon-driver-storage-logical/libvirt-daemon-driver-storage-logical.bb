SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "86ba1bc569bb9c7b526f91892a0701485e33e1b136b2146d02cdef0f6ed459bffe8f206cb86a1ba9d5326b91bb3952b209e5bca7dc4c88474578d1c8b91d9792"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-logical \
libvirt-daemon-driver-storage-logical(aarch-64) \
libvirt_storage_backend_logical.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit) \
lvm2"

inherit rpm
