SUMMARY = "Translations for package mate-control-center"
DESCRIPTION = "Provides translations for the 'mate-control-center' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-control-center-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "b44e3d2576cb58d3ce82b409e8787f3b36d05ab4599bee7debe62de7ea0e26f31e850c3ec98dd4a5597aa999fea13930ceb12a197becc12d804966ff9d1ef889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-control-center:af) \
locale(mate-control-center:ar) \
locale(mate-control-center:as) \
locale(mate-control-center:ast) \
locale(mate-control-center:az) \
locale(mate-control-center:be) \
locale(mate-control-center:bg) \
locale(mate-control-center:bn) \
locale(mate-control-center:bn_IN) \
locale(mate-control-center:br) \
locale(mate-control-center:bs) \
locale(mate-control-center:ca) \
locale(mate-control-center:ca@valencia) \
locale(mate-control-center:cs) \
locale(mate-control-center:cy) \
locale(mate-control-center:da) \
locale(mate-control-center:de) \
locale(mate-control-center:dz) \
locale(mate-control-center:el) \
locale(mate-control-center:en_AU) \
locale(mate-control-center:en_CA) \
locale(mate-control-center:en_GB) \
locale(mate-control-center:en_US) \
locale(mate-control-center:eo) \
locale(mate-control-center:es) \
locale(mate-control-center:es_AR) \
locale(mate-control-center:es_CL) \
locale(mate-control-center:es_CO) \
locale(mate-control-center:es_CR) \
locale(mate-control-center:es_DO) \
locale(mate-control-center:es_EC) \
locale(mate-control-center:es_ES) \
locale(mate-control-center:es_MX) \
locale(mate-control-center:es_NI) \
locale(mate-control-center:es_PA) \
locale(mate-control-center:es_PE) \
locale(mate-control-center:es_PR) \
locale(mate-control-center:es_SV) \
locale(mate-control-center:es_UY) \
locale(mate-control-center:es_VE) \
locale(mate-control-center:et) \
locale(mate-control-center:eu) \
locale(mate-control-center:fa) \
locale(mate-control-center:fi) \
locale(mate-control-center:fr) \
locale(mate-control-center:fr_CA) \
locale(mate-control-center:fur) \
locale(mate-control-center:ga) \
locale(mate-control-center:gd) \
locale(mate-control-center:gl) \
locale(mate-control-center:gu) \
locale(mate-control-center:he) \
locale(mate-control-center:hi) \
locale(mate-control-center:hr) \
locale(mate-control-center:hu) \
locale(mate-control-center:ia) \
locale(mate-control-center:id) \
locale(mate-control-center:is) \
locale(mate-control-center:it) \
locale(mate-control-center:ja) \
locale(mate-control-center:ka) \
locale(mate-control-center:kk) \
locale(mate-control-center:km) \
locale(mate-control-center:kn) \
locale(mate-control-center:ko) \
locale(mate-control-center:lt) \
locale(mate-control-center:lv) \
locale(mate-control-center:mai) \
locale(mate-control-center:mk) \
locale(mate-control-center:ml) \
locale(mate-control-center:mr) \
locale(mate-control-center:ms) \
locale(mate-control-center:nb) \
locale(mate-control-center:nds) \
locale(mate-control-center:ne) \
locale(mate-control-center:nl) \
locale(mate-control-center:nn) \
locale(mate-control-center:oc) \
locale(mate-control-center:or) \
locale(mate-control-center:pa) \
locale(mate-control-center:pl) \
locale(mate-control-center:pt) \
locale(mate-control-center:pt_BR) \
locale(mate-control-center:ro) \
locale(mate-control-center:ru) \
locale(mate-control-center:si) \
locale(mate-control-center:sk) \
locale(mate-control-center:sl) \
locale(mate-control-center:sq) \
locale(mate-control-center:sr) \
locale(mate-control-center:sr@latin) \
locale(mate-control-center:sv) \
locale(mate-control-center:ta) \
locale(mate-control-center:te) \
locale(mate-control-center:th) \
locale(mate-control-center:tr) \
locale(mate-control-center:ug) \
locale(mate-control-center:uk) \
locale(mate-control-center:vi) \
locale(mate-control-center:wa) \
locale(mate-control-center:zh_CN) \
locale(mate-control-center:zh_HK) \
locale(mate-control-center:zh_TW) \
mate-control-center-lang \
mate-control-center-lang-all"
RDEPENDS:${PN} += "mate-control-center"

inherit rpm
