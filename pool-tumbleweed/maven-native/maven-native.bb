SUMMARY = "Maven plugin to compile C and C++ source"
DESCRIPTION = "Maven Native - compile C and C++ source under Maven \
with compilers such as GCC, MSVC, GCJ etc ..."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "maven-native-1.0~alpha11-4.8.noarch.rpm"
RPM_HASH = "1459e0c72510beeaa5a736a98ed2e099e3e57e370104ac5c2ab2e84cff96932f9d87ae0b33cdb141b3a2b6db10c677c266ef0ba62159c17298490022c9bf54d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native \
mvn(org.codehaus.mojo.natives:maven-native-api) \
mvn(org.codehaus.mojo.natives:maven-native-api:pom:) \
mvn(org.codehaus.mojo.natives:maven-native:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
