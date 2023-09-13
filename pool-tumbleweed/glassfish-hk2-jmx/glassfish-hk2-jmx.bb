SUMMARY = "HK2 JMX module"
DESCRIPTION = "Hundred Kilobytes Kernel JMX module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-jmx-2.5.0-4.1.noarch.rpm"
RPM_HASH = "7661c133cbe24d872321c14fcbfdc0f36a9cf446531ac44cbe2f119b1c45e2b31d25ef12cdd1fbf288dd09b9a93f354089c2f0a045b60a42834e074ec04cc9cd"
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
