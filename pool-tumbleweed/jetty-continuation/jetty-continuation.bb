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

RPM_NAME = "jetty-continuation-9.4.51-1.2.noarch.rpm"
RPM_HASH = "f4072657dbb00a99906869d343d40044bc9fce39491ba0165200b7d962c1be0b90f428d16009caaee5336d016e7769ae9fe6d4a980df6a47bc89f54ee1da6efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-continuation \
mvn-org.eclipse.jetty-jetty-continuation \
mvn-org.eclipse.jetty-jetty-continuation-pom- \
osgi-org.eclipse.jetty.continuation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
