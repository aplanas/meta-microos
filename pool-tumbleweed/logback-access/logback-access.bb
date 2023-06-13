SUMMARY = "Logback-access module for Servlet integration"
DESCRIPTION = "The logback-access module integrates with Servlet containers, such as Tomcat \
and Jetty, to provide HTTP-access log functionality. Note that you could \
easily build your own module on top of logback-core."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-access-1.2.11-1.9.noarch.rpm"
RPM_HASH = "0ed93684285fdfc1d3b7793abb0877188ad6e4abbb3bd621d247b305843aa51e8a16a243e41a3c9e550a9f933a2a2cb4c833c6909d646859720245019782bd94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-access \
mvn(ch.qos.logback:logback-access) \
mvn(ch.qos.logback:logback-access:pom:) \
osgi(ch.qos.logback.access)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(ch.qos.logback:logback-core)"

inherit rpm
