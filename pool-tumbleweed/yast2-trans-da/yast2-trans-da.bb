SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-da-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "7e9c137b7bd093a5e709df51fab888518d0767253100eeca870fef39cbbc7798ca86eddd1bda121feefcd58a13f78e42fc02a039f15991bdd7cfa7b0d2c5a307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm
