SUMMARY = "A Java logging library"
DESCRIPTION = "Logback is intended as a successor to the popular log4j project. At present \
time, logback is divided into three modules, logback-core, logback-classic \
and logback-access. \
 \
The logback-core module lays the groundwork for the other two modules. The \
logback-classic module can be assimilated to a significantly improved \
version of log4j. Moreover, logback-classic natively implements the SLF4J \
API so that you can readily switch back and forth between logback and other \
logging frameworks such as log4j or java.util.logging (JUL). \
 \
The logback-access module integrates with Servlet containers, such as \
Tomcat and Jetty, to provide HTTP-access log functionality. Note that you \
could easily build your own module on top of logback-core."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-1.2.11-2.1.noarch.rpm"
RPM_HASH = "280d4b3909d871c0b8ffe979bbfcdf55c7647cafa967e47236e7645baf6947afa52cb3108f2cc1a5ddae8692e6919918371b51d01e22b62a580bff7bb7d184e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback \
mvn-ch.qos.logback-logback-classic \
mvn-ch.qos.logback-logback-classic-pom- \
mvn-ch.qos.logback-logback-core \
mvn-ch.qos.logback-logback-core-pom- \
mvn-ch.qos.logback-logback-parent-pom- \
osgi-ch.qos.logback.classic \
osgi-ch.qos.logback.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
