SUMMARY = "Library for Maven-OSGi integration"
DESCRIPTION = "Library for Maven-OSGi integration. \
 \
This is a replacement package for maven-shared-osgi"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "maven-osgi-0.2.0-3.10.noarch.rpm"
RPM_HASH = "ef48c2f50671a7c5ce2df4494de7d0ab8c09e9616517e5430d5953567980232b97d4e71e4c28eb31f72f5bb4a34c60000f2485a8240ac0bd49a763d741a5202b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-osgi \
mvn(org.apache.maven.shared:maven-osgi) \
mvn(org.apache.maven.shared:maven-osgi:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(biz.aQute:bndlib) \
mvn(org.apache.maven:maven-project)"

inherit rpm
