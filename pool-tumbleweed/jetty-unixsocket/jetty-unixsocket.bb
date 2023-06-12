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

RPM_NAME = "jetty-unixsocket-9.4.51-1.1.noarch.rpm"
RPM_HASH = "1906ca76be590e62cb955abe9d3e6a1ef5db888fb96ed729c3a210f49b8e0c3790eeff1682548d91f35df4ac7d92009826655a627dc86f34b0e6ee0c9b79951c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket \
mvn(org.eclipse.jetty:jetty-unixsocket) \
mvn(org.eclipse.jetty:jetty-unixsocket:pom:) \
osgi(org.eclipse.jetty.unixsocket)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.github.jnr:jnr-unixsocket) \
mvn(org.eclipse.jetty:jetty-server)"

inherit rpm
