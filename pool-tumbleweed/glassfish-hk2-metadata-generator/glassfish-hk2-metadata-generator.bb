SUMMARY = "HK2 Metadata Generator"
DESCRIPTION = "HK2 Metadata Generator Subsystem."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-metadata-generator-2.5.0-2.4.noarch.rpm"
RPM_HASH = "0381ed8bdf8b27aadd218de43cc6b8499efcdfb0848a99c554ed7c182ec6f87722f705eb2c79605df7ffb8b95d154f9d707586decda097a0b3c3450af28eca06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-metadata-generator-parent-pom- \
mvn-org.glassfish.hk2-hk2-metadata-generator-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
