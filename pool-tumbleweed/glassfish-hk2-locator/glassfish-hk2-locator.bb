SUMMARY = "HK2 ServiceLocator Default Implementation"
DESCRIPTION = "Hundred Kilobytes Kernel ServiceLocator Default Implementation."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-locator-2.5.0-2.4.noarch.rpm"
RPM_HASH = "02f3d6a23712c84d9d79741b6d384fd0cb354c05124bdd60053b442c71887b31058d63891083abfa60646239f4e3f73b67e6501d31b4adbfd4566b3a22f737ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-locator \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-locator-pom- \
osgi-org.glassfish.hk2.locator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.javassist-javassist"

inherit rpm
