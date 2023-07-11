SUMMARY = "Apache UIMA Maven JCasGen Plugin"
DESCRIPTION = "A Maven Plugin for using JCasGen to generate Java classes from \
XML type system descriptions."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "jcasgen-maven-plugin-2.8.1-3.11.noarch.rpm"
RPM_HASH = "001d730ba90fd023a23df195d097b3ad01464322aafb90f827d70af39e542ad0bfe3bc2f289f5133d15f8b58d0d7e85beffeb78811cc9c0c753b18f85bc0dd05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcasgen-maven-plugin \
mvn-org.apache.uima-jcasgen-maven-plugin \
mvn-org.apache.uima-jcasgen-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.uima-uimaj-tools \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
