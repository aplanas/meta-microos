SUMMARY = "Maven Assembly Plugin"
DESCRIPTION = "A Maven plugin to create archives of your project's sources, classes, \
dependencies etc. from flexible assembly descriptors."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-assembly-plugin-3.6.0-1.1.noarch.rpm"
RPM_HASH = "7bff7a65633bb5f190aa9aecff81da3994d867e1906625bcfc0e6c121d48a652c5e932b8e41a3314e82fd43ff5e6b226f3064f4581658837716c420dbfa76dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
