SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "7197633c29b50862b107abac1c7c7bd906a7e6e103ba3595a09f136b53a72719492621af1f2efe8ea54d3e1a24c667d9bc8422f2363631ed3946a0e075a95795"

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
