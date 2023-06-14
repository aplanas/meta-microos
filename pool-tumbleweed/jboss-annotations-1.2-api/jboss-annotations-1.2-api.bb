SUMMARY = "Java EE Annotations 1.2 API"
DESCRIPTION = "The Java EE  Annotations 1.2 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.0.2"

RPM_NAME = "jboss-annotations-1.2-api-1.0.2-2.6.noarch.rpm"
RPM_HASH = "95cbca3d57075c595e87f7b61271ac380dc215c0c8ffdc2390d55550cdfb55abc22f46039d84ceba22c255d3aaf8e414bba6659bc96ce21a68a18f5035ef8ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-annotations-1.2-api \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec-pom- \
osgi-org.jboss.spec.javax.annotation.jboss-annotations-api-1.2-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
