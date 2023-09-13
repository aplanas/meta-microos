SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-th-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "48a789228f7bc383572bc9dbd291229c199bb4d71f598edf7275eafcf128787a14095e7db9f0be753aff7eb7667fb0bb6e2ed114e0621eea03a75496c1fbaff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm
