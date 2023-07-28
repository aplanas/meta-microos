SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-nb-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "40218306f435a35ca88461f29290efacc5ff0746c8f3e4ef67eb48750519536b3f469f46ea2ebe9046ecb677a5a598c045eb81a5f72ba7cc4094edfc827303e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm
