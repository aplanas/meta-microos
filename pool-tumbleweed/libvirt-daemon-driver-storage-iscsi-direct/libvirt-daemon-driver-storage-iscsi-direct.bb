SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "8055da555625315afe4a43c7f5788c6a547e4be219c939dcd09bb9959d59e6c71fd535ebf328e8b9b42056b0b06c0cac2d3829c5087de834840f100e525df021"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi-direct \
libvirt-daemon-driver-storage-iscsi-direct(aarch-64) \
libvirt_storage_backend_iscsi-direct.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libiscsi.so.9()(64bit) \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit)"

inherit rpm
