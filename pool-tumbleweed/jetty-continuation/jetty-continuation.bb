SUMMARY = "The continuation module for Jetty"
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
This package contains The continuation module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-continuation-9.4.51-2.1.noarch.rpm"
RPM_HASH = "951a4c813525738d12145d4220481cc712fef50747519eec44499965c9b5bb5804034cb57e04683c1e8f42fc00d9788e4f7ae0482828b7a4a7136549d4e221eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-continuation \
mvn-org.eclipse.jetty-jetty-continuation \
mvn-org.eclipse.jetty-jetty-continuation-pom- \
osgi-org.eclipse.jetty.continuation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
