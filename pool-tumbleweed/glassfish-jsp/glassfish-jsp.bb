SUMMARY = "Glassfish J2EE JSP API implementation"
DESCRIPTION = "This project provides a container independent implementation of JSP \
2.3. The main goals are: \
  * Improves current implementation: bug fixes and performance \
    improvements \
  * Provides API for use by other tools, such as Netbeans \
  * Provides a sandbox for new JSP features; provides a reference \
    implementation of next JSP spec."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-2.3.4-2.11.noarch.rpm"
RPM_HASH = "845a7d89385eb273abdcfb063fc0c98e42a8e618beb747aab9e7d6248161c104b576b4e922104135edeadacacd82e1bfc173c11a706ec54d564976e2548056c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp \
javax.servlet.jsp \
jsp \
jsp2.3 \
mvn-org.eclipse.jetty.orbit-org.apache.jasper.glassfish \
mvn-org.eclipse.jetty.orbit-org.apache.jasper.glassfish-pom- \
mvn-org.glassfish.web-javax.servlet.jsp \
mvn-org.glassfish.web-javax.servlet.jsp-pom- \
osgi-org.glassfish.web.javax.servlet.jsp"

RDEPENDS:${PN} += "glassfish-jsp-api \
java-headless \
javapackages-filesystem \
mvn-javax.servlet.jsp-javax.servlet.jsp-api \
mvn-org.glassfish-javax.el"

inherit rpm
