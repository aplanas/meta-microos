SUMMARY = "Translations for package mate-polkit"
DESCRIPTION = "Provides translations for the 'mate-polkit' package."
LICENSE = "LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-polkit-lang-1.26.1-1.3.noarch.rpm"
RPM_HASH = "8afa7ca86efaad9d47aa53766a522d4403a8fa84dfa6448820e186aeb25875cca8d114c89d639d3d443113fd066103a93e7069f73f3c9e4f5cb99fe665f1bfca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-polkit:af) \
locale(mate-polkit:ar) \
locale(mate-polkit:as) \
locale(mate-polkit:ast) \
locale(mate-polkit:az) \
locale(mate-polkit:be) \
locale(mate-polkit:bg) \
locale(mate-polkit:bn) \
locale(mate-polkit:bn_IN) \
locale(mate-polkit:br) \
locale(mate-polkit:bs) \
locale(mate-polkit:ca) \
locale(mate-polkit:ca@valencia) \
locale(mate-polkit:cs) \
locale(mate-polkit:cy) \
locale(mate-polkit:da) \
locale(mate-polkit:de) \
locale(mate-polkit:dz) \
locale(mate-polkit:el) \
locale(mate-polkit:en_AU) \
locale(mate-polkit:en_CA) \
locale(mate-polkit:en_GB) \
locale(mate-polkit:eo) \
locale(mate-polkit:es) \
locale(mate-polkit:es_AR) \
locale(mate-polkit:es_CO) \
locale(mate-polkit:et) \
locale(mate-polkit:eu) \
locale(mate-polkit:fa) \
locale(mate-polkit:fi) \
locale(mate-polkit:fr) \
locale(mate-polkit:fr_CA) \
locale(mate-polkit:fur) \
locale(mate-polkit:ga) \
locale(mate-polkit:gl) \
locale(mate-polkit:gu) \
locale(mate-polkit:he) \
locale(mate-polkit:hi) \
locale(mate-polkit:hr) \
locale(mate-polkit:hu) \
locale(mate-polkit:id) \
locale(mate-polkit:is) \
locale(mate-polkit:it) \
locale(mate-polkit:ja) \
locale(mate-polkit:ka) \
locale(mate-polkit:kk) \
locale(mate-polkit:kn) \
locale(mate-polkit:ko) \
locale(mate-polkit:lt) \
locale(mate-polkit:lv) \
locale(mate-polkit:mai) \
locale(mate-polkit:mk) \
locale(mate-polkit:ml) \
locale(mate-polkit:mr) \
locale(mate-polkit:ms) \
locale(mate-polkit:nb) \
locale(mate-polkit:nds) \
locale(mate-polkit:ne) \
locale(mate-polkit:nl) \
locale(mate-polkit:nn) \
locale(mate-polkit:oc) \
locale(mate-polkit:or) \
locale(mate-polkit:pa) \
locale(mate-polkit:pl) \
locale(mate-polkit:pt) \
locale(mate-polkit:pt_BR) \
locale(mate-polkit:ro) \
locale(mate-polkit:ru) \
locale(mate-polkit:si) \
locale(mate-polkit:sk) \
locale(mate-polkit:sl) \
locale(mate-polkit:sq) \
locale(mate-polkit:sr) \
locale(mate-polkit:sr@latin) \
locale(mate-polkit:sv) \
locale(mate-polkit:ta) \
locale(mate-polkit:te) \
locale(mate-polkit:th) \
locale(mate-polkit:tr) \
locale(mate-polkit:ug) \
locale(mate-polkit:uk) \
locale(mate-polkit:vi) \
locale(mate-polkit:wa) \
locale(mate-polkit:zh_CN) \
locale(mate-polkit:zh_HK) \
locale(mate-polkit:zh_TW) \
mate-polkit-lang \
mate-polkit-lang-all"

RDEPENDS:${PN} += "mate-polkit"

inherit rpm
