SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "22e8b794bb22b5e42156407ee7611c2ec6bf8e08bb66e3c9ac49df9578173d2f20babbd84b574bf3c2cb165b5fcae602b5bdcbe038139bc4118509b98e7c45f2"

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
