SUMMARY = "Translations for package mate-tweak"
DESCRIPTION = "Provides translations for the 'mate-tweak' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.10.0"

RPM_NAME = "mate-tweak-lang-22.10.0-1.1.noarch.rpm"
RPM_HASH = "f9dc743a54b21bdc15d3237f0dc4c5a2c42848231af664de9fb3119e8a60a9688ddf1a100722e98f4879e0b56ee15cdcb5c707235b899a85cbf96d0d2bbc9df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-tweak:af) \
locale(mate-tweak:ar) \
locale(mate-tweak:as) \
locale(mate-tweak:ast) \
locale(mate-tweak:az) \
locale(mate-tweak:be) \
locale(mate-tweak:bg) \
locale(mate-tweak:bn) \
locale(mate-tweak:bn_IN) \
locale(mate-tweak:br) \
locale(mate-tweak:bs) \
locale(mate-tweak:ca) \
locale(mate-tweak:ca@valencia) \
locale(mate-tweak:cs) \
locale(mate-tweak:cy) \
locale(mate-tweak:da) \
locale(mate-tweak:de) \
locale(mate-tweak:de_CH) \
locale(mate-tweak:dz) \
locale(mate-tweak:el) \
locale(mate-tweak:en) \
locale(mate-tweak:en_AU) \
locale(mate-tweak:en_CA) \
locale(mate-tweak:en_GB) \
locale(mate-tweak:en_US) \
locale(mate-tweak:eo) \
locale(mate-tweak:es) \
locale(mate-tweak:es_AR) \
locale(mate-tweak:es_CL) \
locale(mate-tweak:es_CO) \
locale(mate-tweak:es_CR) \
locale(mate-tweak:es_DO) \
locale(mate-tweak:es_EC) \
locale(mate-tweak:es_ES) \
locale(mate-tweak:es_MX) \
locale(mate-tweak:es_NI) \
locale(mate-tweak:es_PA) \
locale(mate-tweak:es_PE) \
locale(mate-tweak:es_PR) \
locale(mate-tweak:es_SV) \
locale(mate-tweak:es_UY) \
locale(mate-tweak:es_VE) \
locale(mate-tweak:et) \
locale(mate-tweak:eu) \
locale(mate-tweak:fa) \
locale(mate-tweak:fi) \
locale(mate-tweak:fr) \
locale(mate-tweak:fr_CA) \
locale(mate-tweak:fr_FR) \
locale(mate-tweak:fur) \
locale(mate-tweak:ga) \
locale(mate-tweak:gd) \
locale(mate-tweak:gl) \
locale(mate-tweak:gu) \
locale(mate-tweak:he) \
locale(mate-tweak:hi) \
locale(mate-tweak:hr) \
locale(mate-tweak:hu) \
locale(mate-tweak:ia) \
locale(mate-tweak:id) \
locale(mate-tweak:is) \
locale(mate-tweak:it) \
locale(mate-tweak:ja) \
locale(mate-tweak:ka) \
locale(mate-tweak:kk) \
locale(mate-tweak:km) \
locale(mate-tweak:kn) \
locale(mate-tweak:ko) \
locale(mate-tweak:lt) \
locale(mate-tweak:lv) \
locale(mate-tweak:mai) \
locale(mate-tweak:mk) \
locale(mate-tweak:ml) \
locale(mate-tweak:mr) \
locale(mate-tweak:ms) \
locale(mate-tweak:nb) \
locale(mate-tweak:nds) \
locale(mate-tweak:ne) \
locale(mate-tweak:nl) \
locale(mate-tweak:nn) \
locale(mate-tweak:oc) \
locale(mate-tweak:or) \
locale(mate-tweak:pa) \
locale(mate-tweak:pl) \
locale(mate-tweak:pl_PL) \
locale(mate-tweak:pt) \
locale(mate-tweak:pt_BR) \
locale(mate-tweak:ro) \
locale(mate-tweak:ru) \
locale(mate-tweak:ru_RU) \
locale(mate-tweak:si) \
locale(mate-tweak:sk) \
locale(mate-tweak:sl) \
locale(mate-tweak:sq) \
locale(mate-tweak:sr) \
locale(mate-tweak:sr@latin) \
locale(mate-tweak:sv) \
locale(mate-tweak:ta) \
locale(mate-tweak:te) \
locale(mate-tweak:th) \
locale(mate-tweak:tr) \
locale(mate-tweak:ug) \
locale(mate-tweak:uk) \
locale(mate-tweak:uk_UA) \
locale(mate-tweak:vi) \
locale(mate-tweak:wa) \
locale(mate-tweak:zh_CN) \
locale(mate-tweak:zh_HK) \
locale(mate-tweak:zh_TW) \
mate-tweak-lang \
mate-tweak-lang-all"

RDEPENDS:${PN} += "mate-tweak"

inherit rpm
