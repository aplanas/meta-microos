SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-cy-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "2d1dc42d20f204063393bfec12b34257619d2f0c854cba244e0fcd3d51fec3d3fdae7533f949aeaea6efc8a2feb237d5c3799f22f757aa924a6d5ecb6f7afb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm
