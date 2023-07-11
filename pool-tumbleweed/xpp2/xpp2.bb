SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-2.1.10-30.7.noarch.rpm"
RPM_HASH = "8fbfa500beefa9ec9da0b033c89da35595b1676a10f3adba56ee617f96164451ddc10927597c14d2fe604796e1a2b5e2b54362c2151802c7c1a820e658a7531d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-pull-parser-pull-parser \
mvn-pull-parser-pull-parser-pom- \
xpp2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xml-commons-apis"

inherit rpm
