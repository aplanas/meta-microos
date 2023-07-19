SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "cbf4a6996333de41dacff747c2b013c2d3423f9001172b895d49a6295bbc8dc8a41954119ebe56adeff28142eceb186f65e6bc7b89a2514987fbe2b3f32671b1"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi \
libvirt-storage-backend-iscsi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0 \
open-iscsi"

inherit rpm
