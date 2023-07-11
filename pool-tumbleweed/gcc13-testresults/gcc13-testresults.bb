SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-testresults-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "5ec273ea6d46a72a5c1eb775b67bbec5a5c0436449408e2cdfa8c613a462a45eeffb9da6e52dc8f94d6878cb6e4ad8aa7c3639314b0b2249dbddf823f631e5ef"

RPROVIDES:${PN} += "gcc13-testresults"

RDEPENDS:${PN} += ""

inherit rpm
