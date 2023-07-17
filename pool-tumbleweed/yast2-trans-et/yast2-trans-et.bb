SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-et-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "69624dcaef78514c92f22933d946c5f9c7796087c326ab98f9189d2433b68dfd51357a55d856a3451c354511fca26636f659b78ac59ddad8ebc145cc932caca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm
