SUMMARY = "HK2 extras module"
DESCRIPTION = "Default implementations for HK2 services."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-extras-2.5.0-2.4.noarch.rpm"
RPM_HASH = "082d2dc94f5da626b795cda7f317895bcd894fa253b907a0a185f5c39a0d1778344082bd732d9e61c3d4496e4c082b62fbf6c68eebfe2a22917c0a3492cbcd3b"
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
