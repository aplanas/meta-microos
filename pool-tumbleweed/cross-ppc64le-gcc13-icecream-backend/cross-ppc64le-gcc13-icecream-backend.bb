SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-ppc64le-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "60350e1b3fab401e99ce94b80cd9fdd3248d408c577f790dd4f8a1bf550af0a18090c071518a4f27645035ef1690e6a14b83ec8e1a33028c327dbce2328f7882"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
