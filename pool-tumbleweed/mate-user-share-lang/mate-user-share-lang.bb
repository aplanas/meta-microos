SUMMARY = "Translations for package mate-user-share"
DESCRIPTION = "Provides translations for the 'mate-user-share' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-user-share-lang-1.26.0-1.9.noarch.rpm"
RPM_HASH = "08914d630f17bf17ce55bfd29f7bbf4a9fe9dabc47242426d5f40c79df3e38f25ed5df028a156085f495c5cf95ba784f95654edba96ada6eb57ad719ac5d1019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-user-share:af) \
locale(mate-user-share:ar) \
locale(mate-user-share:as) \
locale(mate-user-share:ast) \
locale(mate-user-share:az) \
locale(mate-user-share:be) \
locale(mate-user-share:bg) \
locale(mate-user-share:bn) \
locale(mate-user-share:bn_IN) \
locale(mate-user-share:br) \
locale(mate-user-share:bs) \
locale(mate-user-share:ca) \
locale(mate-user-share:ca@valencia) \
locale(mate-user-share:cs) \
locale(mate-user-share:cy) \
locale(mate-user-share:da) \
locale(mate-user-share:de) \
locale(mate-user-share:dz) \
locale(mate-user-share:el) \
locale(mate-user-share:en_AU) \
locale(mate-user-share:en_CA) \
locale(mate-user-share:en_GB) \
locale(mate-user-share:eo) \
locale(mate-user-share:es) \
locale(mate-user-share:es_AR) \
locale(mate-user-share:es_CL) \
locale(mate-user-share:es_CO) \
locale(mate-user-share:es_CR) \
locale(mate-user-share:es_DO) \
locale(mate-user-share:es_EC) \
locale(mate-user-share:es_ES) \
locale(mate-user-share:es_MX) \
locale(mate-user-share:es_NI) \
locale(mate-user-share:es_PA) \
locale(mate-user-share:es_PE) \
locale(mate-user-share:es_PR) \
locale(mate-user-share:es_SV) \
locale(mate-user-share:es_UY) \
locale(mate-user-share:es_VE) \
locale(mate-user-share:et) \
locale(mate-user-share:eu) \
locale(mate-user-share:fa) \
locale(mate-user-share:fi) \
locale(mate-user-share:fr) \
locale(mate-user-share:fr_CA) \
locale(mate-user-share:fur) \
locale(mate-user-share:ga) \
locale(mate-user-share:gl) \
locale(mate-user-share:gu) \
locale(mate-user-share:he) \
locale(mate-user-share:hi) \
locale(mate-user-share:hr) \
locale(mate-user-share:hu) \
locale(mate-user-share:ia) \
locale(mate-user-share:id) \
locale(mate-user-share:is) \
locale(mate-user-share:it) \
locale(mate-user-share:ja) \
locale(mate-user-share:ka) \
locale(mate-user-share:kk) \
locale(mate-user-share:km) \
locale(mate-user-share:kn) \
locale(mate-user-share:ko) \
locale(mate-user-share:lt) \
locale(mate-user-share:lv) \
locale(mate-user-share:mai) \
locale(mate-user-share:mk) \
locale(mate-user-share:ml) \
locale(mate-user-share:mr) \
locale(mate-user-share:ms) \
locale(mate-user-share:nb) \
locale(mate-user-share:nds) \
locale(mate-user-share:ne) \
locale(mate-user-share:nl) \
locale(mate-user-share:nn) \
locale(mate-user-share:oc) \
locale(mate-user-share:or) \
locale(mate-user-share:pa) \
locale(mate-user-share:pl) \
locale(mate-user-share:pt) \
locale(mate-user-share:pt_BR) \
locale(mate-user-share:ro) \
locale(mate-user-share:ru) \
locale(mate-user-share:si) \
locale(mate-user-share:sk) \
locale(mate-user-share:sl) \
locale(mate-user-share:sq) \
locale(mate-user-share:sr) \
locale(mate-user-share:sr@latin) \
locale(mate-user-share:sv) \
locale(mate-user-share:ta) \
locale(mate-user-share:te) \
locale(mate-user-share:th) \
locale(mate-user-share:tr) \
locale(mate-user-share:ug) \
locale(mate-user-share:uk) \
locale(mate-user-share:vi) \
locale(mate-user-share:wa) \
locale(mate-user-share:zh_CN) \
locale(mate-user-share:zh_HK) \
locale(mate-user-share:zh_TW) \
mate-user-share-lang \
mate-user-share-lang-all"

RDEPENDS:${PN} += "mate-user-share"

inherit rpm
