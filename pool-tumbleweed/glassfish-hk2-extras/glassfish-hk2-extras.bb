SUMMARY = "HK2 extras module"
DESCRIPTION = "Default implementations for HK2 services."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-extras-2.5.0-4.1.noarch.rpm"
RPM_HASH = "d2a6cf7287fe14692b39ca20dfc1d7507474e388f08e50f41881e06c49793390f1fcb6becfa7fd25a5b20e78a02749bb0e04449fe5ae4fa5a185a7e2fbba92ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-extras \
mvn-org.glassfish.hk2-hk2-extras \
mvn-org.glassfish.hk2-hk2-extras-pom- \
osgi-org.glassfish.hk2.extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
