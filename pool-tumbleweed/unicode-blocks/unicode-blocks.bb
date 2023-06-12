SUMMARY = "Unicode Blocks Chart"
DESCRIPTION = "Blocks from the Unicode Character Database."
LICENSE = "Unicode-DFS-2016"

PV = "12.1.0"

RPM_NAME = "unicode-blocks-12.1.0-1.10.noarch.rpm"
RPM_HASH = "035792605279c797fd6f8398e52ba931ac1600096f54674960f4ec24a47a7109b4120b62fd6470e8d1571f2e5a1d5d5975b17dbc334cf94d30d3e9c6d9bef88c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-blocks"
RDEPENDS:${PN} += ""

inherit rpm
