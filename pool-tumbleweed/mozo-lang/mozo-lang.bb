SUMMARY = "Translations for package mozo"
DESCRIPTION = "Provides translations for the 'mozo' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.2"

RPM_NAME = "mozo-lang-1.26.2-1.2.noarch.rpm"
RPM_HASH = "4702a55e10586fa146d2a4f422bcbf80de9c51e85ac149fdc0be96373738cf4017936aecfc67cf61c1f8169ca36bb909c7c7fba512130406ff0870b8e42dd6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mozo:af) \
locale(mozo:ar) \
locale(mozo:as) \
locale(mozo:ast) \
locale(mozo:az) \
locale(mozo:be) \
locale(mozo:bg) \
locale(mozo:bn) \
locale(mozo:bn_IN) \
locale(mozo:br) \
locale(mozo:bs) \
locale(mozo:ca) \
locale(mozo:ca@valencia) \
locale(mozo:cs) \
locale(mozo:cy) \
locale(mozo:da) \
locale(mozo:de) \
locale(mozo:dz) \
locale(mozo:el) \
locale(mozo:en_AU) \
locale(mozo:en_CA) \
locale(mozo:en_GB) \
locale(mozo:en_US) \
locale(mozo:eo) \
locale(mozo:es) \
locale(mozo:es_AR) \
locale(mozo:es_CL) \
locale(mozo:es_CO) \
locale(mozo:es_CR) \
locale(mozo:es_DO) \
locale(mozo:es_EC) \
locale(mozo:es_ES) \
locale(mozo:es_MX) \
locale(mozo:es_NI) \
locale(mozo:es_PA) \
locale(mozo:es_PE) \
locale(mozo:es_PR) \
locale(mozo:es_SV) \
locale(mozo:es_UY) \
locale(mozo:es_VE) \
locale(mozo:et) \
locale(mozo:eu) \
locale(mozo:fa) \
locale(mozo:fi) \
locale(mozo:fr) \
locale(mozo:fr_CA) \
locale(mozo:fur) \
locale(mozo:ga) \
locale(mozo:gd) \
locale(mozo:gl) \
locale(mozo:gu) \
locale(mozo:he) \
locale(mozo:hi) \
locale(mozo:hr) \
locale(mozo:hu) \
locale(mozo:ia) \
locale(mozo:id) \
locale(mozo:is) \
locale(mozo:it) \
locale(mozo:ja) \
locale(mozo:ka) \
locale(mozo:kk) \
locale(mozo:km) \
locale(mozo:kn) \
locale(mozo:ko) \
locale(mozo:lt) \
locale(mozo:lv) \
locale(mozo:mai) \
locale(mozo:mk) \
locale(mozo:ml) \
locale(mozo:mr) \
locale(mozo:ms) \
locale(mozo:nb) \
locale(mozo:nds) \
locale(mozo:ne) \
locale(mozo:nl) \
locale(mozo:nn) \
locale(mozo:oc) \
locale(mozo:or) \
locale(mozo:pa) \
locale(mozo:pl) \
locale(mozo:pt) \
locale(mozo:pt_BR) \
locale(mozo:ro) \
locale(mozo:ru) \
locale(mozo:si) \
locale(mozo:sk) \
locale(mozo:sl) \
locale(mozo:sq) \
locale(mozo:sr) \
locale(mozo:sr@latin) \
locale(mozo:sv) \
locale(mozo:ta) \
locale(mozo:te) \
locale(mozo:th) \
locale(mozo:tr) \
locale(mozo:ug) \
locale(mozo:uk) \
locale(mozo:vi) \
locale(mozo:wa) \
locale(mozo:zh_CN) \
locale(mozo:zh_HK) \
locale(mozo:zh_TW) \
mozo-lang \
mozo-lang-all"
RDEPENDS:${PN} += "mozo"

inherit rpm
