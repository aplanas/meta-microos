SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-demo-2.1.10-30.7.noarch.rpm"
RPM_HASH = "8c9745d1516e2282316068e685bf688e439602da1b3391f58502f5f3bc9524fbc70af4e9b74e071d752462e580b8a5a5b063035cfb08a444dea19f500ed168f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp2-demo"

RDEPENDS:${PN} += "xpp2"

inherit rpm
