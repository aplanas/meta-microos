SUMMARY = "PXE ROMs for QEMU NICs"
DESCRIPTION = "Provides Preboot Execution Environment (PXE) ROM support for various emulated \
network adapters available with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.0.0+"

RPM_NAME = "qemu-ipxe-1.0.0+-1.1.noarch.rpm"
RPM_HASH = "9958d0e60574771d91d07c65539f05add720283fcd78da3f086319358765ff6ea03ba262f8b28b681f939d1cbfc0902df22c1c7f6ef68d475b19ead0527d424d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ipxe"

RDEPENDS:${PN} += ""

inherit rpm
