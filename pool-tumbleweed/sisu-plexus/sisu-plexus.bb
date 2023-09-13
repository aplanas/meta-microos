SUMMARY = "Sisu Plexus"
DESCRIPTION = "This package contains Sisu Plexus."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-plexus-0.3.5-4.1.noarch.rpm"
RPM_HASH = "89a91c62419b2203592cee463697e39028654ea3c96795d56c670b69d6f43784f091020d2d27aed3eb037cfc595a236b7ef147a12d28a8bdc37b5ecc64a8c454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus-pom- \
mvn-org.sonatype.sisu-sisu-inject-plexus \
mvn-org.sonatype.sisu-sisu-inject-plexus-pom- \
sisu-plexus"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject"

inherit rpm
