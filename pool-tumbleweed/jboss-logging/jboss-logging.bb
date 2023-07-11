SUMMARY = "The JBoss Logging Framework"
DESCRIPTION = "This package contains the JBoss Logging Framework."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-3.4.1-3.11.noarch.rpm"
RPM_HASH = "8f446759770e14f98118a6235dd5ec7003c87181c96b93bf0ae47d66353e139e997e35b12dbb1f553cf685b8ea63a7f21895619b01a8ad8f005b43ed3ea78dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-pom- \
osgi-org.jboss.logging.jboss-logging"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
