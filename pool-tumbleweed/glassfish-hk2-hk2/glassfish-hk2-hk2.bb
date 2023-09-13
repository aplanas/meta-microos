SUMMARY = "HK2 module of HK2 itself"
DESCRIPTION = "This is so that other modules can depend on HK2 as an HK2 module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-hk2-2.5.0-4.1.noarch.rpm"
RPM_HASH = "01414c1f0805361956bb28158c2c40746527fd18facb868ee02555119260d643a4610042fd5f711dcc4bf2c1b1ce8eaf7d4ff815a66968819127f700ae804eb5"
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
