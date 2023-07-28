SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-bn-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "20b4ed93b4a4aa4f36d53120b5ac104b806be4ae76304b0b38828c9aaca80c8b001f46fa5825099661a4248ce2b6b6a0e5f5d7e2f92f2ee0edc62b2db715c581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
