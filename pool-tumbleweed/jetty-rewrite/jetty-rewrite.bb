SUMMARY = "The rewrite module for Jetty"
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
This package contains The rewrite module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-rewrite-9.4.51-1.2.noarch.rpm"
RPM_HASH = "c954ae9574e6a453f22465951c16fdb703d701463f603c167186f867349e2e3430f86c916cb51c752525ebf98daa36ab5001413121bccef6408ac2c574572bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-rewrite \
mvn-org.eclipse.jetty-jetty-rewrite \
mvn-org.eclipse.jetty-jetty-rewrite-pom- \
osgi-org.eclipse.jetty.rewrite"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
