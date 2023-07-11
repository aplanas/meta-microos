SUMMARY = "Simple Logging Facade for Java"
DESCRIPTION = "The Simple Logging Facade for Java or (SLF4J) is intended to serve \
as a simple facade for various logging APIs allowing to the end-user \
to plug in the desired implementation at deployment time. SLF4J also \
allows for a gradual migration path away from \
Jakarta Commons Logging (JCL). \
 \
Logging API implementations can either choose to implement the \
SLF4J interfaces directly, e.g. NLOG4J or SimpleLogger. Alternatively, \
it is possible (and rather easy) to write SLF4J adapters for the given \
API implementation, e.g. Log4jLoggerAdapter or JDK14LoggerAdapter.."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-1.7.36-4.2.noarch.rpm"
RPM_HASH = "0f136a887b865ba2074c87e0d8b4d8543632af317bc417c018664402ee571d0c24c57a5eaae9bf4af94a2d7df828aa433c8b801a3a3d7513eac1e7a5db326aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-api-pom- \
mvn-org.slf4j-slf4j-nop \
mvn-org.slf4j-slf4j-nop-pom- \
mvn-org.slf4j-slf4j-simple \
mvn-org.slf4j-slf4j-simple-pom- \
osgi-slf4j.api \
osgi-slf4j.nop \
osgi-slf4j.simple \
slf4j"

RDEPENDS:${PN} += "cal10n \
java \
java-headless \
javapackages-filesystem"

inherit rpm
