SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-nb-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "88122a1b68be64c49263cade96309797d20b04fda8bc6329ed20e857a5b1d290b3162ad0d6cab965de33438f602864efccd9020df7602ef7b4cff5d3344bfe82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm
