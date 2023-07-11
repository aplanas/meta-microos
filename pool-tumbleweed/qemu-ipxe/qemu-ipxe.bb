SUMMARY = "PXE ROMs for QEMU NICs"
DESCRIPTION = "Provides Preboot Execution Environment (PXE) ROM support for various emulated \
network adapters available with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.0.0+"

RPM_NAME = "qemu-ipxe-1.0.0+-2.1.noarch.rpm"
RPM_HASH = "28ef4600bc976d2e15ab93082c8e6c36359543e10d5136a789985d19e64eb1ad7d51879738f555811b90c7af36a40bb8d317088821a00239dfca44a1262bc605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ipxe"

RDEPENDS:${PN} += ""

inherit rpm
