SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-pa-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "96a18ccfda7defc7d6c45bb1af66ff520e977e371a343827608bdd043af44e640ce0dd0d6a964cf0d2542d04452808acfef2121efde6c8dff461c7b1acbac6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm
