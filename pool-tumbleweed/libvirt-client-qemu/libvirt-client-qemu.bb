SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-client-qemu-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "770d8eb5cc5427189a9ea4e4b69acc44c10451f8fbfceefb9b9d960b6a22ef4b721cf08e19d79b3a9dae5fb060bfdaa30d9120117e2bbd3f16e911427ab8f06d"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
