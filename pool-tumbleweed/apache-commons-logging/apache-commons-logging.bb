SUMMARY = "Apache Commons Logging"
DESCRIPTION = "The commons-logging package provides a simple, component oriented \
interface (org.apache.commons.logging.Log) together with wrappers for \
logging systems. The user can choose at runtime which system they want \
to use. In addition, a small number of basic implementations are \
provided to allow users to use the package standalone. \
commons-logging was heavily influenced by Avalon's Logkit and Log4J. The \
commons-logging abstraction is meant to minimize the differences between \
the two, and to allow a developer to not tie himself to a particular \
logging implementation."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "apache-commons-logging-1.2-11.6.noarch.rpm"
RPM_HASH = "53b37d370383d735822d214fe22cb6b6a091187980c886a0e5151c7cb9f6ba0c7d592352afabf30dcdcb8b8f0f5d6224906e8073b18d041c0a44470dec886eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-logging \
commons-logging \
jakarta-commons-logging \
mvn-apache-commons-logging \
mvn-apache-commons-logging-adapters \
mvn-apache-commons-logging-adapters-pom- \
mvn-apache-commons-logging-api \
mvn-apache-commons-logging-api-pom- \
mvn-apache-commons-logging-pom- \
mvn-commons-logging-commons-logging \
mvn-commons-logging-commons-logging-adapters \
mvn-commons-logging-commons-logging-adapters-pom- \
mvn-commons-logging-commons-logging-api \
mvn-commons-logging-commons-logging-api-pom- \
mvn-commons-logging-commons-logging-pom- \
mvn-org.apache.commons-commons-logging \
mvn-org.apache.commons-commons-logging-adapters \
mvn-org.apache.commons-commons-logging-adapters-pom- \
mvn-org.apache.commons-commons-logging-api \
mvn-org.apache.commons-commons-logging-api-pom- \
mvn-org.apache.commons-commons-logging-pom- \
osgi-org.apache.commons.logging \
osgi-org.apache.commons.logging.adapters \
osgi-org.apache.commons.logging.api"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
