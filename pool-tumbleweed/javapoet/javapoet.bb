SUMMARY = "A Java API for generating .java source files"
DESCRIPTION = "A utility class which aids in generating Java source files."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "javapoet-1.13.0-1.1.noarch.rpm"
RPM_HASH = "6370ecf843e1d53733c222ab152b6e716fe6e339f4185acbdae3450a08ada30d29b2d5fa34673bd62a4e67d136c0c04801aac7c959d73a0ad979a1760413dd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapoet \
mvn-com.squareup-javapoet \
mvn-com.squareup-javapoet-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
