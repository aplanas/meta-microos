SUMMARY = "JUnit extension for performance and scalability testing"
DESCRIPTION = "JUnitPerf is a collection of JUnit test decorators used to measure the \
performance and scalability of functionality contained within existing \
JUnit tests."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "junitperf-javadoc-1.9.1-26.7.noarch.rpm"
RPM_HASH = "07dd008ba376c3cc4d43e268c337285d1b0d701f7608535ce76411710a3c0c449f48151fd6acd59b73dee227321445e47df57a209ecc06869ebe7b0955df276d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junitperf-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
