SUMMARY = "JUnit extension for performance and scalability testing"
DESCRIPTION = "JUnitPerf is a collection of JUnit test decorators used to measure the \
performance and scalability of functionality contained within existing \
JUnit tests."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "junitperf-1.9.1-26.6.noarch.rpm"
RPM_HASH = "69a318e964c386e8ff013ae0944862ce3f124f4b69964d7c715e3f5a677286320d768b2497e345f52e134d78dcccdc4af0ae3390fe0d0a6ed723481e10cd79b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junitperf"

RDEPENDS:${PN} += "junit"

inherit rpm
