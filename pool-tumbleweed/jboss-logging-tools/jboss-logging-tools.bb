SUMMARY = "JBoss Logging I18n Annotation Processor"
DESCRIPTION = "This package contains JBoss Logging I18n Annotation Processor"
LICENSE = "Apache-2.0 & LGPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "jboss-logging-tools-2.2.1-2.17.noarch.rpm"
RPM_HASH = "3d7797e38fc34762587d0e362a2a585b1ae8cdb19b03aa83782380f4c4c4393afc38908e40198db8bcada18dac78b2ecb339d38278ab4d28d26552b17f2efc9d"
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
