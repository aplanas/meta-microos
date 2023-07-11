SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-pa-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "3b486da09d268fe47198d8fccbf75bb51521ef3b403353b2a81b0e0d3e8b236b6fb5579416eda793d60c5be4375448e86fa1388589555b25f5323cc7a216952c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm
