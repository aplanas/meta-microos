SUMMARY = "JUnit extension for performance and scalability testing"
DESCRIPTION = "JUnitPerf is a collection of JUnit test decorators used to measure the \
performance and scalability of functionality contained within existing \
JUnit tests."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "junitperf-demo-1.9.1-26.7.noarch.rpm"
RPM_HASH = "535c427224fc59c7cb4b22c089d4171d367dff041318640e5c7b3da454c6cec4f6b3fca660e36f03591753a29b7375511c7814477581bcb89a611cd7c62a9ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junitperf-demo"

RDEPENDS:${PN} += "junitperf"

inherit rpm
