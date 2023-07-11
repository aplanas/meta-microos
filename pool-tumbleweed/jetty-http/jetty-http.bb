SUMMARY = "The http module for Jetty"
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
This package contains The http module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-http-9.4.51-1.2.noarch.rpm"
RPM_HASH = "6588d18a1a5212f670f100c5a8308235f3243c70aeea893bdbe1068165ef97a02688b5fbec5ee8f4f187502133f994d53032a593f4551d888bc2e027a8257de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-http-pom- \
osgi-org.eclipse.jetty.http"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
