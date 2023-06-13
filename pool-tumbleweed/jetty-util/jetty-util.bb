SUMMARY = "The util module for Jetty"
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
This package contains The util module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-util-9.4.51-1.1.noarch.rpm"
RPM_HASH = "26cc5d8a8f21e6bd202f25bb2b26a137e4836c9b0558ad50872b58b002832c69440079f762f2201e830e0d1234f6fcca63cabceaa83682b2378755a215ed23a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-util \
mvn(org.eclipse.jetty:jetty-util) \
mvn(org.eclipse.jetty:jetty-util:pom:) \
osgi(org.eclipse.jetty.util)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
