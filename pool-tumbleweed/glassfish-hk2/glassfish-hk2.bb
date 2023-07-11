SUMMARY = "Glassfish Hundred Kilobytes Kernel"
DESCRIPTION = "HK2 for Hundred Kilobytes Kernel is an abstraction to \
a module subsystem coupled with a simple yet powerful \
component model to build server side software."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-2.5.0-2.4.noarch.rpm"
RPM_HASH = "73fe071a1f99ab8f6c5215d9e52704b426b99cbcb9d7d5a4d356046f23fb986a459f7ffcf03100aa266cfee07edd574fe95640f7efc7276d0333178a3c1489b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2 \
mvn-org.glassfish.hk2-hk2-bom-pom- \
mvn-org.glassfish.hk2-hk2-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
