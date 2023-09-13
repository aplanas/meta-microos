SUMMARY = "The quickstart module for Jetty"
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
This package contains The quickstart module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-quickstart-9.4.51-2.1.noarch.rpm"
RPM_HASH = "7fdafeece750d956157c20de072ded8bc375a4c76e01995bb7780d6a1c4968b83871bdd29ceb4fb7c1786f5443ab77ac7e125b938019d91257f2165c016b8e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-quickstart \
mvn-org.eclipse.jetty-jetty-quickstart \
mvn-org.eclipse.jetty-jetty-quickstart-pom- \
osgi-org.eclipse.jetty.quickstart"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.transaction-javax.transaction-api \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-jmx \
mvn-org.eclipse.jetty-jetty-plus \
mvn-org.eclipse.jetty-jetty-webapp"

inherit rpm
