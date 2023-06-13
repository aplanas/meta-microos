SUMMARY = "Translations for package idutils"
DESCRIPTION = "Provides translations for the 'idutils' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "idutils-lang-4.6-4.11.noarch.rpm"
RPM_HASH = "e7bf12058809bd3f5fdb077baf741537d941553cfdc2414d0e2b2bb34c829c39e8c2eb2bb945604805e11aff3ef280daf92311198007938727bbad52870dcff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "idutils-lang \
idutils-lang-all \
locale(idutils:da) \
locale(idutils:de) \
locale(idutils:fi) \
locale(idutils:fr) \
locale(idutils:ga) \
locale(idutils:hu) \
locale(idutils:id) \
locale(idutils:it) \
locale(idutils:nl) \
locale(idutils:pl) \
locale(idutils:pt_BR) \
locale(idutils:ro) \
locale(idutils:ru) \
locale(idutils:sv) \
locale(idutils:tr) \
locale(idutils:vi) \
locale(idutils:zh_CN)"

RDEPENDS:${PN} += "idutils"

inherit rpm
