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

RPM_NAME = "jetty-jmx-9.4.51-1.2.noarch.rpm"
RPM_HASH = "d8076710f1b2b899653f94bf6d9b11c03fbefb36007cee2a87ee055877b14a8ef6a88fc013e921bbf4dc6be8c5c667951cf91e773974de7873cd435742ee9c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jmx \
mvn-org.eclipse.jetty-jetty-jmx \
mvn-org.eclipse.jetty-jetty-jmx-pom- \
osgi-org.eclipse.jetty.jmx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
