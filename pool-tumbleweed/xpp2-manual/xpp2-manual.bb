SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-manual-2.1.10-30.7.noarch.rpm"
RPM_HASH = "e820d5b4877daba84a1a69be8fa6ef509dc706083267e7f9a14551e647732e16520c788bbee166d762b492da9736474bccfeccd5d71a9921538fb7421339af6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp2-manual"

RDEPENDS:${PN} += ""

inherit rpm
