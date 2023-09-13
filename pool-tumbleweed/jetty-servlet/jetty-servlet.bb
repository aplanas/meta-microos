SUMMARY = "The servlet module for Jetty"
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
This package contains The servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-servlet-9.4.51-2.1.noarch.rpm"
RPM_HASH = "e153f699c515a8d0a657eded5d120d6796f095a0d1e4250abdc51cd865a641c3f912c9c73f998fb4d877627fe3f6eb474e7f3114aae32e37b530f5c193aca1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-servlet \
mvn-org.eclipse.jetty-jetty-servlet \
mvn-org.eclipse.jetty-jetty-servlet-pom- \
osgi-org.eclipse.jetty.servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-util-ajax"

inherit rpm
