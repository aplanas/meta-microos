SUMMARY = "Translations for package grsync"
DESCRIPTION = "Provides translations for the 'grsync' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "grsync-lang-1.3.0-1.12.noarch.rpm"
RPM_HASH = "a88bda131c1fcbf01556f8252baae3480982c03e9532ec906d70c9629c798904bbbf9b611fa9e4b07d8944aa19ec04afc77d4adfc72d0c23829ccf78a4cc06fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grsync-lang \
grsync-lang-all \
locale(grsync:ca) \
locale(grsync:cs) \
locale(grsync:de) \
locale(grsync:es) \
locale(grsync:fr) \
locale(grsync:gl) \
locale(grsync:hr) \
locale(grsync:hu) \
locale(grsync:id) \
locale(grsync:it) \
locale(grsync:nb) \
locale(grsync:nl) \
locale(grsync:pt_BR) \
locale(grsync:ru) \
locale(grsync:sv) \
locale(grsync:tr) \
locale(grsync:zh_CN) \
locale(grsync:zh_TW)"

RDEPENDS:${PN} += "grsync"

inherit rpm
