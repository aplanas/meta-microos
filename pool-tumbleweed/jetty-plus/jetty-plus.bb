SUMMARY = "The plus module for Jetty"
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
This package contains The plus module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-plus-9.4.51-2.1.noarch.rpm"
RPM_HASH = "a8557e4c150e798b499028ec5f29fe50fbac820300e3779583a6522667f7ed827c7404d3905f89c0a279c9242dbfab7f8b7b5f25d561e07907d48653d134f1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-plus \
mvn-org.eclipse.jetty-jetty-plus \
mvn-org.eclipse.jetty-jetty-plus-pom- \
osgi-org.eclipse.jetty.plus"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-jndi \
mvn-org.eclipse.jetty-jetty-webapp"

inherit rpm
