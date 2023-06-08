SUMMARY = "Translations for package engrampa"
DESCRIPTION = "Provides translations for the 'engrampa' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "engrampa-lang-1.26.0-1.9.noarch.rpm"
RPM_HASH = "dc5baf18515e4935b94e3eb33623f7b52076c2d8e275209c4ecfb153bda930a5d7af846c3f959282c83af474a5a4103e854064eff2a34e5677e342c991de1e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engrampa-lang engrampa-lang-all locale(engrampa:af) locale(engrampa:ar) locale(engrampa:as) locale(engrampa:ast) locale(engrampa:az) locale(engrampa:be) locale(engrampa:bg) locale(engrampa:bn) locale(engrampa:bn_IN) locale(engrampa:br) locale(engrampa:bs) locale(engrampa:ca) locale(engrampa:ca@valencia) locale(engrampa:cs) locale(engrampa:cy) locale(engrampa:da) locale(engrampa:de) locale(engrampa:dz) locale(engrampa:el) locale(engrampa:en_AU) locale(engrampa:en_CA) locale(engrampa:en_GB) locale(engrampa:eo) locale(engrampa:es) locale(engrampa:es_AR) locale(engrampa:es_CL) locale(engrampa:es_CO) locale(engrampa:es_CR) locale(engrampa:es_DO) locale(engrampa:es_EC) locale(engrampa:es_ES) locale(engrampa:es_MX) locale(engrampa:es_NI) locale(engrampa:es_PA) locale(engrampa:es_PE) locale(engrampa:es_PR) locale(engrampa:es_SV) locale(engrampa:es_UY) locale(engrampa:es_VE) locale(engrampa:et) locale(engrampa:eu) locale(engrampa:fa) locale(engrampa:fi) locale(engrampa:fr) locale(engrampa:fr_CA) locale(engrampa:fur) locale(engrampa:ga) locale(engrampa:gd) locale(engrampa:gl) locale(engrampa:gu) locale(engrampa:he) locale(engrampa:hi) locale(engrampa:hr) locale(engrampa:hu) locale(engrampa:ia) locale(engrampa:id) locale(engrampa:is) locale(engrampa:it) locale(engrampa:ja) locale(engrampa:ka) locale(engrampa:kk) locale(engrampa:kn) locale(engrampa:ko) locale(engrampa:lt) locale(engrampa:lv) locale(engrampa:mai) locale(engrampa:mk) locale(engrampa:ml) locale(engrampa:mr) locale(engrampa:ms) locale(engrampa:nb) locale(engrampa:nds) locale(engrampa:ne) locale(engrampa:nl) locale(engrampa:nn) locale(engrampa:oc) locale(engrampa:or) locale(engrampa:pa) locale(engrampa:pl) locale(engrampa:pt) locale(engrampa:pt_BR) locale(engrampa:ro) locale(engrampa:ru) locale(engrampa:si) locale(engrampa:sk) locale(engrampa:sl) locale(engrampa:sq) locale(engrampa:sr) locale(engrampa:sr@latin) locale(engrampa:sv) locale(engrampa:ta) locale(engrampa:te) locale(engrampa:th) locale(engrampa:tr) locale(engrampa:ug) locale(engrampa:uk) locale(engrampa:vi) locale(engrampa:wa) locale(engrampa:zh_CN) locale(engrampa:zh_HK) locale(engrampa:zh_TW)"
RDEPENDS:${PN} += "engrampa"

inherit rpm
