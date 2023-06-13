SUMMARY = "JUnit extension for performance and scalability testing"
DESCRIPTION = "JUnitPerf is a collection of JUnit test decorators used to measure the \
performance and scalability of functionality contained within existing \
JUnit tests."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "junitperf-javadoc-1.9.1-26.6.noarch.rpm"
RPM_HASH = "bba0e4a7b795d4049187f5e6968d768d219efeeb8af12f3ff6d58dd32d33627ea2eb5d0db4b226c88405b84191f51a8c139661cc445c209a26c56a6df6878c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junitperf-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
