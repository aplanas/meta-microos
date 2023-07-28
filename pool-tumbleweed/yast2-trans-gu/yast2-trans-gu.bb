SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-gu-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "26a05a3c5ad948a84b415af1fc90a43ed2fa8404fe29db53196414dacb62ca3bda9ac2630b3b8e9f88b34cdb876776dd41c086c7f4dce9772ecde05cbb64ab9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
