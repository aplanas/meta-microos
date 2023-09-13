SUMMARY = "An embedded Java compiler"
DESCRIPTION = "Janino is a super-small, super-fast Java compiler. \
 \
The 'JANINO' implementation of the 'commons-compiler' API: Super-small, \
super-fast, independent from the JDK's 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "janino-3.1.10-2.1.noarch.rpm"
RPM_HASH = "c7a76ec0624ba414e41762bffb7ea06e414567f002f5c0178ebc6515c8babf6c492470374dac1879cace530cee6400fcf373181ed40cc30a47515c555a470210"
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
