SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sr-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "788a52b965a2aeb136035d844917be332f2988bfcb3333ce02112010710b12b8ea2833f09a379de2421110f5e981747d381211bc034a6d598fed7c5b1cf77fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm
