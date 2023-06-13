SUMMARY = "Translations for package xviewer"
DESCRIPTION = "Provides translations for the 'xviewer' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "xviewer-lang-3.2.4-1.7.noarch.rpm"
RPM_HASH = "4b08608160794c08687a91dd69c6ae05e41f07a5675d023f87544d37e75d7e6777940dcebd0c9fe99b66b89f823540e8f30d6940f9953ead8f83caadbf2a6d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xviewer:af) \
locale(xviewer:ar) \
locale(xviewer:as) \
locale(xviewer:ast) \
locale(xviewer:az) \
locale(xviewer:be) \
locale(xviewer:be@latin) \
locale(xviewer:bg) \
locale(xviewer:bn) \
locale(xviewer:bn_IN) \
locale(xviewer:br) \
locale(xviewer:bs) \
locale(xviewer:ca) \
locale(xviewer:ca@valencia) \
locale(xviewer:cs) \
locale(xviewer:cy) \
locale(xviewer:da) \
locale(xviewer:de) \
locale(xviewer:dz) \
locale(xviewer:el) \
locale(xviewer:en@shaw) \
locale(xviewer:en_CA) \
locale(xviewer:en_GB) \
locale(xviewer:eo) \
locale(xviewer:es) \
locale(xviewer:et) \
locale(xviewer:eu) \
locale(xviewer:fa) \
locale(xviewer:fi) \
locale(xviewer:fr) \
locale(xviewer:fur) \
locale(xviewer:ga) \
locale(xviewer:gd) \
locale(xviewer:gl) \
locale(xviewer:gu) \
locale(xviewer:he) \
locale(xviewer:hi) \
locale(xviewer:hr) \
locale(xviewer:hu) \
locale(xviewer:ia) \
locale(xviewer:id) \
locale(xviewer:is) \
locale(xviewer:it) \
locale(xviewer:ja) \
locale(xviewer:ka) \
locale(xviewer:kk) \
locale(xviewer:km) \
locale(xviewer:kn) \
locale(xviewer:ko) \
locale(xviewer:lt) \
locale(xviewer:lv) \
locale(xviewer:mai) \
locale(xviewer:mk) \
locale(xviewer:ml) \
locale(xviewer:mr) \
locale(xviewer:ms) \
locale(xviewer:nb) \
locale(xviewer:nds) \
locale(xviewer:ne) \
locale(xviewer:nl) \
locale(xviewer:nn) \
locale(xviewer:oc) \
locale(xviewer:or) \
locale(xviewer:pa) \
locale(xviewer:pl) \
locale(xviewer:pt) \
locale(xviewer:pt_BR) \
locale(xviewer:ro) \
locale(xviewer:ru) \
locale(xviewer:si) \
locale(xviewer:sk) \
locale(xviewer:sl) \
locale(xviewer:sq) \
locale(xviewer:sr) \
locale(xviewer:sr@latin) \
locale(xviewer:sv) \
locale(xviewer:ta) \
locale(xviewer:te) \
locale(xviewer:th) \
locale(xviewer:tr) \
locale(xviewer:ug) \
locale(xviewer:uk) \
locale(xviewer:vi) \
locale(xviewer:wa) \
locale(xviewer:zh_CN) \
locale(xviewer:zh_HK) \
locale(xviewer:zh_TW) \
xviewer-lang \
xviewer-lang-all"

RDEPENDS:${PN} += "xviewer"

inherit rpm
