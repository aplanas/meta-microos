SUMMARY = "The proxy module for Jetty"
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
This package contains The proxy module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-proxy-9.4.51-2.1.noarch.rpm"
RPM_HASH = "e1e7f37bae29f7f2c3ff19c3250d5b2cbac343369ea9003cbd1a7babcd35ed54502d76987845f4eaee3319914558b20021a9e8b682ad81f25548197c36039336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-proxy \
mvn-org.eclipse.jetty-jetty-proxy \
mvn-org.eclipse.jetty-jetty-proxy-pom- \
osgi-org.eclipse.jetty.proxy"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
