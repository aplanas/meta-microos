SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-accel-qtest-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "3baeb9549335632e856760da0546c36f8ee976ebb83aea61e9b951ff27488e48ffc764de0681a3a9fd4e9decfd8c18be2d7b36179185aa04561fc16b3b8c9496"

RPROVIDES:${PN} += "qemu-accel-qtest"

RDEPENDS:${PN} += ""

inherit rpm
