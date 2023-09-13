SUMMARY = "Maven Archiver"
DESCRIPTION = "The Maven Archiver is used by other Maven plugins \
to handle packaging"
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "maven-archiver-3.6.1-1.1.noarch.rpm"
RPM_HASH = "106d26c87d6dba2324bdc04c8d49c0c3f953c82b0bdb352e35246573e7bf4b63695c8d44754c0ea0b39eaa360b07d22c721a9eb8d05df6bcd3145246477aabda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-archiver-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation"

inherit rpm
