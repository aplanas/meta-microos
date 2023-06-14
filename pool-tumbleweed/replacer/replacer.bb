SUMMARY = "Replacer Maven Mojo"
DESCRIPTION = "Maven plugin to replace tokens in a given file with a value. \
 \
This plugin is also used to automatically generating PackageVersion.java \
in the FasterXML.com project."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "replacer-1.6-3.10.noarch.rpm"
RPM_HASH = "aad65ca8352bd1638444b73adf811accd193131344d3341179cacaf9e18a35bc61863a8c81a8e8e83a332e03a69532ac7e94fce7b559073e3fbe0cc7e215d40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.code.maven-replacer-plugin-maven-replacer-plugin \
mvn-com.google.code.maven-replacer-plugin-maven-replacer-plugin-pom- \
mvn-com.google.code.maven-replacer-plugin-replacer \
mvn-com.google.code.maven-replacer-plugin-replacer-pom- \
replacer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-lang-commons-lang \
mvn-org.apache.ant-ant \
mvn-org.apache.maven-maven-plugin-api \
mvn-xerces-xercesImpl"

inherit rpm
