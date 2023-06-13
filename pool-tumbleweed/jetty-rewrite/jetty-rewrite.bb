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

RPM_NAME = "jetty-rewrite-9.4.51-1.1.noarch.rpm"
RPM_HASH = "880a65dc9e8b0d0d6cad5a715a151b5e472f2aee65c42b1a9cd7681b2fea812a8104db64761810846f0a09370a64ae1dc9865409734d39e11f3ad3b05fb5602e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-rewrite \
mvn(org.eclipse.jetty:jetty-rewrite) \
mvn(org.eclipse.jetty:jetty-rewrite:pom:) \
osgi(org.eclipse.jetty.rewrite)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.servlet:javax.servlet-api) \
mvn(org.eclipse.jetty:jetty-server)"

inherit rpm
