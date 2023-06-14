SUMMARY = "TCG accelerator for QEMU"
DESCRIPTION = "TCG is the QEMU binary translator, responsible for converting from target to \
host instruction set. \
 \
This package provides the TCG accelerator for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-accel-tcg-x86-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "c46756ae67fc3b899015cab7ef951ed6abdf329a186591ec1bf478eead4e6166bcc87b87fe408d6720e3cc7b82deef91267d257f502dc03d40d063bb968dd791"

RPROVIDES:${PN} += "qemu-accel-tcg-x86"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
