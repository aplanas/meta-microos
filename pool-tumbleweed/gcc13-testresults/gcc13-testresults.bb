SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-testresults-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1bc4a2550c08be640c2341c821d1cc41862a81b82981c1b17df4401972dfda249d327d9220eac6a521976ea810015439f82a0ab96bf85335b7f9ca0da224143f"

RPROVIDES:${PN} += "gcc13-testresults"

RDEPENDS:${PN} += ""

inherit rpm
