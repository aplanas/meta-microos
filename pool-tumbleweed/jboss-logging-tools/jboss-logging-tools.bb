SUMMARY = "JBoss Logging I18n Annotation Processor"
DESCRIPTION = "This package contains JBoss Logging I18n Annotation Processor"
LICENSE = "Apache-2.0 & LGPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "jboss-logging-tools-2.2.1-2.18.noarch.rpm"
RPM_HASH = "21079f4fe9bc0f6537dc312e7e2890b623d9d83dba18b2d669ab8a7a2ded3264659047a84f35f86f3fcd8a28dca61dccc3c9f148dda616fdd1037e8577ba0492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-tools \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-annotations-pom- \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.logging-jboss-logging-processor-pom- \
mvn-org.jboss.logging-jboss-logging-tools-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.jdeparser-jdeparser"

inherit rpm
