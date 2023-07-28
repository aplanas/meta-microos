SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-pa-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "cb7301184a53d9165d6ea53d948937de096d1d84709cf19f335699a8626fcd13367dd2afc9d1cc8fd6eb199d4b2b7a3c7e1c454e64a42962cb5126e0dc4ca0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm
