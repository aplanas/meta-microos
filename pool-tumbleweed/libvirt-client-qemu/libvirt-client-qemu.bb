SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-client-qemu-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "1fcab042f309a4b8677bb92546e98139765e1a2ebaa324767b6f1d187ab4ee32cb4738a3f2fd3542aeb02098a20f545329599e3e347e1df31ed94803f30fb668"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
