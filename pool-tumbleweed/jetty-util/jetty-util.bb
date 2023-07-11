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

RPM_NAME = "jetty-util-9.4.51-1.2.noarch.rpm"
RPM_HASH = "72509c8125a24beee61bfe840d9f3b976c662e6392d62530ca2d1ec0732ff2e6c854070cf18c2d20d847f12730f0094a66b730384b483b84eccfcd7c1da5a1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-util \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty-jetty-util-pom- \
osgi-org.eclipse.jetty.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
