SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "70ca07b39be50e4d849b6248e608602376bc8aa51972276880a0d5ce4673f94a199aecb18a274a9b8aae603897f05c4bb3d4a1d31aa0c614fb81b07f35dfcc29"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
