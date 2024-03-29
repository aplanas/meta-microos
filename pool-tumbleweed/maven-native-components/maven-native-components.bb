SUMMARY = "Maven Native Components"
DESCRIPTION = "Maven Native Components."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "maven-native-components-1.0~alpha11-4.9.noarch.rpm"
RPM_HASH = "73cce2e354dff2fb69759c1ab2859b05bcc670bfce97798efdde50c64aca2a4255819dbf91c06f505f7b300cc8c39c947701bbf89999910c32142fb1b1e9a363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native-components \
mvn-org.codehaus.mojo.natives-maven-native-bcc \
mvn-org.codehaus.mojo.natives-maven-native-bcc-pom- \
mvn-org.codehaus.mojo.natives-maven-native-components-pom- \
mvn-org.codehaus.mojo.natives-maven-native-generic-c \
mvn-org.codehaus.mojo.natives-maven-native-generic-c-pom- \
mvn-org.codehaus.mojo.natives-maven-native-javah \
mvn-org.codehaus.mojo.natives-maven-native-javah-pom- \
mvn-org.codehaus.mojo.natives-maven-native-manager \
mvn-org.codehaus.mojo.natives-maven-native-manager-pom- \
mvn-org.codehaus.mojo.natives-maven-native-mingw \
mvn-org.codehaus.mojo.natives-maven-native-mingw-pom- \
mvn-org.codehaus.mojo.natives-maven-native-msvc \
mvn-org.codehaus.mojo.natives-maven-native-msvc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.mojo.natives-maven-native-api \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
