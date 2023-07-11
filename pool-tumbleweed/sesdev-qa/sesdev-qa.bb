SUMMARY = "Integration test script for validating Ceph deployments"
DESCRIPTION = "Integration test script for validating Ceph clusters deployed \
by sesdev"
LICENSE = "MIT"

PV = "1.12.1+1619444076.g04475be"

RPM_NAME = "sesdev-qa-1.12.1+1619444076.g04475be-1.7.noarch.rpm"
RPM_HASH = "160fd371e0a21ab1348afe726394dbf78c88d10000c579c8a36615a0f4a0649e71e60791093edf3e3b552234a630a2f8377cb05e44a2ccd7cc3a1c1f6bfa4fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sesdev-qa"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
