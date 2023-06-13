SUMMARY = "HK2 JMX module"
DESCRIPTION = "Hundred Kilobytes Kernel JMX module."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-jmx-2.5.0-2.3.noarch.rpm"
RPM_HASH = "d8330d045985d78ba7b9432807fda18920568b0eb90e946104e84c676fbd242c15aa3616536d33650fb53cc28c711fe567bb954f2e7642084c6c4375d4f1890f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-jmx \
mvn(org.glassfish.hk2:hk2-jmx) \
mvn(org.glassfish.hk2:hk2-jmx:pom:) \
osgi(org.glassfish.hk2.jmx)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.inject:javax.inject) \
mvn(org.glassfish.hk2:hk2-api) \
mvn(org.glassfish.hk2:hk2-utils) \
mvn(org.glassfish.hk2:osgi-resource-locator)"

inherit rpm
