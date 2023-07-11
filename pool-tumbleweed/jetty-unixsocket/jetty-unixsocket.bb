SUMMARY = "The unixsocket modules for Jetty"
DESCRIPTION = "Jetty is a 100% Java HTTP Server and Servlet Container. This means that you\\ \
do not need to configure and run a separate web server (like Apache) in order\\ \
to use Java, servlets and JSPs to generate dynamic content. Jetty is a fully\\ \
featured web server for static and dynamic content. Unlike separate\\ \
server/container solutions, this means that your web server and web\\ \
application run in the same process, without interconnection overheads\\ \
and complications. Furthermore, as a pure java component, Jetty can be simply\\ \
included in your application for demonstration, distribution or deployment.\\ \
Jetty is available on all Java supported platforms. \
 \
This package contains the unixsocket module for Jetty"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-unixsocket-9.4.51-1.2.noarch.rpm"
RPM_HASH = "85c7151bd39136eafb4be21e9f66d28e975b4f2ff0e8b92cbeddaaf4babf4b92d8f5b4d793e2f7a46ffd7010d582ece61b256f103c17fe1f97c8d4bdba58c3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket \
mvn-org.eclipse.jetty-jetty-unixsocket \
mvn-org.eclipse.jetty-jetty-unixsocket-pom- \
osgi-org.eclipse.jetty.unixsocket"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-unixsocket \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
