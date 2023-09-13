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

RPM_NAME = "jetty-util-9.4.51-2.1.noarch.rpm"
RPM_HASH = "db7ef6ab1081537b896cfe5746d7ca4c2f5d34ed62181cd1b9b3aa6f5221a22788ac8d83dd32d156d85ec2fa404638a5d2bc42bb51da772a9e206a723e4d7a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-util \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty-jetty-util-pom- \
osgi-org.eclipse.jetty.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
