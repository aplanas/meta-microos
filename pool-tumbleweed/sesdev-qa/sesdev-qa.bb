SUMMARY = "Integration test script for validating Ceph deployments"
DESCRIPTION = "Integration test script for validating Ceph clusters deployed \
by sesdev"
LICENSE = "MIT"

PV = "1.12.1+1619444076.g04475be"

RPM_NAME = "sesdev-qa-1.12.1+1619444076.g04475be-1.6.noarch.rpm"
RPM_HASH = "3126d40dd0da5a35edb200eab2baafc0f5fa719fe5b044ce0a1f7b0a883efd8f1e0f1d94e9ed52da28ffc69c19ec5129a80d4852ca9e12018faad464d9989ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sesdev-qa"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
