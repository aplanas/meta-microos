SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sv-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "0094e8d2931b3df1c81d30346c0bfd25e8cb5bb9f00925fd0c6b1c8a01f2719c6bc7c720dbd287c6ed4839378cbca963e47f6773468fcd0f6d74b1dc5ccb0db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
