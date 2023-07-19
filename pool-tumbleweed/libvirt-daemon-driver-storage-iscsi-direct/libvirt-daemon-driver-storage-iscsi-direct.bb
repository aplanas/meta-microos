SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "265463d9cb01745deba2c20a56c3e5f64bcdefbdc0f251d487027001863f20ffbfc08c99a1af99654014d195af9bac5f6ad94639fffd9dce909976d5f240dbd0"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi-direct \
libvirt-storage-backend-iscsi-direct.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libiscsi.so.9 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
