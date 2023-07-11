SUMMARY = "A Java API for generating .java source files"
DESCRIPTION = "A utility class which aids in generating Java source files."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "javapoet-1.13.0-1.2.noarch.rpm"
RPM_HASH = "8eddfa6905e73a49fde480ba72ea9d9a249782cee81c7db4a3c6192129fad7e090734840829e0ea6fbaa733f454218bf1e36e0d6401b37e50139ee4a67019946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapoet \
mvn-com.squareup-javapoet \
mvn-com.squareup-javapoet-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
