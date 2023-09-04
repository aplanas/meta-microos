SUMMARY = "Jackson module to make integration with Guice a bit easier"
DESCRIPTION = "This extension allows Jackson to delegate ObjectMapper creation and value \
injection to Guice when handling data bindings."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-guice-2.15.2-1.1.noarch.rpm"
RPM_HASH = "8f9e67ccca44a357b602f4b06a9e1fab5069275b3ec1b73674382667c15a34fbc4f477907a77fe18603b5202a515988e51a42682cd201cca459ef136491a5032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-guice"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.inject-guice"

inherit rpm
