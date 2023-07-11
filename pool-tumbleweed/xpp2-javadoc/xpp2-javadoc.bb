SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-javadoc-2.1.10-30.7.noarch.rpm"
RPM_HASH = "45021d27881fc1a73072b269bd37e01114ab6b3ec9303760cfccf8b82ccad00ee970787d23519db38177c95722b13518a7f3cca6d0d7b711d075b74f4669cc56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
