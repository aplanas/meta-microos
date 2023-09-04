SUMMARY = "PXE ROMs for QEMU NICs"
DESCRIPTION = "Provides Preboot Execution Environment (PXE) ROM support for various emulated \
network adapters available with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.0.0+"

RPM_NAME = "qemu-ipxe-1.0.0+-1.1.noarch.rpm"
RPM_HASH = "e9836036d41665b553aada090a0c15993f4a83bc85f799536f4493cfae4d654cad69008786c41c06f0b1374313079e272c998f889b3fd8db9a48e41b75a63ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ipxe"

RDEPENDS:${PN} += ""

inherit rpm
