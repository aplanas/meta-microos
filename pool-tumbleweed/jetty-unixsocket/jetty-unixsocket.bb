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

RPM_NAME = "jetty-unixsocket-9.4.51-2.1.noarch.rpm"
RPM_HASH = "98c7b8086585deb7abf3286f10e15b754a1defc355244630a41525a807e1e43821fa38f28ef185345cd573d2c9b333ab256383fe91337a83e41aff74deaef257"
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
