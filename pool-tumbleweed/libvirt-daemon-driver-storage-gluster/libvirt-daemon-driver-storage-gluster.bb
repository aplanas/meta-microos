SUMMARY = "Storage driver plugin for gluster"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for gluster \
volumes using libgfapi."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-gluster-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "53ecf9d59594d09b916cbb50c8909724a2ff26fc92420e6df2c365358a1cac7cad06a46a07c65e803aa64c86f805322bfab7737dc4184689b170111dd6a8c0ea"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-gluster \
libvirt-storage-backend-gluster.so \
libvirt-storage-file-gluster.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfapi.so.0 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
