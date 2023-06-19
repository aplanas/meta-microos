SUMMARY = "Utilities for testing with HK2"
DESCRIPTION = "Hundred Kilobytes Kernel utilities for testing."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-testing-2.5.0-2.3.noarch.rpm"
RPM_HASH = "d4de14d4ef0db63c30f3b60e57f203dcf6b4c0b2e714ad0b0d63239c4177584febbcc46ebd63244ca2e30a401a5b15774f155021c06df5c9f23e21127b0f1aae"
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
