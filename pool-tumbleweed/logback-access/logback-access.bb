SUMMARY = "Logback-access module for Servlet integration"
DESCRIPTION = "The logback-access module integrates with Servlet containers, such as Tomcat \
and Jetty, to provide HTTP-access log functionality. Note that you could \
easily build your own module on top of logback-core."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-access-1.2.11-2.1.noarch.rpm"
RPM_HASH = "be07b1dc6e17e95d3fa6bf44e02510c3245ec29b81c01075fa62de5b36593b95b09acce46a265b2926737f651c51fb80d47479455063cc9f5ba04cec3a594897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-access \
mvn-ch.qos.logback-logback-access \
mvn-ch.qos.logback-logback-access-pom- \
osgi-ch.qos.logback.access"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-core"

inherit rpm
