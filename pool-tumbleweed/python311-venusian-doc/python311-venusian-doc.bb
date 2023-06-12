SUMMARY = "Documentation for python311-venusian"
DESCRIPTION = "This package contains documentation files for python311-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python311-venusian-doc-3.0.0-3.1.noarch.rpm"
RPM_HASH = "9401f3f59d34461a2909df6d05f2ed934ae1b2a09a3aa6c88f6d65c92dca7ace262d9dca89b889ac2305ffd2ce74338ff1c528c7608ccfcca424b68385ed51a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-venusian-doc"
RDEPENDS:${PN} += "python311-venusian"

inherit rpm
