SUMMARY = "Storage driver plugin for gluster"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for gluster \
volumes using libgfapi."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-gluster-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "7a0da7a86cfbf1389f0d6ff0e4a1c107151ea4aeda1137acc975e970ab246c2c0c4e868a32e64fe5067d2dc5017688963f08a57dca54f79ee421329df64dcf2f"

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
