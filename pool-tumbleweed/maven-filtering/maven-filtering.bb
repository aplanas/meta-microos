SUMMARY = "Shared component providing resource filtering"
DESCRIPTION = "These Plexus components have been built from the filtering process/code in \
Maven Resources Plugin. The goal is to provide a shared component for all \
plugins that needs to filter resources."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-filtering-3.2.0-2.8.noarch.rpm"
RPM_HASH = "251dd9f04c52a3978a43b442e75fddd7ef6e73f578af96f3c71e700a71b83f2a764d9e6590a497a1c57edaddc1e6a6ffe93c66054478560d1d7b46fd98a9515b"
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
