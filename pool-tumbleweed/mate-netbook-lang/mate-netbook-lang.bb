SUMMARY = "Translations for package mate-netbook"
DESCRIPTION = "Provides translations for the 'mate-netbook' package."
LICENSE = "GPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "mate-netbook-lang-1.26.0-1.9.noarch.rpm"
RPM_HASH = "f79b6ddb4f2f86140747abac28616dc39e3e07194dd5271de844f47243b27d45a20bcdd68c1a68486823f347c19fcbdfbe3cb421e64f4ef04e2df5a9c8f9352f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-netbook:af) \
locale(mate-netbook:ar) \
locale(mate-netbook:as) \
locale(mate-netbook:ast) \
locale(mate-netbook:az) \
locale(mate-netbook:be) \
locale(mate-netbook:bg) \
locale(mate-netbook:bn) \
locale(mate-netbook:bn_IN) \
locale(mate-netbook:br) \
locale(mate-netbook:bs) \
locale(mate-netbook:ca) \
locale(mate-netbook:ca@valencia) \
locale(mate-netbook:cs) \
locale(mate-netbook:cy) \
locale(mate-netbook:da) \
locale(mate-netbook:de) \
locale(mate-netbook:dz) \
locale(mate-netbook:el) \
locale(mate-netbook:en_AU) \
locale(mate-netbook:en_CA) \
locale(mate-netbook:en_GB) \
locale(mate-netbook:eo) \
locale(mate-netbook:es) \
locale(mate-netbook:es_AR) \
locale(mate-netbook:es_CL) \
locale(mate-netbook:es_CO) \
locale(mate-netbook:es_CR) \
locale(mate-netbook:es_DO) \
locale(mate-netbook:es_EC) \
locale(mate-netbook:es_ES) \
locale(mate-netbook:es_MX) \
locale(mate-netbook:es_NI) \
locale(mate-netbook:es_PA) \
locale(mate-netbook:es_PE) \
locale(mate-netbook:es_PR) \
locale(mate-netbook:es_SV) \
locale(mate-netbook:es_UY) \
locale(mate-netbook:es_VE) \
locale(mate-netbook:et) \
locale(mate-netbook:eu) \
locale(mate-netbook:fa) \
locale(mate-netbook:fi) \
locale(mate-netbook:fr) \
locale(mate-netbook:fr_CA) \
locale(mate-netbook:fur) \
locale(mate-netbook:ga) \
locale(mate-netbook:gd) \
locale(mate-netbook:gl) \
locale(mate-netbook:gu) \
locale(mate-netbook:he) \
locale(mate-netbook:hi) \
locale(mate-netbook:hr) \
locale(mate-netbook:hu) \
locale(mate-netbook:ia) \
locale(mate-netbook:id) \
locale(mate-netbook:is) \
locale(mate-netbook:it) \
locale(mate-netbook:ja) \
locale(mate-netbook:ka) \
locale(mate-netbook:kk) \
locale(mate-netbook:km) \
locale(mate-netbook:kn) \
locale(mate-netbook:ko) \
locale(mate-netbook:lt) \
locale(mate-netbook:lv) \
locale(mate-netbook:mai) \
locale(mate-netbook:mk) \
locale(mate-netbook:ml) \
locale(mate-netbook:mr) \
locale(mate-netbook:ms) \
locale(mate-netbook:nb) \
locale(mate-netbook:nds) \
locale(mate-netbook:ne) \
locale(mate-netbook:nl) \
locale(mate-netbook:nn) \
locale(mate-netbook:oc) \
locale(mate-netbook:or) \
locale(mate-netbook:pa) \
locale(mate-netbook:pl) \
locale(mate-netbook:pt) \
locale(mate-netbook:pt_BR) \
locale(mate-netbook:ro) \
locale(mate-netbook:ru) \
locale(mate-netbook:si) \
locale(mate-netbook:sk) \
locale(mate-netbook:sl) \
locale(mate-netbook:sq) \
locale(mate-netbook:sr) \
locale(mate-netbook:sr@latin) \
locale(mate-netbook:sv) \
locale(mate-netbook:ta) \
locale(mate-netbook:te) \
locale(mate-netbook:th) \
locale(mate-netbook:tr) \
locale(mate-netbook:ug) \
locale(mate-netbook:uk) \
locale(mate-netbook:vi) \
locale(mate-netbook:wa) \
locale(mate-netbook:zh_CN) \
locale(mate-netbook:zh_HK) \
locale(mate-netbook:zh_TW) \
mate-netbook-lang \
mate-netbook-lang-all"

RDEPENDS:${PN} += "mate-netbook"

inherit rpm
