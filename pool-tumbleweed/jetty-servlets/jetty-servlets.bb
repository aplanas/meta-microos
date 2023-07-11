SUMMARY = "The servlets module for Jetty"
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
This package contains The servlets module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-servlets-9.4.51-1.2.noarch.rpm"
RPM_HASH = "32ec83fff31e442b187feb80c2e439037721957d98eaf0ad9fc393cc84c3474bcef4c76338c80af733d5e720cad59515e6fe3c39272cef53bea903573a45c0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-servlets \
mvn-org.eclipse.jetty-jetty-servlets \
mvn-org.eclipse.jetty-jetty-servlets-pom- \
osgi-org.eclipse.jetty.servlets"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-continuation \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
