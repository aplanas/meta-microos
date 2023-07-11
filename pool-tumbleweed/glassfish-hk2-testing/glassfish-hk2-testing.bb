SUMMARY = "Utilities for testing with HK2"
DESCRIPTION = "Hundred Kilobytes Kernel utilities for testing."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-testing-2.5.0-2.4.noarch.rpm"
RPM_HASH = "b75c07b0c80732afd4f5a70f0001f18b71fc38d2bd0789dc2b0d47ae048570061743f40dc7896e65ba0751d5e34888cfb5d31e900d86d84559bea6639279a53d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-locator-extras \
glassfish-hk2-locator-no-proxies \
glassfish-hk2-locator-no-proxies2 \
glassfish-hk2-runlevel-extras \
glassfish-hk2-testing \
glassfish-hk2-testng \
mvn-org.glassfish.hk2-hk2-junitrunner \
mvn-org.glassfish.hk2-hk2-junitrunner-pom- \
mvn-org.glassfish.hk2-hk2-testing-pom- \
osgi-org.glassfish.hk2.junitrunner"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.ow2.asm-asm-all"

inherit rpm
