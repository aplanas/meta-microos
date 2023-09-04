SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-client-qemu-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "6213681a1db42eb7bab14559915d32021489b2692b873f4161089a5f3f305099398953363e9902cbfafc925ed99d24cbdd1bedb5bbc785bf3273f7f50e992b3d"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
