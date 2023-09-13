SUMMARY = "The jndi module for Jetty"
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
This package contains The jndi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-jndi-9.4.51-2.1.noarch.rpm"
RPM_HASH = "d479161fb91470957b0013ed1e480e6eef75f0ece83bbefb0953a834b2d0df852b0364218c17107d8ae2ba2080434bbda927c7bc02810ae9ec77725af1150f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jndi \
mvn-org.eclipse.jetty-jetty-jndi \
mvn-org.eclipse.jetty-jetty-jndi-pom- \
osgi-org.eclipse.jetty.jndi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
