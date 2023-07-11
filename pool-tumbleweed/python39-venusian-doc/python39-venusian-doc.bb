SUMMARY = "Documentation for python39-venusian"
DESCRIPTION = "This package contains documentation files for python39-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python39-venusian-doc-3.0.0-4.2.noarch.rpm"
RPM_HASH = "69c111cc8e73d67bd6e975f3a288748d6771bbfdb91925778b4580acbf67df2fd1a5041915084b8535600996fdb4a493dd2caf84bd815101c2ad366eabed10e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-venusian-doc"

RDEPENDS:${PN} += "python39-venusian"

inherit rpm
