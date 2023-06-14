SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "8055da555625315afe4a43c7f5788c6a547e4be219c939dcd09bb9959d59e6c71fd535ebf328e8b9b42056b0b06c0cac2d3829c5087de834840f100e525df021"

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
