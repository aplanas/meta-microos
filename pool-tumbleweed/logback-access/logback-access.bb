SUMMARY = "Logback-access module for Servlet integration"
DESCRIPTION = "The logback-access module integrates with Servlet containers, such as Tomcat \
and Jetty, to provide HTTP-access log functionality. Note that you could \
easily build your own module on top of logback-core."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-access-1.2.11-1.10.noarch.rpm"
RPM_HASH = "0ec15c8a0faa75d8d3a58c7bd3f4b159df7bd3103ff8990b11ff4dafcfedc13a48b5b4249a5168cf719533fa946e69da7dbabe5eae24c5474228a19b8b2d132f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-access \
mvn-ch.qos.logback-logback-access \
mvn-ch.qos.logback-logback-access-pom- \
osgi-ch.qos.logback.access"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-core"

inherit rpm
