SUMMARY = "Java Servlet API"
DESCRIPTION = "The javax.servlet package contains a number of classes \
and interfaces that describe and define the contracts between \
a servlet class and the runtime environment provided for \
an instance of such a class by a conforming servlet container."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0) & Apache-2.0"

PV = "3.1.0"

RPM_NAME = "glassfish-servlet-api-3.1.0-2.20.noarch.rpm"
RPM_HASH = "ac3a72a2a4ad56a167bd98bfed381a7d01f0c6c9e303008c0fe0749469d37ed86ac5a603196e40abf2aafdd3eec90b5ee62de46038338ca3d462e8d82a850e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-servlet-api \
mvn-javax.servlet-javax.servlet-api \
mvn-javax.servlet-javax.servlet-api-pom- \
mvn-javax.servlet-servlet-api \
mvn-javax.servlet-servlet-api-pom- \
mvn-org.apache.geronimo.specs-geronimo-servlet-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-3.0-spec-pom- \
mvn-org.eclipse.jetty.orbit-javax.servlet \
mvn-org.eclipse.jetty.orbit-javax.servlet-pom- \
osgi-javax.servlet-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
