SUMMARY = "PXE ROMs for QEMU NICs"
DESCRIPTION = "Provides Preboot Execution Environment (PXE) ROM support for various emulated \
network adapters available with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.0.0+"

RPM_NAME = "qemu-ipxe-1.0.0+-2.1.noarch.rpm"
RPM_HASH = "b1bc710e44323ec3ad369e7e2853a5a4d97c1573a3a35267e4ea0be12c66417babc3c36134bfa7bfe065eeb5ba4b2519572986e0e2940a01d725b618d194c46e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ipxe"

RDEPENDS:${PN} += ""

inherit rpm
