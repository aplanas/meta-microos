SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-testresults-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "02c329c84304ecb8c0a0489d1ab3440c7ebce73147cbec5aba94f0b482b47fd7ac0e149eb8bc8fdb7ff7043836de6c0795f6bd2888c3a760ead7c90220ab3423"

RPROVIDES:${PN} += "gcc13-testresults gcc13-testresults(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
