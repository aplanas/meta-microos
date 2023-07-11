SUMMARY = "Apache UIMA Maven Pear Plugin"
DESCRIPTION = "This is a maven plugin that produces a pear artifact."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "uima-pear-maven-plugin-2.8.1-3.11.noarch.rpm"
RPM_HASH = "34ead331b2099967e9776b290f95e4266d5bdc5c73174cd7e7e07abe8149cf59e595e268083d0ec8b2d99750dd8842538a4c51b446d138bb5e3c59f10ec47bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.uima-PearPackagingMavenPlugin \
mvn-org.apache.uima-PearPackagingMavenPlugin-pom- \
uima-pear-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project \
mvn-org.apache.uima-uimaj-core"

inherit rpm
