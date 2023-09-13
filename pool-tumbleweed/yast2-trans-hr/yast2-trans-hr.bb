SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-hr-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "5a661b78e3af3bdaae9d0bfe0db72cb83598af1b822ceeb5d1d067af824f1f87c37774f99c13851f5d514466a79a0f7ee918e706f8095e96c4f1a336d79f78b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
