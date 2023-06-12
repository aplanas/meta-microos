SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-2.1.10-30.6.noarch.rpm"
RPM_HASH = "bed6bc1c83ba79120673b78feb58b79c4f53917b016f1f0542d79383c88af857c5d079aa01944dfb32161d48026382048f82751b2f7750223a9c7184ff531061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(pull-parser:pull-parser) \
mvn(pull-parser:pull-parser:pom:) \
xpp2"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xml-commons-apis"

inherit rpm
