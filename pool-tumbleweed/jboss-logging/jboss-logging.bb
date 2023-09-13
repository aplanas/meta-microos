SUMMARY = "The JBoss Logging Framework"
DESCRIPTION = "This package contains the JBoss Logging Framework."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-3.4.1-4.1.noarch.rpm"
RPM_HASH = "c44c0a46ed82d8e9168001566e5f222d978ced1e128656a5b3cc61a87a5f5fbb711dae97546ce03881661b0ba87e8689ed6d663c9ed0425ca1cde427a7037cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-pom- \
osgi-org.jboss.logging.jboss-logging"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
