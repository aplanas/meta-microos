SUMMARY = "Translations for package five-or-more"
DESCRIPTION = "Provides translations for the 'five-or-more' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.32.3"

RPM_NAME = "five-or-more-lang-3.32.3-1.7.noarch.rpm"
RPM_HASH = "4ba2e7ebf52a55b561580e053c47de8a5a615d2f53b03e50f9187ea311a45aaa2f6b7b86e5a020cdacd897a016df1fd793527a0fda9b416049e87bcd0ac4381d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "five-or-more-lang \
five-or-more-lang-all \
locale(five-or-more:af) \
locale(five-or-more:ar) \
locale(five-or-more:as) \
locale(five-or-more:ast) \
locale(five-or-more:az) \
locale(five-or-more:be) \
locale(five-or-more:bg) \
locale(five-or-more:bn) \
locale(five-or-more:bn_IN) \
locale(five-or-more:br) \
locale(five-or-more:bs) \
locale(five-or-more:ca) \
locale(five-or-more:ca@valencia) \
locale(five-or-more:cs) \
locale(five-or-more:cy) \
locale(five-or-more:da) \
locale(five-or-more:de) \
locale(five-or-more:dz) \
locale(five-or-more:el) \
locale(five-or-more:en@shaw) \
locale(five-or-more:en_CA) \
locale(five-or-more:en_GB) \
locale(five-or-more:eo) \
locale(five-or-more:es) \
locale(five-or-more:et) \
locale(five-or-more:eu) \
locale(five-or-more:fa) \
locale(five-or-more:fi) \
locale(five-or-more:fr) \
locale(five-or-more:fur) \
locale(five-or-more:ga) \
locale(five-or-more:gl) \
locale(five-or-more:gu) \
locale(five-or-more:he) \
locale(five-or-more:hi) \
locale(five-or-more:hr) \
locale(five-or-more:hu) \
locale(five-or-more:id) \
locale(five-or-more:is) \
locale(five-or-more:it) \
locale(five-or-more:ja) \
locale(five-or-more:ka) \
locale(five-or-more:kk) \
locale(five-or-more:km) \
locale(five-or-more:kn) \
locale(five-or-more:ko) \
locale(five-or-more:lt) \
locale(five-or-more:lv) \
locale(five-or-more:mai) \
locale(five-or-more:mk) \
locale(five-or-more:ml) \
locale(five-or-more:mr) \
locale(five-or-more:ms) \
locale(five-or-more:nb) \
locale(five-or-more:ne) \
locale(five-or-more:nl) \
locale(five-or-more:nn) \
locale(five-or-more:oc) \
locale(five-or-more:or) \
locale(five-or-more:pa) \
locale(five-or-more:pl) \
locale(five-or-more:pt) \
locale(five-or-more:pt_BR) \
locale(five-or-more:ro) \
locale(five-or-more:ru) \
locale(five-or-more:si) \
locale(five-or-more:sk) \
locale(five-or-more:sl) \
locale(five-or-more:sq) \
locale(five-or-more:sr) \
locale(five-or-more:sr@latin) \
locale(five-or-more:sv) \
locale(five-or-more:ta) \
locale(five-or-more:te) \
locale(five-or-more:th) \
locale(five-or-more:tr) \
locale(five-or-more:ug) \
locale(five-or-more:uk) \
locale(five-or-more:vi) \
locale(five-or-more:wa) \
locale(five-or-more:zh_CN) \
locale(five-or-more:zh_HK) \
locale(five-or-more:zh_TW)"
RDEPENDS:${PN} += "five-or-more"

inherit rpm
