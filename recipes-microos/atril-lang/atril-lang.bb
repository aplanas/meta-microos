SUMMARY = "Translations for package atril"
DESCRIPTION = "Provides translations for the 'atril' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "atril-lang-1.26.0-1.11.noarch.rpm"
RPM_HASH = "b9d7949916b1d8851f9b80c0ac372ecded368c45bfb263fa86dafff83e762a0e0f1b544e4e534ff3989e2e4144b847106021fe4897a7860b58198ba4dc078e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atril-lang atril-lang-all locale(atril:af) locale(atril:ar) locale(atril:as) locale(atril:ast) locale(atril:az) locale(atril:be) locale(atril:bg) locale(atril:bn) locale(atril:bn_IN) locale(atril:br) locale(atril:bs) locale(atril:ca) locale(atril:ca@valencia) locale(atril:cs) locale(atril:cy) locale(atril:da) locale(atril:de) locale(atril:de_CH) locale(atril:dz) locale(atril:el) locale(atril:en_AU) locale(atril:en_CA) locale(atril:en_GB) locale(atril:eo) locale(atril:es) locale(atril:es_AR) locale(atril:es_CL) locale(atril:es_CO) locale(atril:es_CR) locale(atril:es_DO) locale(atril:es_EC) locale(atril:es_ES) locale(atril:es_MX) locale(atril:es_NI) locale(atril:es_PA) locale(atril:es_PE) locale(atril:es_PR) locale(atril:es_SV) locale(atril:es_UY) locale(atril:es_VE) locale(atril:et) locale(atril:eu) locale(atril:fa) locale(atril:fi) locale(atril:fr) locale(atril:fr_CA) locale(atril:fur) locale(atril:ga) locale(atril:gl) locale(atril:gu) locale(atril:he) locale(atril:hi) locale(atril:hr) locale(atril:hu) locale(atril:ia) locale(atril:id) locale(atril:is) locale(atril:it) locale(atril:ja) locale(atril:ka) locale(atril:kk) locale(atril:kn) locale(atril:ko) locale(atril:lt) locale(atril:lv) locale(atril:mai) locale(atril:mk) locale(atril:ml) locale(atril:mr) locale(atril:ms) locale(atril:nb) locale(atril:nds) locale(atril:ne) locale(atril:nl) locale(atril:nn) locale(atril:oc) locale(atril:or) locale(atril:pa) locale(atril:pl) locale(atril:pt) locale(atril:pt_BR) locale(atril:ro) locale(atril:ru) locale(atril:si) locale(atril:sk) locale(atril:sl) locale(atril:sq) locale(atril:sr) locale(atril:sr@latin) locale(atril:sv) locale(atril:ta) locale(atril:te) locale(atril:th) locale(atril:tr) locale(atril:ug) locale(atril:uk) locale(atril:vi) locale(atril:wa) locale(atril:zh_CN) locale(atril:zh_HK) locale(atril:zh_TW)"
RDEPENDS:${PN} += "atril"

inherit rpm
