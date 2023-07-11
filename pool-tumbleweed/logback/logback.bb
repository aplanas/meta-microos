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

RPM_NAME = "logback-1.2.11-1.10.noarch.rpm"
RPM_HASH = "8f2aaba198380ac7437d1be46f9acbb45865b839eecaa3fe7724eba9dadd3d259698f464e5cac0269258a9bd5e2c96fd41de707e85bf7d59f9d5ae3b2a49a777"
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
