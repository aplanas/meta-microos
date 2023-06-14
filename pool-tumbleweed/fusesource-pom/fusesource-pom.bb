SUMMARY = "Parent POM for FuseSource Maven projects"
DESCRIPTION = "This is a shared POM parent for FuseSource Maven projects"
LICENSE = "Apache-2.0"

PV = "1.11"

RPM_NAME = "fusesource-pom-1.11-1.11.noarch.rpm"
RPM_HASH = "858c55f6414ba3626d4ca81f676d8ff6a3314c3b29849dc1e38ef6e5115bf62ea3a92d17f17142dab66050efc0ae1bfb543af83309d1239fc1e7236ad5eae0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fusesource-pom \
mvn-org.fusesource-fusesource-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
