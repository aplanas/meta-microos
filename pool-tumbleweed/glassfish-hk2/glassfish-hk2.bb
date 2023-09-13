SUMMARY = "Glassfish Hundred Kilobytes Kernel"
DESCRIPTION = "HK2 for Hundred Kilobytes Kernel is an abstraction to \
a module subsystem coupled with a simple yet powerful \
component model to build server side software."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-2.5.0-4.1.noarch.rpm"
RPM_HASH = "73bb87d1ccaa08964bc8e0eba08907fdb2ca63a45d262d90df3ba84eb7175fe48033420ff6f570af80ca43363d472e5102e1cf1c2e56a8464aa419c3f78aebae"
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
