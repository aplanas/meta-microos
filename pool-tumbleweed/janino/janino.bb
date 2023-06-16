SUMMARY = "An embedded Java compiler"
DESCRIPTION = "Janino is a super-small, super-fast Java compiler. \
 \
The 'JANINO' implementation of the 'commons-compiler' API: Super-small, \
super-fast, independent from the JDK's 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "janino-3.1.6-1.10.noarch.rpm"
RPM_HASH = "ccc13778153e81703cecc7fac1e9d62c506f3e4e66ceee7149383828dd6cc05bd033b868e9360349324fe9cb67cde50a600d2a00a187d7acb3dee9a721e5b100"
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
