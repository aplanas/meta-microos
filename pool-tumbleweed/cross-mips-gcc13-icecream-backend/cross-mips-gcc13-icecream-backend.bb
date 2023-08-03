SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "219e6dade1d45f2e738ae7f2734c9062af299372566878884caa8741bd1fc9cf0200ef2b84b0cf5176650e7aec4ef319fa7d181e2b050ebf6a4e4a604c0350bf"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
