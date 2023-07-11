SUMMARY = "An embedded Java compiler"
DESCRIPTION = "Janino is a super-small, super-fast Java compiler. \
 \
The 'JANINO' implementation of the 'commons-compiler' API: Super-small, \
super-fast, independent from the JDK's 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "janino-3.1.6-1.11.noarch.rpm"
RPM_HASH = "6da22752f2f80abd7cfb5c57519baa2f6b71d9d4bb888e7d828fe0d96aae2161564ff3172a536ad74fedc5526656d79a238ec31d908e4d27035bda4211feb315"
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
