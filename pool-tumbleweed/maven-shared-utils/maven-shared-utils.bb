SUMMARY = "Maven shared utility classes"
DESCRIPTION = "This project aims to be a functional replacement for plexus-utils in Maven. \
 \
It is not a 100% API compatible replacement though but a replacement with \
improvements: lots of methods got cleaned up, generics got added and we dropped \
a lot of unused code."
LICENSE = "Apache-2.0"

PV = "3.3.4"

RPM_NAME = "maven-shared-utils-3.3.4-1.2.noarch.rpm"
RPM_HASH = "53cfa92c3fbdf2c45a84a970cd71a48edf3bb8b2d4794d87b058abaabd384e3a3c5d71a5dabbcc855010102ed5149ab548f121cefb0f73c436fe5159125dccae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-utils \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.shared-maven-shared-utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io"

inherit rpm
