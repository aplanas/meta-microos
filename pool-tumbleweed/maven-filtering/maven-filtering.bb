SUMMARY = "Shared component providing resource filtering"
DESCRIPTION = "These Plexus components have been built from the filtering process/code in \
Maven Resources Plugin. The goal is to provide a shared component for all \
plugins that needs to filter resources."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "maven-filtering-3.3.1-1.1.noarch.rpm"
RPM_HASH = "a48c346bba3aea6d971e02774c176f97176ea4327090716395b484eb72a003992c09747154a32dba4045a6489a904425a6e54be0be82b5c35d09404766f9ec13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.maven.shared-maven-filtering-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
