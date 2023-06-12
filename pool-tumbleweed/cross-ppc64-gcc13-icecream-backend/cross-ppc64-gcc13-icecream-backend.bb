SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "b3b18373fc0160d752a06751917cdae2577f98c9fe9b40bdce492c141efa5e73cb7ef2f7f21a6d9145ec03f8e58529466c6a53564f43b579155736b2818dab80"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend \
cross-ppc64-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
