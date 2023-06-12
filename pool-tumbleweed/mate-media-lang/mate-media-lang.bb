SUMMARY = "Translations for package mate-media"
DESCRIPTION = "Provides translations for the 'mate-media' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-media-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "d189e0c4750386d46d4464a135d15b2f483f615970900d0d77ccd75424e1c004ee267e824a01060daafd7f57e98ebcbddc085eb6efec0cc643ea58e5ece39df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-media:af) \
locale(mate-media:ar) \
locale(mate-media:as) \
locale(mate-media:ast) \
locale(mate-media:az) \
locale(mate-media:be) \
locale(mate-media:bg) \
locale(mate-media:bn) \
locale(mate-media:bn_IN) \
locale(mate-media:br) \
locale(mate-media:bs) \
locale(mate-media:ca) \
locale(mate-media:ca@valencia) \
locale(mate-media:cs) \
locale(mate-media:cy) \
locale(mate-media:da) \
locale(mate-media:de) \
locale(mate-media:dz) \
locale(mate-media:el) \
locale(mate-media:en_AU) \
locale(mate-media:en_CA) \
locale(mate-media:en_GB) \
locale(mate-media:en_US) \
locale(mate-media:eo) \
locale(mate-media:es) \
locale(mate-media:es_AR) \
locale(mate-media:es_CL) \
locale(mate-media:es_CO) \
locale(mate-media:es_CR) \
locale(mate-media:es_DO) \
locale(mate-media:es_EC) \
locale(mate-media:es_ES) \
locale(mate-media:es_MX) \
locale(mate-media:es_NI) \
locale(mate-media:es_PA) \
locale(mate-media:es_PE) \
locale(mate-media:es_PR) \
locale(mate-media:es_SV) \
locale(mate-media:es_UY) \
locale(mate-media:es_VE) \
locale(mate-media:et) \
locale(mate-media:eu) \
locale(mate-media:fa) \
locale(mate-media:fi) \
locale(mate-media:fr) \
locale(mate-media:fr_CA) \
locale(mate-media:fur) \
locale(mate-media:ga) \
locale(mate-media:gd) \
locale(mate-media:gl) \
locale(mate-media:gu) \
locale(mate-media:he) \
locale(mate-media:hi) \
locale(mate-media:hr) \
locale(mate-media:hu) \
locale(mate-media:ia) \
locale(mate-media:id) \
locale(mate-media:is) \
locale(mate-media:it) \
locale(mate-media:ja) \
locale(mate-media:ka) \
locale(mate-media:kk) \
locale(mate-media:kn) \
locale(mate-media:ko) \
locale(mate-media:lt) \
locale(mate-media:lv) \
locale(mate-media:mai) \
locale(mate-media:mk) \
locale(mate-media:ml) \
locale(mate-media:mr) \
locale(mate-media:ms) \
locale(mate-media:nb) \
locale(mate-media:nds) \
locale(mate-media:ne) \
locale(mate-media:nl) \
locale(mate-media:nn) \
locale(mate-media:oc) \
locale(mate-media:or) \
locale(mate-media:pa) \
locale(mate-media:pl) \
locale(mate-media:pt) \
locale(mate-media:pt_BR) \
locale(mate-media:ro) \
locale(mate-media:ru) \
locale(mate-media:si) \
locale(mate-media:sk) \
locale(mate-media:sl) \
locale(mate-media:sq) \
locale(mate-media:sr) \
locale(mate-media:sr@latin) \
locale(mate-media:sv) \
locale(mate-media:ta) \
locale(mate-media:te) \
locale(mate-media:th) \
locale(mate-media:tr) \
locale(mate-media:ug) \
locale(mate-media:uk) \
locale(mate-media:vi) \
locale(mate-media:wa) \
locale(mate-media:zh_CN) \
locale(mate-media:zh_HK) \
locale(mate-media:zh_TW) \
mate-media-lang \
mate-media-lang-all"
RDEPENDS:${PN} += "mate-media"

inherit rpm