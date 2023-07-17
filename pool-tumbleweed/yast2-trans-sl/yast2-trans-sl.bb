SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sl-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "6ca63a5a4ada1a08be27fe7c3d146d1b38500e91c5669561863d10fa5117e3dd3d083652937d306258d97192a36dac058ec70b8081f7082745e90a815077fdc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
