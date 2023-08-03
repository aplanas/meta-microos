SUMMARY = "Salt modules and states for SAP Applications and SLE-HA components management"
DESCRIPTION = "Salt modules and states for SAP Applications and SLE-HA components management"
LICENSE = "Apache-2.0"

PV = "0.3.18+git.1690200022.db379c1"

RPM_NAME = "salt-shaptools-0.3.18+git.1690200022.db379c1-1.1.noarch.rpm"
RPM_HASH = "f8d2a066871729553246c12014e642318fe3b1c7c2e60408524cb8ec5303894b4a170acf67630463ddb757c5d604fb92e5f02c741e88335a90314a600245dae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-shaptools"

RDEPENDS:${PN} += "python3-six"

inherit rpm
