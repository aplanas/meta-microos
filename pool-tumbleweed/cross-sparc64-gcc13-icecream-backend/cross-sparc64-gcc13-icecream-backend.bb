SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "3f51829adf2257dea0d75977ed672c36ba29fac4d96680d972c7ae38aac90b8c442c85560caca77bb9cb006effecc0ae63f041efa5dede937ecbce8ecb21313a"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
