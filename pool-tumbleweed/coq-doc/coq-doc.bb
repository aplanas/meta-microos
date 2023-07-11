SUMMARY = "Documentation for coq"
DESCRIPTION = "HTML reference manual for Coq and full documentation of the standard library."
LICENSE = "LGPL-2.1-only"

PV = "8.17.1"

RPM_NAME = "coq-doc-8.17.1-1.1.noarch.rpm"
RPM_HASH = "a9e51b93827a638d6160613c89d9e13e7ed3108b7a30d4f6a049c72fe27d3352a094cfe60568bff50df35d39c13bf9c19015301e8f055d55b5ba3e9116f970d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coq-doc"

RDEPENDS:${PN} += "coq"

inherit rpm
