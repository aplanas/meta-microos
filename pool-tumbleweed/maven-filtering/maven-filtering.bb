SUMMARY = "Shared component providing resource filtering"
DESCRIPTION = "These Plexus components have been built from the filtering process/code in \
Maven Resources Plugin. The goal is to provide a shared component for all \
plugins that needs to filter resources."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-filtering-3.2.0-2.7.noarch.rpm"
RPM_HASH = "73e2c7c11c8190f85dd7dd9d9b3149dd313d41df0bd4becca3b16e3891203a13ac4e391d776697e3ea49c575c76376451786c15a040e77b235da1af0488b4b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.maven.shared-maven-filtering-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
