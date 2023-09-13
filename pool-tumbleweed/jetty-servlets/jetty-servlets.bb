SUMMARY = "The servlets module for Jetty"
DESCRIPTION = " \
Jetty is a 100% Java HTTP Server and Servlet Container. This means that you \
do not need to configure and run a separate web server (like Apache) in order \
to use Java, servlets and JSPs to generate dynamic content. Jetty is a fully \
featured web server for static and dynamic content. Unlike separate \
server/container solutions, this means that your web server and web \
application run in the same process, without interconnection overheads \
and complications. Furthermore, as a pure java component, Jetty can be simply \
included in your application for demonstration, distribution or deployment. \
Jetty is available on all Java supported platforms. \
 \
This package contains The servlets module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-servlets-9.4.51-2.1.noarch.rpm"
RPM_HASH = "9d580bb76d97a87998978e8a647d12837b34b6a396f6b0831da1b0f312680589fca94be60b6710285fd8a31bba8d9d422f287284613d760ff7eb7a2486bc249a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-servlets \
mvn-org.eclipse.jetty-jetty-servlets \
mvn-org.eclipse.jetty-jetty-servlets-pom- \
osgi-org.eclipse.jetty.servlets"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-continuation \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
