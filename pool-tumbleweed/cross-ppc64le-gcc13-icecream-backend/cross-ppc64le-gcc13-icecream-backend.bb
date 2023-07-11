SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64le-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "30c308ca2d06447281d2956efffc608daca117e34487e2a17cc35dd4ecd89c40b1e67b9a3adf8abf02a48a5c73a0f3f2ecee56220c25db6e7e8b25ba3545cb44"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
