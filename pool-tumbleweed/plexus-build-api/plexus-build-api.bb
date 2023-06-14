SUMMARY = "Plexus Build API"
DESCRIPTION = "Plexus Build API"
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "plexus-build-api-0.0.7-4.4.noarch.rpm"
RPM_HASH = "6a396cfcc989799d851be9ddda82c863a976c0264bf6f7d85d45f4abc4c7d5a9c5d42f3ae0f20eccd7ea4fef348134e196e9c1fd03ba30e7305f8804aa2856af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.plexus-plexus-build-api \
mvn-org.sonatype.plexus-plexus-build-api-pom- \
plexus-build-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
