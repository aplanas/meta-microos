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

RPM_NAME = "jetty-jndi-9.4.51-1.2.noarch.rpm"
RPM_HASH = "906d0ea8d2dc450382802d00c2146a0faca760c4950b71cfacabd450a3ab2de628bb8f3da7d808fe6c3d68459950ac74b035d10d3c3884201cbc6f27f53f957e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jndi \
mvn-org.eclipse.jetty-jetty-jndi \
mvn-org.eclipse.jetty-jetty-jndi-pom- \
osgi-org.eclipse.jetty.jndi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
