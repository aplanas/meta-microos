SUMMARY = "Replacer Maven Mojo"
DESCRIPTION = "Maven plugin to replace tokens in a given file with a value. \
 \
This plugin is also used to automatically generating PackageVersion.java \
in the FasterXML.com project."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "replacer-1.6-3.11.noarch.rpm"
RPM_HASH = "d0c2981be751463b37b4d6943ef38640fe40cea9e21848a86bcdfd725bca2c6c252954035c40a35af0eb98246815ba6939b6072fb3d7d9e3bdda9c8c894d69e0"
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
