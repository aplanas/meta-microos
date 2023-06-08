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

RPM_NAME = "fasterxml-oss-parent-38-1.19.noarch.rpm"
RPM_HASH = "6beb8d5aac01ff08a7007bddc1446159f06142b197efab6e6cdd2c215cd2f7c38c8857a670c7b9806c39540ce595c5de7de9337c36fcc50521f858ef4fad1e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fasterxml-oss-parent mvn(com.fasterxml:oss-parent:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.felix:maven-bundle-plugin) mvn(org.apache.maven.plugins:maven-compiler-plugin) mvn(org.apache.maven.plugins:maven-jar-plugin) mvn(org.apache.maven.plugins:maven-surefire-plugin) mvn(org.codehaus.mojo:build-helper-maven-plugin)"

inherit rpm
