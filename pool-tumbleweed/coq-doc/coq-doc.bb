SUMMARY = "Documentation for coq"
DESCRIPTION = "HTML reference manual for Coq and full documentation of the standard library."
LICENSE = "LGPL-2.1-only"

PV = "8.17.0"

RPM_NAME = "coq-doc-8.17.0-1.1.noarch.rpm"
RPM_HASH = "7bfbad21417fe277b8607b3a82a01e9487d0690f5a75bf7d75fff9b03ec6a0166177b2f37a4459911df50d5c82e4e7a34c7e87b514a877534b927addb59aa5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coq-doc"

RDEPENDS:${PN} += "coq"

inherit rpm
