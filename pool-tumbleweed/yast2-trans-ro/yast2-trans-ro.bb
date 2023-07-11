SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ro-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "da13cf966bed838623f623bdb3f5243703cf9d107125176dc44a845b52feb1769993ede450c942caddc902c0284df4071c8228ceebae894959ce5cedfe600ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
