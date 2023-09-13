SUMMARY = "The fcgi module for Jetty"
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
This package contains The fcgi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-fcgi-9.4.51-2.1.noarch.rpm"
RPM_HASH = "1b673df53aadf8ac496424163355bb5488ba4927a109853e16a4e8143807beb1dfc4d4f62dd53f4ceb533360d8b193f25794bd85cf2f8733cb4a4a7150f8dd13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-fcgi \
mvn-org.eclipse.jetty.fcgi-fcgi-client \
mvn-org.eclipse.jetty.fcgi-fcgi-client-pom- \
mvn-org.eclipse.jetty.fcgi-fcgi-server \
mvn-org.eclipse.jetty.fcgi-fcgi-server-pom- \
osgi-org.eclipse.jetty.fcgi.client \
osgi-org.eclipse.jetty.fcgi.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-proxy \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
