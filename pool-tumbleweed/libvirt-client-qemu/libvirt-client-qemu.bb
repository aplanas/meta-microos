SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-client-qemu-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "ea0c4d18421d473a21a2da3ea403e475b69ca81766caa5849d8b6dc9f56aa4cdf3a6a884ef6f56cb6551f54faf850cb4ce4889e39d66b2f73ec201128479b8ff"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
