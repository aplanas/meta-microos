SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-it-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "00338e1ac361cec5343a3b99403e1b2451599e8af6747f79cc4c3447877c9c1033643c467dd518fc2fa320c63b850f6a41af5415c1d756f835f2e69ec8796921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
