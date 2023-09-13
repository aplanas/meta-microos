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

RPM_NAME = "jetty-http-spi-9.4.51-2.1.noarch.rpm"
RPM_HASH = "c28ae6b007f62f21c08954c3a7abfe3ff473ae96f76f8b6c6c4a1862fc2698d3e287a84529f638a3c521e2de680fd265db12aa41f9efe5a64922eda9ff5fac30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http-spi \
mvn-org.eclipse.jetty-jetty-http-spi \
mvn-org.eclipse.jetty-jetty-http-spi-pom- \
osgi-org.eclipse.jetty.http.spi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
