SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-uk-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "8aba76affca05988f2b6697e865cc659e4a6c5437f1d851d5173754dcf345ab3364b48413a193ef993cd289649331cdf1909ad14b176b30addc5cb68bd987daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
