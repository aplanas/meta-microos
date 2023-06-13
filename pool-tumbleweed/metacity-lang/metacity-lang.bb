SUMMARY = "Translations for package metacity"
DESCRIPTION = "Provides translations for the 'metacity' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-lang-3.46.1-1.1.noarch.rpm"
RPM_HASH = "c423c3cc2b8b1b90c7e4da673808dd3c6de1d121e34c2f65b6b35352c1fa9aad5aeb9e251338e7e0f50073f15762bb5386c9270ffb7e635cfc083b9162eed275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(metacity:ar) \
locale(metacity:as) \
locale(metacity:ast) \
locale(metacity:az) \
locale(metacity:be) \
locale(metacity:be@latin) \
locale(metacity:bg) \
locale(metacity:bn) \
locale(metacity:bn_IN) \
locale(metacity:br) \
locale(metacity:bs) \
locale(metacity:ca) \
locale(metacity:ca@valencia) \
locale(metacity:cs) \
locale(metacity:cy) \
locale(metacity:da) \
locale(metacity:de) \
locale(metacity:dz) \
locale(metacity:el) \
locale(metacity:en@shaw) \
locale(metacity:en_CA) \
locale(metacity:en_GB) \
locale(metacity:eo) \
locale(metacity:es) \
locale(metacity:et) \
locale(metacity:eu) \
locale(metacity:fa) \
locale(metacity:fi) \
locale(metacity:fr) \
locale(metacity:ga) \
locale(metacity:gl) \
locale(metacity:gu) \
locale(metacity:he) \
locale(metacity:hi) \
locale(metacity:hr) \
locale(metacity:hu) \
locale(metacity:id) \
locale(metacity:is) \
locale(metacity:it) \
locale(metacity:ja) \
locale(metacity:ka) \
locale(metacity:kn) \
locale(metacity:ko) \
locale(metacity:lt) \
locale(metacity:lv) \
locale(metacity:mai) \
locale(metacity:mk) \
locale(metacity:ml) \
locale(metacity:mr) \
locale(metacity:ms) \
locale(metacity:nb) \
locale(metacity:nds) \
locale(metacity:ne) \
locale(metacity:nl) \
locale(metacity:nn) \
locale(metacity:oc) \
locale(metacity:or) \
locale(metacity:pa) \
locale(metacity:pl) \
locale(metacity:pt) \
locale(metacity:pt_BR) \
locale(metacity:ro) \
locale(metacity:ru) \
locale(metacity:si) \
locale(metacity:sk) \
locale(metacity:sl) \
locale(metacity:sq) \
locale(metacity:sr) \
locale(metacity:sr@latin) \
locale(metacity:sv) \
locale(metacity:ta) \
locale(metacity:te) \
locale(metacity:th) \
locale(metacity:tr) \
locale(metacity:ug) \
locale(metacity:uk) \
locale(metacity:vi) \
locale(metacity:wa) \
locale(metacity:zh_CN) \
locale(metacity:zh_HK) \
locale(metacity:zh_TW) \
metacity-lang \
metacity-lang-all"

RDEPENDS:${PN} += "metacity"

inherit rpm
