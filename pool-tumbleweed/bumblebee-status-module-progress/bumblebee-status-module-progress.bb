SUMMARY = "Show progress for cp, mv, dd, etc"
DESCRIPTION = "Show progress for cp, mv, dd, etc."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-progress-2.1.5-3.3.noarch.rpm"
RPM_HASH = "c6eaeddf56d90a4e7dcac49521489d41afd6236d3f2a9aced2cdcafc596ec9cafd313d060b541d9f16dd9c1e4f8ec9674ed353f50a026cd7d7d709cf02fb9073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-progress"

RDEPENDS:${PN} += "bumblebee-status \
progress"

inherit rpm
