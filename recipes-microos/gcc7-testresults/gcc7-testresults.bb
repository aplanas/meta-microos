SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-testresults-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "bdcc698e6522de154261d502586e3abf6566ec3fdf88ea69e068da3fccf082fea1a04c79bc6976ee6f07eee4bc1f5c6566d482cdd51e2e8ed2b358aaac2dba4c"

RPROVIDES:${PN} += "gcc7-testresults gcc7-testresults(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
