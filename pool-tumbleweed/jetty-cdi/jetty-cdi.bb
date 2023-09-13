SUMMARY = "The cdi module for Jetty"
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
This package contains The cdi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-cdi-9.4.51-2.1.noarch.rpm"
RPM_HASH = "47f76d503376840942b8684d13cdfe66fb70af0b402417c1006e066d55a46318271c9b7f963e8cbe89c1ada02f44e6cac48ac10c9a51cb7cabc044143fe27dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-cdi \
mvn-org.eclipse.jetty-jetty-cdi \
mvn-org.eclipse.jetty-jetty-cdi-pom- \
osgi-org.eclipse.jetty.cdi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty-jetty-webapp"

inherit rpm
