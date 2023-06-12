SUMMARY = "The client module for Jetty"
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
This package contains The client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-client-9.4.51-1.1.noarch.rpm"
RPM_HASH = "d454cda386954448ad9f121a8bc1c01625d766faefad227addff0ade022b0b310284b278240473ce24e1461fa00c50aa0d0e325ccaef8de1ca5bb9758c565cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-client \
mvn(org.eclipse.jetty:jetty-client) \
mvn(org.eclipse.jetty:jetty-client:pom:) \
osgi(org.eclipse.jetty.client)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty:jetty-http) \
mvn(org.eclipse.jetty:jetty-io)"

inherit rpm
