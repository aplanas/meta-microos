SUMMARY = "HK2 ServiceLocator Default Implementation"
DESCRIPTION = "Hundred Kilobytes Kernel ServiceLocator Default Implementation."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-locator-2.5.0-4.1.noarch.rpm"
RPM_HASH = "48125842af4554904e279eabb806240443237b793269c5b43adc65fd8a218a756b66a232067671302d369307d64f1c99463484cf6737ce1dcfbdb24c5472e14a"
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
