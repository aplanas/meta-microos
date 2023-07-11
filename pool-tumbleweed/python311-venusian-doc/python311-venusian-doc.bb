SUMMARY = "Documentation for python311-venusian"
DESCRIPTION = "This package contains documentation files for python311-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python311-venusian-doc-3.0.0-4.2.noarch.rpm"
RPM_HASH = "e6f1811c556fa2493ab61f4f42ff25c4f91cc5bb4ad7f1f99aa0dd6305775113c3991228fa8fbc301fd185b5412d9dc9e8d0ad5c28f29846319d2560bdbda227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian-doc \
python311-venusian-doc"

RDEPENDS:${PN} += "python311-venusian"

inherit rpm
