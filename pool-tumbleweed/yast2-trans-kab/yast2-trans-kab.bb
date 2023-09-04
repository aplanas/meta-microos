SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-kab-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "a35f8c69f99e4f51066180288cf2b67d8c15654473dfc2730c0485daada61acc008014bb33919bc4e1e624abeeb21860cac883d5560546c4c46d1a1f3f22ebbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
