SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-accel-qtest-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "73e47643016e3c6675749b98bc3307fea548c55e430c5ca6971fb647bb02a21d897151592a9308646707008ed30bc088ebfdcb9c8dba32adc9d17d45f0aa055a"

RPROVIDES:${PN} += "qemu-accel-qtest"

RDEPENDS:${PN} += ""

inherit rpm
