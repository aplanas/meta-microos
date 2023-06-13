SUMMARY = "Apache UIMA Maven Pear Plugin"
DESCRIPTION = "This is a maven plugin that produces a pear artifact."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "uima-pear-maven-plugin-2.8.1-3.10.noarch.rpm"
RPM_HASH = "feea03699756e40354d70fc4d598296e1542cf735e417cc31dd1dd77fcc4096116680b7cde1d8bf9eb6e4165fafc7dc3fa75eb9aab7fb0bbf7816ed31a320c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.uima:PearPackagingMavenPlugin) \
mvn(org.apache.uima:PearPackagingMavenPlugin:pom:) \
uima-pear-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-project) \
mvn(org.apache.uima:uimaj-core)"

inherit rpm
