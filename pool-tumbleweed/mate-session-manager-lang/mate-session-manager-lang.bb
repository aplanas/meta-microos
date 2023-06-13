SUMMARY = "Translations for package mate-session-manager"
DESCRIPTION = "Provides translations for the 'mate-session-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "293238f21348e4109b894d729edccc96547c09fb3de0650f76b0c1e6c3f1c81ed39fba83f1fa2107b1cbf4861fb2e906bdb4648bd392b37e7d2b224b18b7c796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-session-manager:af) \
locale(mate-session-manager:ar) \
locale(mate-session-manager:as) \
locale(mate-session-manager:ast) \
locale(mate-session-manager:az) \
locale(mate-session-manager:be) \
locale(mate-session-manager:bg) \
locale(mate-session-manager:bn) \
locale(mate-session-manager:bn_IN) \
locale(mate-session-manager:br) \
locale(mate-session-manager:bs) \
locale(mate-session-manager:ca) \
locale(mate-session-manager:ca@valencia) \
locale(mate-session-manager:cs) \
locale(mate-session-manager:cy) \
locale(mate-session-manager:da) \
locale(mate-session-manager:de) \
locale(mate-session-manager:dz) \
locale(mate-session-manager:el) \
locale(mate-session-manager:en_AU) \
locale(mate-session-manager:en_CA) \
locale(mate-session-manager:en_GB) \
locale(mate-session-manager:en_US) \
locale(mate-session-manager:eo) \
locale(mate-session-manager:es) \
locale(mate-session-manager:es_AR) \
locale(mate-session-manager:es_CL) \
locale(mate-session-manager:es_CO) \
locale(mate-session-manager:es_CR) \
locale(mate-session-manager:es_DO) \
locale(mate-session-manager:es_EC) \
locale(mate-session-manager:es_ES) \
locale(mate-session-manager:es_MX) \
locale(mate-session-manager:es_NI) \
locale(mate-session-manager:es_PA) \
locale(mate-session-manager:es_PE) \
locale(mate-session-manager:es_PR) \
locale(mate-session-manager:es_SV) \
locale(mate-session-manager:es_UY) \
locale(mate-session-manager:es_VE) \
locale(mate-session-manager:et) \
locale(mate-session-manager:eu) \
locale(mate-session-manager:fa) \
locale(mate-session-manager:fi) \
locale(mate-session-manager:fr) \
locale(mate-session-manager:fr_CA) \
locale(mate-session-manager:fur) \
locale(mate-session-manager:ga) \
locale(mate-session-manager:gd) \
locale(mate-session-manager:gl) \
locale(mate-session-manager:gu) \
locale(mate-session-manager:he) \
locale(mate-session-manager:hi) \
locale(mate-session-manager:hr) \
locale(mate-session-manager:hu) \
locale(mate-session-manager:ia) \
locale(mate-session-manager:id) \
locale(mate-session-manager:is) \
locale(mate-session-manager:it) \
locale(mate-session-manager:ja) \
locale(mate-session-manager:ka) \
locale(mate-session-manager:kk) \
locale(mate-session-manager:kn) \
locale(mate-session-manager:ko) \
locale(mate-session-manager:lt) \
locale(mate-session-manager:lv) \
locale(mate-session-manager:mai) \
locale(mate-session-manager:mk) \
locale(mate-session-manager:ml) \
locale(mate-session-manager:mr) \
locale(mate-session-manager:ms) \
locale(mate-session-manager:nb) \
locale(mate-session-manager:nds) \
locale(mate-session-manager:ne) \
locale(mate-session-manager:nl) \
locale(mate-session-manager:nn) \
locale(mate-session-manager:oc) \
locale(mate-session-manager:or) \
locale(mate-session-manager:pa) \
locale(mate-session-manager:pl) \
locale(mate-session-manager:pt) \
locale(mate-session-manager:pt_BR) \
locale(mate-session-manager:ro) \
locale(mate-session-manager:ru) \
locale(mate-session-manager:si) \
locale(mate-session-manager:sk) \
locale(mate-session-manager:sl) \
locale(mate-session-manager:sq) \
locale(mate-session-manager:sr) \
locale(mate-session-manager:sr@latin) \
locale(mate-session-manager:sv) \
locale(mate-session-manager:ta) \
locale(mate-session-manager:te) \
locale(mate-session-manager:th) \
locale(mate-session-manager:tr) \
locale(mate-session-manager:ug) \
locale(mate-session-manager:uk) \
locale(mate-session-manager:vi) \
locale(mate-session-manager:wa) \
locale(mate-session-manager:zh_CN) \
locale(mate-session-manager:zh_HK) \
locale(mate-session-manager:zh_TW) \
mate-session-manager-lang \
mate-session-manager-lang-all"

RDEPENDS:${PN} += "mate-session-manager"

inherit rpm
