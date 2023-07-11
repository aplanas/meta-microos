SUMMARY = "HK2 configuration modules"
DESCRIPTION = "Hundred Kilobytes Kernel configuration modules."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-configuration-2.5.0-2.4.noarch.rpm"
RPM_HASH = "282e3591987503453841e0c58aa923fc7ad934f4ba90afc22a295ee242274b487f8fecb42166f5687773658ed600e0ba6881125cd5e6dab70d4c182f1e871076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-configuration \
mvn-org.glassfish.hk2-hk2-configuration-hub \
mvn-org.glassfish.hk2-hk2-configuration-hub-pom- \
mvn-org.glassfish.hk2-hk2-configuration-integration \
mvn-org.glassfish.hk2-hk2-configuration-integration-pom- \
mvn-org.glassfish.hk2-hk2-configuration-persistence-pom- \
mvn-org.glassfish.hk2-hk2-configuration-pom- \
mvn-org.glassfish.hk2-hk2-property-file \
mvn-org.glassfish.hk2-hk2-property-file-pom- \
osgi-org.glassfish.hk2.configuration-hub \
osgi-org.glassfish.hk2.configuration-integration \
osgi-org.glassfish.hk2.property-file"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
