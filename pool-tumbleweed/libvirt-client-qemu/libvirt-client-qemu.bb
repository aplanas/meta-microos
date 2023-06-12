SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-client-qemu-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "361685acfaa8ee3c4de4203b8afb09f58364b32fcd9a5910915b9486e802a24bad53c2cf0cb0c8c77c5740ff98657510a51af06b61926e6c5a887d5bea8723db"

RPROVIDES:${PN} += "libvirt-client-qemu \
libvirt-client-qemu(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
