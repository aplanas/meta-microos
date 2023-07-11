SUMMARY = "Java run-time support for ANTLR-generated parsers"
DESCRIPTION = "Java run-time support for ANTLR-generated parsers"
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-java-3.5.3-2.4.noarch.rpm"
RPM_HASH = "f133d4781a7c7912b5729a3434b94f77faa225ceb123f42f762788918798125dfc9cf7182932196d75b37d821143b7bd95f5b9dd4ff8101e6593668a3fdc45a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-java \
mvn-org.antlr-antlr-runtime \
mvn-org.antlr-antlr-runtime-pom- \
osgi-org.antlr.runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
