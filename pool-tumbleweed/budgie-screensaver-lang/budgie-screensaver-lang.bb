SUMMARY = "Translations for package budgie-screensaver"
DESCRIPTION = "Provides translations for the 'budgie-screensaver' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+0"

RPM_NAME = "budgie-screensaver-lang-5.1.0+0-4.3.noarch.rpm"
RPM_HASH = "038d8e8d2726890f1121109b3d9319c8f78e60197baa56cabec92db23ce8d943d19ac9f8f8e7a6e7f3ddd09ef04c2775d73a08a6afa2a7e2b057078aeb7ac69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-screensaver-lang \
budgie-screensaver-lang-all \
locale(budgie-screensaver:af) \
locale(budgie-screensaver:ar) \
locale(budgie-screensaver:as) \
locale(budgie-screensaver:ast) \
locale(budgie-screensaver:be) \
locale(budgie-screensaver:be@latin) \
locale(budgie-screensaver:bg) \
locale(budgie-screensaver:bn) \
locale(budgie-screensaver:bn_IN) \
locale(budgie-screensaver:br) \
locale(budgie-screensaver:bs) \
locale(budgie-screensaver:ca) \
locale(budgie-screensaver:ca@valencia) \
locale(budgie-screensaver:cs) \
locale(budgie-screensaver:cy) \
locale(budgie-screensaver:da) \
locale(budgie-screensaver:de) \
locale(budgie-screensaver:dz) \
locale(budgie-screensaver:el) \
locale(budgie-screensaver:en@shaw) \
locale(budgie-screensaver:en_CA) \
locale(budgie-screensaver:en_GB) \
locale(budgie-screensaver:eo) \
locale(budgie-screensaver:es) \
locale(budgie-screensaver:et) \
locale(budgie-screensaver:eu) \
locale(budgie-screensaver:fa) \
locale(budgie-screensaver:fi) \
locale(budgie-screensaver:fr) \
locale(budgie-screensaver:fur) \
locale(budgie-screensaver:ga) \
locale(budgie-screensaver:gd) \
locale(budgie-screensaver:gl) \
locale(budgie-screensaver:gu) \
locale(budgie-screensaver:he) \
locale(budgie-screensaver:hi) \
locale(budgie-screensaver:hr) \
locale(budgie-screensaver:hu) \
locale(budgie-screensaver:id) \
locale(budgie-screensaver:is) \
locale(budgie-screensaver:it) \
locale(budgie-screensaver:ja) \
locale(budgie-screensaver:ka) \
locale(budgie-screensaver:km) \
locale(budgie-screensaver:kn) \
locale(budgie-screensaver:ko) \
locale(budgie-screensaver:lt) \
locale(budgie-screensaver:lv) \
locale(budgie-screensaver:mai) \
locale(budgie-screensaver:mk) \
locale(budgie-screensaver:ml) \
locale(budgie-screensaver:mr) \
locale(budgie-screensaver:ms) \
locale(budgie-screensaver:nb) \
locale(budgie-screensaver:nds) \
locale(budgie-screensaver:ne) \
locale(budgie-screensaver:nl) \
locale(budgie-screensaver:nn) \
locale(budgie-screensaver:oc) \
locale(budgie-screensaver:or) \
locale(budgie-screensaver:pa) \
locale(budgie-screensaver:pl) \
locale(budgie-screensaver:pt) \
locale(budgie-screensaver:pt_BR) \
locale(budgie-screensaver:ro) \
locale(budgie-screensaver:ru) \
locale(budgie-screensaver:si) \
locale(budgie-screensaver:sk) \
locale(budgie-screensaver:sl) \
locale(budgie-screensaver:sq) \
locale(budgie-screensaver:sr) \
locale(budgie-screensaver:sr@latin) \
locale(budgie-screensaver:sv) \
locale(budgie-screensaver:ta) \
locale(budgie-screensaver:te) \
locale(budgie-screensaver:th) \
locale(budgie-screensaver:tr) \
locale(budgie-screensaver:ug) \
locale(budgie-screensaver:uk) \
locale(budgie-screensaver:vi) \
locale(budgie-screensaver:zh_CN) \
locale(budgie-screensaver:zh_HK) \
locale(budgie-screensaver:zh_TW)"
RDEPENDS:${PN} += "budgie-screensaver"

inherit rpm
