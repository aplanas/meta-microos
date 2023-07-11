SUMMARY = "Maven plugin to compile C and C++ source"
DESCRIPTION = "Maven Native - compile C and C++ source under Maven \
with compilers such as GCC, MSVC, GCJ etc ..."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "maven-native-1.0~alpha11-4.9.noarch.rpm"
RPM_HASH = "72cdfffcad806c6b4f65b3d86932f3e7eeda556d5805be7d273867d821e48898d2dbfde8d38cbb61f0bc12b9aa33e6e53f2f521f7200deaa5cf88bbda035dab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native \
mvn-org.codehaus.mojo.natives-maven-native-api \
mvn-org.codehaus.mojo.natives-maven-native-api-pom- \
mvn-org.codehaus.mojo.natives-maven-native-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
