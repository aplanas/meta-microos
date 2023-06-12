SUMMARY = "ParaNamer Parent POM"
DESCRIPTION = "This package contains the ParaNamer Parent POM."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-parent-2.8-2.10.noarch.rpm"
RPM_HASH = "7c5b94b8620c1f369097f023673a4cc178034c0dced13a156720d2e03e20ddca8311a976058d9f0c0f22cb80ab630182a7986ea048a560c7912d42a73fbda690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.paranamer:paranamer-parent:pom:) \
paranamer-parent"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache.maven.plugins:maven-surefire-plugin)"

inherit rpm
