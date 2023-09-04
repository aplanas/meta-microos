SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "12d0afa4aa09977de67f9d52b9c4def34f88e96123c681605c2f5a2d199dcdd4b480a1e8b60066a594e79aabc316138068f8dd50098fdf47bc2d6c3c9f37a532"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
