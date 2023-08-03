SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sl-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "795522bd33935b0efdbf3e72efc79c2e64a3d9671b64823883838089fd37d13ea4d1785f68c44681461cf50b5d29522f1dc7b3d5ebe3d4ffc17f05a8c91cf51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
