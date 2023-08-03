SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-accel-qtest-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "7c640cc26ef25addfcc7822985eb9ef05e8ee84ae0aaec0ca8de632157d4b1967954aebd2d1c79a2734a4dae2c05ad3489dc072b164fb646cff659d244fc1fff"

RPROVIDES:${PN} += "qemu-accel-qtest"

RDEPENDS:${PN} += ""

inherit rpm
