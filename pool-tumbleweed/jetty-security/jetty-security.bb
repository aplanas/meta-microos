SUMMARY = "The security module for Jetty"
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
This package contains The security module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-security-9.4.51-1.2.noarch.rpm"
RPM_HASH = "a9ad9cfa3510774fb9179c61ef625856506ee15ca450758b2b0f73fa1275985214d7a1590bb9e3c404f06539a3fb1422f441e08e74e39f06a6fc86d7558b6576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-security \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-security-pom- \
osgi-org.eclipse.jetty.security"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
