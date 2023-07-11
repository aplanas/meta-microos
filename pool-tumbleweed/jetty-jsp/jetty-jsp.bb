SUMMARY = "The jsp module for Jetty"
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
This package contains The jsp module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-jsp-9.4.51-1.2.noarch.rpm"
RPM_HASH = "35536269d95712b160063a4c3773058587544a1b5632f39765057f1eff11dbb2bf54adf97b3fcab72c7d9798242efacbcce435a8a003e9f630a7193ed565f417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jsp \
mvn-org.eclipse.jetty-apache-jsp \
mvn-org.eclipse.jetty-apache-jsp--nolog- \
mvn-org.eclipse.jetty-apache-jsp-pom- \
mvn-org.eclipse.jetty-jetty-jsp \
mvn-org.eclipse.jetty-jetty-jsp--nolog- \
mvn-org.eclipse.jetty-jetty-jsp-pom- \
osgi-org.eclipse.jetty.apache-jsp"

RDEPENDS:${PN} += "glassfish-el \
java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.apache.tomcat-tomcat-jasper \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty.toolchain-jetty-schemas"

inherit rpm
