SUMMARY = "Common Annotations API Specification (JSR 250)"
DESCRIPTION = "Common Annotations APIs for the Java Platform (JSR 250)."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3.2"

RPM_NAME = "glassfish-annotation-api-1.3.2-3.7.noarch.rpm"
RPM_HASH = "9281d8b54be2c85c36996e97f10b475f6e227fb39483c1696d20f23dd160952fe383472c646a1ebf7d7b4f473133db8628dd0e41c3a65c65529ce2553b087835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-annotation-api \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.annotation-javax.annotation-api-pom- \
osgi-javax.annotation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
