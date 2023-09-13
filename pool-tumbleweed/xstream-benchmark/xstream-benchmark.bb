SUMMARY = "The benchmark module for xstream"
DESCRIPTION = "This package contains the benchmark module for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-benchmark-1.4.20-3.1.noarch.rpm"
RPM_HASH = "ddb90145cd1b57249055a312f8d5df20d7a075a546b82033e9e77f11be8eed97d2cf38a6689448ed9863ad6ac66d19265ddf795d49957a5df59095ebdc0e6d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-benchmark \
mvn-com.thoughtworks.xstream-xstream-benchmark-pom- \
osgi-xstream-benchmark \
xstream-benchmark"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.xstream-xstream \
xstream"

inherit rpm
