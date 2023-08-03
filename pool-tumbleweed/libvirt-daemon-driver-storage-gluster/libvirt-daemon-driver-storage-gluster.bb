SUMMARY = "Storage driver plugin for gluster"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for gluster \
volumes using libgfapi."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-gluster-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "31a9ed589f780399e4582db48c7e02f73c0894e8ae8435c2524c0b1772ee37d9c78ca3a99ee2519b8b80a25d9d1efccd15e3501d71a8fa727c66ec7ad97983cf"

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
