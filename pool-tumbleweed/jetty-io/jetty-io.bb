SUMMARY = "The io module for Jetty"
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
This package contains The io module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-io-9.4.51-1.1.noarch.rpm"
RPM_HASH = "8baea9544cf4123b9d876fb18d3c54d595635a92c7fccbebe7eaca0ed5a1ed90d68c2aefc75ce84ff55dde2781e0e097a6c305fdd584ba43654ad1b4c5b976cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-io \
mvn(org.eclipse.jetty:jetty-io) \
mvn(org.eclipse.jetty:jetty-io:pom:) \
osgi(org.eclipse.jetty.io)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
