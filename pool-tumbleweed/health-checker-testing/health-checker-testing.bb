SUMMARY = "Test plugin for health-checker"
DESCRIPTION = "This package contains a script for testing the CaaSP health checker. \
It will report success or failures depending on previous states."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "health-checker-testing-1.9-1.1.noarch.rpm"
RPM_HASH = "c8ec0da229bb2593861401bc8d4ebc72ebbb304b5300461ef777f43346c85c537421e9b836dc848159877b91c9a11480ea056e04226807d433894d0de2e4e636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-testing"

RDEPENDS:${PN} += "/usr/bin/bash \
health-checker"

inherit rpm
