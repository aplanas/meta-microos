SUMMARY = "Storage driver plugin for gluster"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for gluster \
volumes using libgfapi."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-gluster-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "79c961be7a37897d44a20abe855f4ac5ff95ab06e4207daa53074484b3e09fb43b3706c4e809d883f11878ddb507c05a504891b1bb29bd2ae0a34ad68fd03fa5"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-gluster \
libvirt-daemon-driver-storage-gluster(aarch-64) \
libvirt_storage_backend_gluster.so()(64bit) \
libvirt_storage_file_gluster.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgfapi.so.0()(64bit) \
libgfapi.so.0(GFAPI_3.4.0)(64bit) \
libglib-2.0.so.0()(64bit) \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit)"

inherit rpm
