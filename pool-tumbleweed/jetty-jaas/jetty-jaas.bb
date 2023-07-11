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

RPM_NAME = "jetty-jaas-9.4.51-1.2.noarch.rpm"
RPM_HASH = "0c7f60c17eea5809897d0a28086e3a14ab3b0327598f24d27edef5d641b234bde1bbc3ea2b9750051b39bcda6ef86ed8738568b04187f8300561d8085c7701f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jaas \
mvn-org.eclipse.jetty-jetty-jaas \
mvn-org.eclipse.jetty-jetty-jaas-pom- \
osgi-org.eclipse.jetty.jaas"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-security"

inherit rpm
