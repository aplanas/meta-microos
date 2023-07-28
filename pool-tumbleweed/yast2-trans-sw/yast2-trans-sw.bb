SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sw-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "4d1d45cdbd3e865afd9e923486f5db09da7f859b30ef4f1e410665311d3f81f7f93871985c8ade9dabe6233d3428e46b1457c516bdf6f24e575e6f730c340655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm
