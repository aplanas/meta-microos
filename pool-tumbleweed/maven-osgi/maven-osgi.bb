SUMMARY = "Library for Maven-OSGi integration"
DESCRIPTION = "Library for Maven-OSGi integration. \
 \
This is a replacement package for maven-shared-osgi"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "maven-osgi-0.2.0-3.11.noarch.rpm"
RPM_HASH = "ab19ff5b113efe631067a3100cbe0bd21b3aa74c5a5e9cbfecb4135b789e2b2cb3a701f0a437756ff920b16837f04f2ca177dc674244c31213bdbd3245dd0b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-osgi \
mvn-org.apache.maven.shared-maven-osgi \
mvn-org.apache.maven.shared-maven-osgi-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute-bndlib \
mvn-org.apache.maven-maven-project"

inherit rpm
