SUMMARY = "Library of assertions similar to fest-assert"
DESCRIPTION = "A set of strongly-typed assertions to use for unit testing \
(either with JUnit or TestNG)."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "assertj-core-3.8.0-1.23.noarch.rpm"
RPM_HASH = "463f3a1811ff2ab1791cd82ddd475fbdf95797a485c653b9744b18ec1cafbb77998ed048a259a13b7124a0916aae2399da380d1446a809a7e1c2fb91a379aa36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "assertj-core \
mvn-org.assertj-assertj-core \
mvn-org.assertj-assertj-core-pom- \
osgi-org.assertj.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.mockito-mockito-core"

inherit rpm
