SUMMARY = "Documentation for coq"
DESCRIPTION = "HTML reference manual for Coq and full documentation of the standard library."
LICENSE = "LGPL-2.1-only"

PV = "8.17.1"

RPM_NAME = "coq-doc-8.17.1-1.2.noarch.rpm"
RPM_HASH = "c341e87b97b2a22c4db69c52f136aec3e14304628a5f5774a1fda46fdf70ce957cb848143578748ea8914aa0858209b4e214b164bd804bf84dc546d01a799228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coq-doc"

RDEPENDS:${PN} += "coq"

inherit rpm
