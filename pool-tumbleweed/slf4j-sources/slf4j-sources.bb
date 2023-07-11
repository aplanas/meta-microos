SUMMARY = "SLF4J Source JARs"
DESCRIPTION = "SLF4J Source JARs."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-sources-1.7.36-4.2.noarch.rpm"
RPM_HASH = "f2806f5bd305cbdfe3b6b9c288663d182c914b94192a0b5ea1e508f2956bdffc745ac229309624bc1c90fbd1fbbc8bda96bcd50162f142f640a53e35c6ef42f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-jcl-over-slf4j--sources- \
mvn-org.slf4j-jul-to-slf4j--sources- \
mvn-org.slf4j-log4j-over-slf4j--sources- \
mvn-org.slf4j-slf4j-api--sources- \
mvn-org.slf4j-slf4j-ext--sources- \
mvn-org.slf4j-slf4j-jcl--sources- \
mvn-org.slf4j-slf4j-jdk14--sources- \
mvn-org.slf4j-slf4j-log4j12--sources- \
mvn-org.slf4j-slf4j-nop--sources- \
mvn-org.slf4j-slf4j-reload4j--sources- \
mvn-org.slf4j-slf4j-simple--sources- \
slf4j-sources"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
