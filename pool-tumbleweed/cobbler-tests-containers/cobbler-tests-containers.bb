SUMMARY = "Dockerfiles and scripts to setup testing containers"
DESCRIPTION = "Dockerfiles and scripts to setup testing containers"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "cobbler-tests-containers-3.3.3-1.1.noarch.rpm"
RPM_HASH = "597a9a498edb75bfb4ad23742b5ba3dbeb90d3c47490fd96a048319756dc26c4297b3a6f47296e8d9e7942a19b64b4d8f225870db7af653f0ad3c55979b7dda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests-containers"

RDEPENDS:${PN} += "/usr/bin/bash \
cobbler"

inherit rpm
