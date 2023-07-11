SUMMARY = "The openid module for Jetty"
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
This package contains The openid module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-openid-9.4.51-1.2.noarch.rpm"
RPM_HASH = "432c8e5efedc5f75af574987ac890881bc7e30c293eac32f5ab3e704ba7da78f816d415b62a65abb4164fe3a16a64507a21ea38d7465787d26e019dfd8f214b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-openid \
mvn-org.eclipse.jetty-jetty-openid \
mvn-org.eclipse.jetty-jetty-openid-pom- \
osgi-org.eclipse.jetty.openid"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util-ajax"

inherit rpm
