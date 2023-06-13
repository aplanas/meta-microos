SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python39-rarfile-doc-4.0-3.5.noarch.rpm"
RPM_HASH = "61ca86934a8f1ab8ff193dd0e640484e9fe53306f321c60940dda0e7bc5c1a7de1b1f418e4ff16e0edbc231edb4c7ffaf68803ff90723f25b3b19e179f0b68bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-rarfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
