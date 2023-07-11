SUMMARY = "FasterXML parent pom"
DESCRIPTION = "FasterXML is the business behind the Woodstox streaming XML parser, \
Jackson streaming JSON parser, the Aalto non-blocking XML parser, and \
a growing family of utility libraries and extensions. \
 \
FasterXML offers consulting services for adoption, performance tuning, \
and extension. \
 \
This package contains the parent pom file for FasterXML.com projects."
LICENSE = "Apache-2.0"

PV = "38"

RPM_NAME = "fasterxml-oss-parent-38-1.20.noarch.rpm"
RPM_HASH = "a10e7df9520c6e078638ea8423d1ca5d17cefb31a89ab818371db39125480297747ef6d0660b26c7d128c2a933025ee6dfaea5cb6908f450fc628b1305479de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fasterxml-oss-parent \
mvn-com.fasterxml-oss-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
