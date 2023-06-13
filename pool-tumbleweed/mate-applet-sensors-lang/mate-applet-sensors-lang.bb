SUMMARY = "Translations for package mate-applet-sensors"
DESCRIPTION = "Provides translations for the 'mate-applet-sensors' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-applet-sensors-lang-1.26.0-1.9.noarch.rpm"
RPM_HASH = "180b713b9843e28406bbeb2ea7754715c1bbaa8f15911d439007bf9a8342bdde30a5503c836b8b07f738aea65e09a5e60fc0561a48f7d1bdb92104f57217f924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-applet-sensors:af) \
locale(mate-applet-sensors:ar) \
locale(mate-applet-sensors:as) \
locale(mate-applet-sensors:ast) \
locale(mate-applet-sensors:az) \
locale(mate-applet-sensors:be) \
locale(mate-applet-sensors:bg) \
locale(mate-applet-sensors:bn) \
locale(mate-applet-sensors:bn_IN) \
locale(mate-applet-sensors:br) \
locale(mate-applet-sensors:bs) \
locale(mate-applet-sensors:ca) \
locale(mate-applet-sensors:ca@valencia) \
locale(mate-applet-sensors:cs) \
locale(mate-applet-sensors:cy) \
locale(mate-applet-sensors:da) \
locale(mate-applet-sensors:de) \
locale(mate-applet-sensors:dz) \
locale(mate-applet-sensors:el) \
locale(mate-applet-sensors:en_AU) \
locale(mate-applet-sensors:en_CA) \
locale(mate-applet-sensors:en_GB) \
locale(mate-applet-sensors:eo) \
locale(mate-applet-sensors:es) \
locale(mate-applet-sensors:es_AR) \
locale(mate-applet-sensors:es_CL) \
locale(mate-applet-sensors:es_CO) \
locale(mate-applet-sensors:es_CR) \
locale(mate-applet-sensors:es_DO) \
locale(mate-applet-sensors:es_EC) \
locale(mate-applet-sensors:es_ES) \
locale(mate-applet-sensors:es_MX) \
locale(mate-applet-sensors:es_NI) \
locale(mate-applet-sensors:es_PA) \
locale(mate-applet-sensors:es_PE) \
locale(mate-applet-sensors:es_PR) \
locale(mate-applet-sensors:es_SV) \
locale(mate-applet-sensors:es_UY) \
locale(mate-applet-sensors:es_VE) \
locale(mate-applet-sensors:et) \
locale(mate-applet-sensors:eu) \
locale(mate-applet-sensors:fa) \
locale(mate-applet-sensors:fi) \
locale(mate-applet-sensors:fr) \
locale(mate-applet-sensors:fr_CA) \
locale(mate-applet-sensors:fur) \
locale(mate-applet-sensors:ga) \
locale(mate-applet-sensors:gl) \
locale(mate-applet-sensors:gu) \
locale(mate-applet-sensors:he) \
locale(mate-applet-sensors:hi) \
locale(mate-applet-sensors:hr) \
locale(mate-applet-sensors:hu) \
locale(mate-applet-sensors:ia) \
locale(mate-applet-sensors:id) \
locale(mate-applet-sensors:is) \
locale(mate-applet-sensors:it) \
locale(mate-applet-sensors:ja) \
locale(mate-applet-sensors:ka) \
locale(mate-applet-sensors:kk) \
locale(mate-applet-sensors:km) \
locale(mate-applet-sensors:kn) \
locale(mate-applet-sensors:ko) \
locale(mate-applet-sensors:lt) \
locale(mate-applet-sensors:lv) \
locale(mate-applet-sensors:mai) \
locale(mate-applet-sensors:mk) \
locale(mate-applet-sensors:ml) \
locale(mate-applet-sensors:mr) \
locale(mate-applet-sensors:ms) \
locale(mate-applet-sensors:nb) \
locale(mate-applet-sensors:nds) \
locale(mate-applet-sensors:ne) \
locale(mate-applet-sensors:nl) \
locale(mate-applet-sensors:nn) \
locale(mate-applet-sensors:oc) \
locale(mate-applet-sensors:or) \
locale(mate-applet-sensors:pa) \
locale(mate-applet-sensors:pl) \
locale(mate-applet-sensors:pt) \
locale(mate-applet-sensors:pt_BR) \
locale(mate-applet-sensors:ro) \
locale(mate-applet-sensors:ru) \
locale(mate-applet-sensors:si) \
locale(mate-applet-sensors:sk) \
locale(mate-applet-sensors:sl) \
locale(mate-applet-sensors:sq) \
locale(mate-applet-sensors:sr) \
locale(mate-applet-sensors:sr@latin) \
locale(mate-applet-sensors:sv) \
locale(mate-applet-sensors:ta) \
locale(mate-applet-sensors:te) \
locale(mate-applet-sensors:th) \
locale(mate-applet-sensors:tr) \
locale(mate-applet-sensors:ug) \
locale(mate-applet-sensors:uk) \
locale(mate-applet-sensors:vi) \
locale(mate-applet-sensors:wa) \
locale(mate-applet-sensors:zh_CN) \
locale(mate-applet-sensors:zh_HK) \
locale(mate-applet-sensors:zh_TW) \
mate-applet-sensors-lang \
mate-applet-sensors-lang-all"

RDEPENDS:${PN} += "mate-applet-sensors"

inherit rpm
