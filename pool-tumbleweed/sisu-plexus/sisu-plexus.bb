SUMMARY = "Sisu Plexus"
DESCRIPTION = "This package contains Sisu Plexus."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-plexus-0.3.5-3.6.noarch.rpm"
RPM_HASH = "2508c0f5b9fe0059188dec72623b4de7d0b9c957d81d4c9be028d1307b0a87f8b38167d4e03c435ef1e55f15c2f7889a859e1a17877c06cb6dc72ee77b6e2e83"
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
