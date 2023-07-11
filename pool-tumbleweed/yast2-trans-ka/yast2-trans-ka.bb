SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ka-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "5b922d1fbb11580ece6bfe63aebbc63a69c6c7d4beab591bbebb54652718fbbd6acd5ea4a7a04522ca7a6fa4a03be5965ee7fedfc4e501ded07d8869eea86031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
