SUMMARY = "Storage driver plugin for multipath volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for \
multipath storage using device mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-mpath-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "969e2e72add6a6fff5582b598bacd27beb477b0d4ae14f078ed86ec805dca579d925619d50e6fd4ad1a0206f1ea24c5c631f4179d35eccb3b70c47a86facbb95"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-mpath \
libvirt-storage-backend-mpath.so"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
