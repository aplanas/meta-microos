SUMMARY = "An embedded Java compiler"
DESCRIPTION = "Janino is a super-small, super-fast Java compiler. \
 \
The 'JANINO' implementation of the 'commons-compiler' API: Super-small, \
super-fast, independent from the JDK's 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "janino-3.1.10-1.1.noarch.rpm"
RPM_HASH = "215913fb44699b4f935c1a0ba46f9182d74cc6a3564f5762e3181ea4e2b87292b22186af00c171cacf5ba9d69e03b9493cf706ee28d25ffba1a6674a33fe53f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "janino \
mvn-org.codehaus.janino-janino \
mvn-org.codehaus.janino-janino-pom- \
osgi-org.codehaus.janino.janino"

RDEPENDS:${PN} += "/usr/bin/bash \
commons-compiler \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.codehaus.janino-commons-compiler \
osgi-org.codehaus.janino.commons-compiler"

inherit rpm
