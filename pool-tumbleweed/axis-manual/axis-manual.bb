SUMMARY = "Manual for axis"
DESCRIPTION = "Manual for axis"
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "axis-manual-1.4-306.7.noarch.rpm"
RPM_HASH = "2f4428670f401d7ec02e2639ab6408c8434896708c2a87291cbf6333889841e7d733147795a20c76caf0a5dd031bb8403e0568b6fc8fe07b7e54368688dbc102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "axis-manual"

RDEPENDS:${PN} += ""

inherit rpm
