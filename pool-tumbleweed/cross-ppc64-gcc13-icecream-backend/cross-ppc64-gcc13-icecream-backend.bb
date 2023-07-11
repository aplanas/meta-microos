SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "45ecb029a664f15f3adf7fe00c6508b625b8ce34949819e71a45d8f004f6c72c8314aa58588e663af3647f4ccb3c871de5920390e72983778a1b07d25b183a00"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
