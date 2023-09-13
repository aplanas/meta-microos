SUMMARY = "Logback Examples Module"
DESCRIPTION = "logback-examples module."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-examples-1.2.11-2.1.noarch.rpm"
RPM_HASH = "a4e7ac555f175d8cc3bfbea99a19ea5d166301dba9862c2544475c3648d612569fe276f7783d58d968aad1f04392806f7ad6b5e87974cf99a84e91421a039ca3"
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
