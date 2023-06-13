SUMMARY = "The jmx module for Jetty"
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
This package contains The jmx module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-jmx-9.4.51-1.1.noarch.rpm"
RPM_HASH = "e1add655af50a3e51de2e5c07b747eb7d1e070a2210f96273cc0f1dce4dfffb632eca997d0df080e38a34a6d9491c251fe0931930e6ced4d2f5ca7d0ab4d045b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jmx \
mvn(org.eclipse.jetty:jetty-jmx) \
mvn(org.eclipse.jetty:jetty-jmx:pom:) \
osgi(org.eclipse.jetty.jmx)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
