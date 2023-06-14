SUMMARY = "Logback Examples Module"
DESCRIPTION = "logback-examples module."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-examples-1.2.11-1.9.noarch.rpm"
RPM_HASH = "ee21007ecf09c148a85e11ac8be3fa4d12055e21fa400ce83c55fb0ef9272cb897270a1032bd48a24877f9e4ede40a19d10deb47dedcb6bae4398eec621065a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-examples \
mvn-ch.qos.logback-logback-examples \
mvn-ch.qos.logback-logback-examples-pom-"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-access \
mvn-ch.qos.logback-logback-classic \
mvn-ch.qos.logback-logback-core \
mvn-log4j-log4j \
mvn-org.slf4j-slf4j-ext"

inherit rpm
