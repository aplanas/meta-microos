SUMMARY = "HK2 JMX module"
DESCRIPTION = "Hundred Kilobytes Kernel JMX module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-jmx-2.5.0-2.4.noarch.rpm"
RPM_HASH = "544ae854dcb6164341a0a5236395c85de722f14559613befd49e2bc9421926a65f545e03f1ed1ee7ca88c14f544217d381f75920cae3c10531ef2e17a6dcb74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-jmx \
mvn-org.glassfish.hk2-hk2-jmx \
mvn-org.glassfish.hk2-hk2-jmx-pom- \
osgi-org.glassfish.hk2.jmx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.glassfish.hk2-osgi-resource-locator"

inherit rpm
