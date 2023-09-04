SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "1ca6f4478baf8bea37a1aec7dd082f1c5fb8760d34e5c08d68cc8254182ef5868fd35a7f5c0ed9d36c73ec6b7e639cf51ae1780d72198bac917109f061f3df57"

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
