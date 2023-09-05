SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "2b8923a6c92379d70e86cb358fec0bef15d3f52a46f675ac1e225d08c4e0817c18d612a021f7af05912cb2db6c811cbc5b31244b510bf28ec86917506a83dc95"

RPROVIDES:${PN} += "cross-x86-64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
