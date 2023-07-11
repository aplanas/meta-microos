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

RPM_NAME = "jetty-client-9.4.51-1.2.noarch.rpm"
RPM_HASH = "88487772b53ba809b02157c9ca7f50410ca938cccfb0cadd7c9197128b00aaea17ad5e9013bf52c362006738177c941d5624d31349ddfbc83921bfa87ad220eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-client \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-client-pom- \
osgi-org.eclipse.jetty.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io"

inherit rpm
