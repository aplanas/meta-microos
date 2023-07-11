SUMMARY = "Java EE Annotations 1.2 API"
DESCRIPTION = "The Java EE  Annotations 1.2 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.2"

RPM_NAME = "jboss-annotations-1.2-api-1.0.2-2.7.noarch.rpm"
RPM_HASH = "fd49dba5f470d233a957597b560968f0a290950fa53f1d00c64584d398c2ca755e19310787436f791801deca9e8c4892a8ba13402dabea5247816b1ed244faba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-annotations-1.2-api \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec-pom- \
osgi-org.jboss.spec.javax.annotation.jboss-annotations-api-1.2-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
