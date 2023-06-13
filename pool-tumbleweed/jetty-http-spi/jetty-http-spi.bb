SUMMARY = "The http-spi module for Jetty"
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
This package contains The http-spi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-http-spi-9.4.51-1.1.noarch.rpm"
RPM_HASH = "d396133dd8a2f5064729a5c5fc5808b47ab4cd654ff04676462b85e8cc2763df22bffbc669acc4a61c02245a841c96d57f9d08c17326e7b9a7446956eb601543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http-spi \
mvn(org.eclipse.jetty:jetty-http-spi) \
mvn(org.eclipse.jetty:jetty-http-spi:pom:) \
osgi(org.eclipse.jetty.http.spi)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
