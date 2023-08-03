SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "82ab8afe51c5a6a859cd704ad16911697b3e821bd3ea644b2ab83ef86c1e3a177beff03f59473a548fdcb0cd28c7ae3356baaa5a28564a603d2bde8ff2407213"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
