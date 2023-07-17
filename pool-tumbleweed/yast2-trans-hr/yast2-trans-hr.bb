SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-hr-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "fcca4051ebe88d6afe0f6dffa6ee2659defb22a6e5d03808c05f8c707468c5cca10e814348f663af3e712dfb384ac622fc3744f7348ae7eb7407da2cfecc228c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
