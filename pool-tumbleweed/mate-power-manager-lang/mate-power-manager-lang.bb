SUMMARY = "Translations for package mate-power-manager"
DESCRIPTION = "Provides translations for the 'mate-power-manager' package."
LICENSE = "GPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "mate-power-manager-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "3e12b1df6909fb38f3a791bd5b1a894c826ae2c15082b46a491fc19b2791269c57bfba1b8bf1d6e8865a10a0896a72c37c40ff186ff008f764f0331fb4f737c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-power-manager:af) \
locale(mate-power-manager:ar) \
locale(mate-power-manager:as) \
locale(mate-power-manager:ast) \
locale(mate-power-manager:az) \
locale(mate-power-manager:be) \
locale(mate-power-manager:bg) \
locale(mate-power-manager:bn) \
locale(mate-power-manager:bn_IN) \
locale(mate-power-manager:br) \
locale(mate-power-manager:bs) \
locale(mate-power-manager:ca) \
locale(mate-power-manager:ca@valencia) \
locale(mate-power-manager:cs) \
locale(mate-power-manager:cy) \
locale(mate-power-manager:da) \
locale(mate-power-manager:de) \
locale(mate-power-manager:dz) \
locale(mate-power-manager:el) \
locale(mate-power-manager:en_AU) \
locale(mate-power-manager:en_CA) \
locale(mate-power-manager:en_GB) \
locale(mate-power-manager:en_US) \
locale(mate-power-manager:eo) \
locale(mate-power-manager:es) \
locale(mate-power-manager:es_AR) \
locale(mate-power-manager:es_CL) \
locale(mate-power-manager:es_CO) \
locale(mate-power-manager:es_CR) \
locale(mate-power-manager:es_DO) \
locale(mate-power-manager:es_EC) \
locale(mate-power-manager:es_ES) \
locale(mate-power-manager:es_MX) \
locale(mate-power-manager:es_NI) \
locale(mate-power-manager:es_PA) \
locale(mate-power-manager:es_PE) \
locale(mate-power-manager:es_PR) \
locale(mate-power-manager:es_SV) \
locale(mate-power-manager:es_UY) \
locale(mate-power-manager:es_VE) \
locale(mate-power-manager:et) \
locale(mate-power-manager:eu) \
locale(mate-power-manager:fa) \
locale(mate-power-manager:fi) \
locale(mate-power-manager:fr) \
locale(mate-power-manager:fur) \
locale(mate-power-manager:ga) \
locale(mate-power-manager:gl) \
locale(mate-power-manager:gu) \
locale(mate-power-manager:he) \
locale(mate-power-manager:hi) \
locale(mate-power-manager:hr) \
locale(mate-power-manager:hu) \
locale(mate-power-manager:ia) \
locale(mate-power-manager:id) \
locale(mate-power-manager:is) \
locale(mate-power-manager:it) \
locale(mate-power-manager:ja) \
locale(mate-power-manager:ka) \
locale(mate-power-manager:kk) \
locale(mate-power-manager:kn) \
locale(mate-power-manager:ko) \
locale(mate-power-manager:lt) \
locale(mate-power-manager:lv) \
locale(mate-power-manager:mai) \
locale(mate-power-manager:mk) \
locale(mate-power-manager:ml) \
locale(mate-power-manager:mr) \
locale(mate-power-manager:ms) \
locale(mate-power-manager:nb) \
locale(mate-power-manager:nds) \
locale(mate-power-manager:ne) \
locale(mate-power-manager:nl) \
locale(mate-power-manager:nn) \
locale(mate-power-manager:oc) \
locale(mate-power-manager:or) \
locale(mate-power-manager:pa) \
locale(mate-power-manager:pl) \
locale(mate-power-manager:pt) \
locale(mate-power-manager:pt_BR) \
locale(mate-power-manager:ro) \
locale(mate-power-manager:ru) \
locale(mate-power-manager:si) \
locale(mate-power-manager:sk) \
locale(mate-power-manager:sl) \
locale(mate-power-manager:sq) \
locale(mate-power-manager:sr) \
locale(mate-power-manager:sr@latin) \
locale(mate-power-manager:sv) \
locale(mate-power-manager:ta) \
locale(mate-power-manager:te) \
locale(mate-power-manager:th) \
locale(mate-power-manager:tr) \
locale(mate-power-manager:ug) \
locale(mate-power-manager:uk) \
locale(mate-power-manager:vi) \
locale(mate-power-manager:wa) \
locale(mate-power-manager:zh_CN) \
locale(mate-power-manager:zh_HK) \
locale(mate-power-manager:zh_TW) \
mate-power-manager-lang \
mate-power-manager-lang-all"

RDEPENDS:${PN} += "mate-power-manager"

inherit rpm
