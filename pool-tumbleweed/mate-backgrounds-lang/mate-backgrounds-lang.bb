SUMMARY = "Translations for package mate-backgrounds"
DESCRIPTION = "Provides translations for the 'mate-backgrounds' package."
LICENSE = "GPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "mate-backgrounds-lang-1.26.0-2.5.noarch.rpm"
RPM_HASH = "5ce49f5daebf44bba4c240c8214d9150fed549f535f714f0931622fdab67f8493b4c0475864b4c7e6addc965817d80dac2222c5d39e8a5c393b002400bf3c732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-backgrounds:af) \
locale(mate-backgrounds:ar) \
locale(mate-backgrounds:as) \
locale(mate-backgrounds:ast) \
locale(mate-backgrounds:be) \
locale(mate-backgrounds:bg) \
locale(mate-backgrounds:bn) \
locale(mate-backgrounds:bn_IN) \
locale(mate-backgrounds:br) \
locale(mate-backgrounds:bs) \
locale(mate-backgrounds:ca) \
locale(mate-backgrounds:ca@valencia) \
locale(mate-backgrounds:cs) \
locale(mate-backgrounds:cy) \
locale(mate-backgrounds:da) \
locale(mate-backgrounds:de) \
locale(mate-backgrounds:dz) \
locale(mate-backgrounds:el) \
locale(mate-backgrounds:en_AU) \
locale(mate-backgrounds:en_CA) \
locale(mate-backgrounds:en_GB) \
locale(mate-backgrounds:eo) \
locale(mate-backgrounds:es) \
locale(mate-backgrounds:es_AR) \
locale(mate-backgrounds:es_CO) \
locale(mate-backgrounds:es_MX) \
locale(mate-backgrounds:et) \
locale(mate-backgrounds:eu) \
locale(mate-backgrounds:fa) \
locale(mate-backgrounds:fi) \
locale(mate-backgrounds:fr) \
locale(mate-backgrounds:fr_CA) \
locale(mate-backgrounds:fur) \
locale(mate-backgrounds:ga) \
locale(mate-backgrounds:gl) \
locale(mate-backgrounds:gu) \
locale(mate-backgrounds:he) \
locale(mate-backgrounds:hi) \
locale(mate-backgrounds:hr) \
locale(mate-backgrounds:hu) \
locale(mate-backgrounds:id) \
locale(mate-backgrounds:is) \
locale(mate-backgrounds:it) \
locale(mate-backgrounds:ja) \
locale(mate-backgrounds:ka) \
locale(mate-backgrounds:kk) \
locale(mate-backgrounds:kn) \
locale(mate-backgrounds:ko) \
locale(mate-backgrounds:lt) \
locale(mate-backgrounds:lv) \
locale(mate-backgrounds:mai) \
locale(mate-backgrounds:mk) \
locale(mate-backgrounds:ml) \
locale(mate-backgrounds:mr) \
locale(mate-backgrounds:ms) \
locale(mate-backgrounds:nb) \
locale(mate-backgrounds:nds) \
locale(mate-backgrounds:ne) \
locale(mate-backgrounds:nl) \
locale(mate-backgrounds:nn) \
locale(mate-backgrounds:oc) \
locale(mate-backgrounds:or) \
locale(mate-backgrounds:pa) \
locale(mate-backgrounds:pl) \
locale(mate-backgrounds:pt) \
locale(mate-backgrounds:pt_BR) \
locale(mate-backgrounds:ro) \
locale(mate-backgrounds:ru) \
locale(mate-backgrounds:si) \
locale(mate-backgrounds:sk) \
locale(mate-backgrounds:sl) \
locale(mate-backgrounds:sq) \
locale(mate-backgrounds:sr) \
locale(mate-backgrounds:sr@latin) \
locale(mate-backgrounds:sv) \
locale(mate-backgrounds:ta) \
locale(mate-backgrounds:te) \
locale(mate-backgrounds:th) \
locale(mate-backgrounds:tr) \
locale(mate-backgrounds:ug) \
locale(mate-backgrounds:uk) \
locale(mate-backgrounds:vi) \
locale(mate-backgrounds:zh_CN) \
locale(mate-backgrounds:zh_HK) \
locale(mate-backgrounds:zh_TW) \
mate-backgrounds-lang \
mate-backgrounds-lang-all"

RDEPENDS:${PN} += "mate-backgrounds"

inherit rpm
