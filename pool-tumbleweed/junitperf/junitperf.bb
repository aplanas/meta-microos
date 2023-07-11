SUMMARY = "JUnit extension for performance and scalability testing"
DESCRIPTION = "JUnitPerf is a collection of JUnit test decorators used to measure the \
performance and scalability of functionality contained within existing \
JUnit tests."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "junitperf-1.9.1-26.7.noarch.rpm"
RPM_HASH = "63ad119897d55554ce815714dc8cce178a43c1bf3d84811d17f369c1696d32a9e50759fda010e9c8ccc4162a5b180978204adf363d1c2ad12daa10f0eba1d3da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junitperf"

RDEPENDS:${PN} += "junit"

inherit rpm
