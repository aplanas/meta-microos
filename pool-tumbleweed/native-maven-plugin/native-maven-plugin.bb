SUMMARY = "Native Maven Plugin"
DESCRIPTION = "Native Maven Plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "native-maven-plugin-1.0~alpha11-4.9.noarch.rpm"
RPM_HASH = "a38e72e9c812615b18c1869fa3f35aa2e453cd7b288b5b80d24d5d8a46acaf4183ea19a0c004e59b025d937e7b9b7c37f37d19f8b88c4d9020ed7cd431d4e245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.mojo-native-maven-plugin \
mvn-org.codehaus.mojo-native-maven-plugin-pom- \
native-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.bcel-bcel \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.mojo.natives-maven-native-api \
mvn-org.codehaus.mojo.natives-maven-native-bcc \
mvn-org.codehaus.mojo.natives-maven-native-generic-c \
mvn-org.codehaus.mojo.natives-maven-native-javah \
mvn-org.codehaus.mojo.natives-maven-native-manager \
mvn-org.codehaus.mojo.natives-maven-native-mingw \
mvn-org.codehaus.mojo.natives-maven-native-msvc \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
