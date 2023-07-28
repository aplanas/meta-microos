SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ko-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "71c61935ce345369bf76580ccff88a1554a90257796f01f00ef2cd1ab05199190f92308da1fe009ff986f0bfed64ee852f743fc7867d853040f417a64c7deb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm
