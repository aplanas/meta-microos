SUMMARY = "The jaas module for Jetty"
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
This package contains The jaas module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-jaas-9.4.51-2.1.noarch.rpm"
RPM_HASH = "d0f45315dbc80e7a39ee1febd185711dcc86184b53a386048f490321f7ab4ada0de72843a9d45de7fbbd5e03a72b2973884f5f4a2694694626011ffee21f31b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jaas \
mvn-org.eclipse.jetty-jetty-jaas \
mvn-org.eclipse.jetty-jetty-jaas-pom- \
osgi-org.eclipse.jetty.jaas"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-security"

inherit rpm
