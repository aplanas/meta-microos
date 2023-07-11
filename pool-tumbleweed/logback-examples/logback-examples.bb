SUMMARY = "Logback Examples Module"
DESCRIPTION = "logback-examples module."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-examples-1.2.11-1.10.noarch.rpm"
RPM_HASH = "b25faa3c4b2a8d58dc23dc53591c50cb383decedc7faf024b90aeb5e16405370d35446bbb738a779fc228aec22ae56747a9aea084c03a74e45ac0f4f8616e812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-examples \
mvn-ch.qos.logback-logback-examples \
mvn-ch.qos.logback-logback-examples-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-access \
mvn-ch.qos.logback-logback-classic \
mvn-ch.qos.logback-logback-core \
mvn-log4j-log4j \
mvn-org.slf4j-slf4j-ext"

inherit rpm
