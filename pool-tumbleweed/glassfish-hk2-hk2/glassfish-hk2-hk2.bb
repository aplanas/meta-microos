SUMMARY = "HK2 module of HK2 itself"
DESCRIPTION = "This is so that other modules can depend on HK2 as an HK2 module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-hk2-2.5.0-2.4.noarch.rpm"
RPM_HASH = "f044eeefbb6ef8145ee2afad98cb6fbb5f767b1edb04e1d4e57b3a0365892a6c634aeea4a25e538c58dc022bd1b711d585e5037ca56fd39478b65bbaefd052c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-hk2 \
mvn-org.glassfish.hk2-hk2 \
mvn-org.glassfish.hk2-hk2-pom- \
osgi-org.glassfish.hk2.hk2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.hk2-class-model \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-core \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
