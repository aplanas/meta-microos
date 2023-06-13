SUMMARY = "The cdi module for Jetty"
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
This package contains The cdi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-cdi-9.4.51-1.1.noarch.rpm"
RPM_HASH = "7b3781de3411611383b310faf3bbcc8bfb20d4844f746e0e424fc325ca3ff4716a24832157a6592dcaf70ae0728330dda501a7eb3f75303726aefc9eae58244a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-cdi \
mvn(org.eclipse.jetty:jetty-cdi) \
mvn(org.eclipse.jetty:jetty-cdi:pom:) \
osgi(org.eclipse.jetty.cdi)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty:jetty-annotations) \
mvn(org.eclipse.jetty:jetty-server) \
mvn(org.eclipse.jetty:jetty-util) \
mvn(org.eclipse.jetty:jetty-webapp)"

inherit rpm
