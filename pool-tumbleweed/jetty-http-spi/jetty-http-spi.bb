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

RPM_NAME = "jetty-http-spi-9.4.51-1.2.noarch.rpm"
RPM_HASH = "0f44103178358819c19fa2c4a4286d9b819b2076d2464f97865d98a792aee5a52ede7762061995cd322c4db7a77f6264c6d879b75e99db9a2729ef24104cfb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http-spi \
mvn-org.eclipse.jetty-jetty-http-spi \
mvn-org.eclipse.jetty-jetty-http-spi-pom- \
osgi-org.eclipse.jetty.http.spi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
