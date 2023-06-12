SUMMARY = "Translations for package findutils"
DESCRIPTION = "Provides translations for the 'findutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.9.0"

RPM_NAME = "findutils-lang-4.9.0-2.3.noarch.rpm"
RPM_HASH = "ab351318de5fa1191b5d78e7392822ef56e71956bfa4843e88dfc5657b7993b5bc6d2051231e1dd393618647bceba4acf5fd904367f1484fbb70b5baf5753ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findutils-lang \
findutils-lang-all \
locale(findutils:be) \
locale(findutils:bg) \
locale(findutils:ca) \
locale(findutils:cs) \
locale(findutils:da) \
locale(findutils:de) \
locale(findutils:el) \
locale(findutils:eo) \
locale(findutils:es) \
locale(findutils:et) \
locale(findutils:fi) \
locale(findutils:fr) \
locale(findutils:ga) \
locale(findutils:gl) \
locale(findutils:hr) \
locale(findutils:hu) \
locale(findutils:id) \
locale(findutils:it) \
locale(findutils:ja) \
locale(findutils:ko) \
locale(findutils:lt) \
locale(findutils:ms) \
locale(findutils:nb) \
locale(findutils:nl) \
locale(findutils:pl) \
locale(findutils:pt) \
locale(findutils:pt_BR) \
locale(findutils:ro) \
locale(findutils:ru) \
locale(findutils:sk) \
locale(findutils:sl) \
locale(findutils:sr) \
locale(findutils:sv) \
locale(findutils:tr) \
locale(findutils:uk) \
locale(findutils:vi) \
locale(findutils:zh_CN) \
locale(findutils:zh_TW)"
RDEPENDS:${PN} += "findutils"

inherit rpm
