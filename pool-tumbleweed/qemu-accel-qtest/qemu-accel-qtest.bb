SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-accel-qtest-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "5794a4c64c217ba85ab9f83ea64596b32b536dbd686dd17e75e9da8053dd319de19dc9cc065d7be760027b89561b50eefbf191c01faaff1435c1436f5613c4be"

RPROVIDES:${PN} += "qemu-accel-qtest"

RDEPENDS:${PN} += ""

inherit rpm
