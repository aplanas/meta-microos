SUMMARY = "Java regression test package"
DESCRIPTION = "JUnit is a regression testing framework written by Erich Gamma and Kent Beck. \
It is used by the developer who implements unit tests in Java."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-4.13.2-4.2.noarch.rpm"
RPM_HASH = "3456d9ba307e6028e984509dc983360d8716400745754cbd40beb11f1fe96e9ef82f689695abe4d4ea07c88f45bdc997ff887f71228a30b8fde2d13c4bc53beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit \
junit-demo \
junit4 \
junit4-demo \
mvn-junit-junit \
mvn-junit-junit-pom- \
osgi-org.junit"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.hamcrest-hamcrest-core"

inherit rpm
