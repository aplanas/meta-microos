SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sl-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "317f8e534db449f6d281564c576cb3767e62827e2bcfc74f127c6a4c5b998842d7dc8f24e910ea47ae90d18c34d1d99c799a9915058d311ab2ebcbc6a966d19a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
