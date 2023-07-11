SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-client-qemu-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "6826e4949a774ad5aecd03e38f6d9b1b0db4df7a8bfe45f20c33c5ac5aed0b7e52886af07deb93563bbf759a68ffd87ab9fe2170bff8b4bf3ed8f4bc4f4d526e"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
