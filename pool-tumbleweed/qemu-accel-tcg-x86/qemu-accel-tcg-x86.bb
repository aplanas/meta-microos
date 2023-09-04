SUMMARY = "TCG accelerator for QEMU"
DESCRIPTION = "TCG is the QEMU binary translator, responsible for converting from target to \
host instruction set. \
 \
This package provides the TCG accelerator for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-accel-tcg-x86-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "8645fa81a5cf0f707de628b45100635126dac1acebd2053c3ca265ecc39740c87b7da57de1029b3ef6ed3f6dd666dd995aa49e84ca6ebd4f1fe066d2c110eea4"

RPROVIDES:${PN} += "qemu-accel-tcg-x86"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
