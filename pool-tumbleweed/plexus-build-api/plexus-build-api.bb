SUMMARY = "Plexus Build API"
DESCRIPTION = "Plexus Build API"
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "plexus-build-api-0.0.7-4.5.noarch.rpm"
RPM_HASH = "56828f47ce6aee9930831e64ef749d08de97b677bc1da99cc7141bf8182331b52197f068d4f2df989c8998e0e4292bee8a58d67364fc5275354ece10a8c02e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.plexus-plexus-build-api \
mvn-org.sonatype.plexus-plexus-build-api-pom- \
plexus-build-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
