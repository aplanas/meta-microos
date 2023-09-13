SUMMARY = "The security module for Jetty"
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
This package contains The security module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-security-9.4.51-2.1.noarch.rpm"
RPM_HASH = "d3dc301e47e3e4676e62b0547b214e9a5151c39cd44968c1b0bd30e5797d0cc101e5f602569c44df80cd5969eb7fa2b9d3804a19743b13c52a7a703156f7b214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-security \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-security-pom- \
osgi-org.eclipse.jetty.security"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
