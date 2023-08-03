SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-client-qemu-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "c9a93e47d64f22b69a1e245f3fe69b694d54cbcd0c0bf164cb8632a7f54ec730c3e22921d58cfbb43b5dd13a06dd6a9eaf1c2ef5837036d9b4a3271f4f1d37ff"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
