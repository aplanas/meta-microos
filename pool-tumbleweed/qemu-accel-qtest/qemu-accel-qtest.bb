SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-accel-qtest-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "60629b0016fc6c8d28808e19d889a838c48077397ad9ad2529e859befcca24bee1310c022471bafd7794da9c6aecc984430a8524355ad1e833eb220428b8464d"

RPROVIDES:${PN} += "qemu-accel-qtest"

RDEPENDS:${PN} += ""

inherit rpm
