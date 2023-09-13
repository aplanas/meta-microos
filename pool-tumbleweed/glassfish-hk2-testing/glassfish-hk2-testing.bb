SUMMARY = "Utilities for testing with HK2"
DESCRIPTION = "Hundred Kilobytes Kernel utilities for testing."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-testing-2.5.0-4.1.noarch.rpm"
RPM_HASH = "0a88c4e77f59ae94be19e0fdc9d15be2401af3cd7b981cee3d2548f16d79ab54bcef478ef86173f4d70b117e88d4f0542cae758a6a662ece2683adc835cde9e2"
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
