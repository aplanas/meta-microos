SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-gu-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "0a54b4ecc18dd8ee4883157f67714aead85e3cbcaf19f50901af70f565c79faeab5f07147c013f0a776fd016d1d95ee9d41540ef346d523d3111e621cbf79942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
