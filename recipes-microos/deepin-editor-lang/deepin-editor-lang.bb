SUMMARY = "Translations for package deepin-editor"
DESCRIPTION = "Provides translations for the 'deepin-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.40"

RPM_NAME = "deepin-editor-lang-5.10.40-1.5.noarch.rpm"
RPM_HASH = "5d04b27a91ba53bd3bf947cdf30905e45da0037a03a265fd641ec4e75bff621d4f05fdb718802d942a3745cb0f87646be229afcc42456e5aefcf27446990278d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-editor-lang deepin-editor-lang-all"
RDEPENDS:${PN} += "deepin-editor"

inherit rpm
