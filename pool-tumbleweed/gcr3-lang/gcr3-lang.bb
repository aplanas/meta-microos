SUMMARY = "Translations for package gcr3"
DESCRIPTION = "Provides translations for the 'gcr3' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-lang-3.41.0-3.3.noarch.rpm"
RPM_HASH = "6ead77f59761b2a8582619f1428741a889b0ae463e551868b8e87fd3d204e1b0afe7490b21d00f549f34c8c6a559a507718b2d67558c255ead3f16c02f595584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr3-lang \
gcr3-lang-all \
locale(gcr3:af) \
locale(gcr3:ar) \
locale(gcr3:as) \
locale(gcr3:ast) \
locale(gcr3:az) \
locale(gcr3:be) \
locale(gcr3:be@latin) \
locale(gcr3:bg) \
locale(gcr3:bn) \
locale(gcr3:bn_IN) \
locale(gcr3:bs) \
locale(gcr3:ca) \
locale(gcr3:ca@valencia) \
locale(gcr3:cs) \
locale(gcr3:cy) \
locale(gcr3:da) \
locale(gcr3:de) \
locale(gcr3:dz) \
locale(gcr3:el) \
locale(gcr3:en@shaw) \
locale(gcr3:en_CA) \
locale(gcr3:en_GB) \
locale(gcr3:eo) \
locale(gcr3:es) \
locale(gcr3:et) \
locale(gcr3:eu) \
locale(gcr3:fa) \
locale(gcr3:fi) \
locale(gcr3:fr) \
locale(gcr3:fur) \
locale(gcr3:ga) \
locale(gcr3:gl) \
locale(gcr3:gu) \
locale(gcr3:he) \
locale(gcr3:hi) \
locale(gcr3:hr) \
locale(gcr3:hu) \
locale(gcr3:id) \
locale(gcr3:it) \
locale(gcr3:ja) \
locale(gcr3:ka) \
locale(gcr3:kk) \
locale(gcr3:kn) \
locale(gcr3:ko) \
locale(gcr3:lt) \
locale(gcr3:lv) \
locale(gcr3:mai) \
locale(gcr3:mk) \
locale(gcr3:ml) \
locale(gcr3:mr) \
locale(gcr3:ms) \
locale(gcr3:nb) \
locale(gcr3:ne) \
locale(gcr3:nl) \
locale(gcr3:nn) \
locale(gcr3:oc) \
locale(gcr3:or) \
locale(gcr3:pa) \
locale(gcr3:pl) \
locale(gcr3:pt) \
locale(gcr3:pt_BR) \
locale(gcr3:ro) \
locale(gcr3:ru) \
locale(gcr3:si) \
locale(gcr3:sk) \
locale(gcr3:sl) \
locale(gcr3:sq) \
locale(gcr3:sr) \
locale(gcr3:sr@latin) \
locale(gcr3:sv) \
locale(gcr3:ta) \
locale(gcr3:te) \
locale(gcr3:th) \
locale(gcr3:tr) \
locale(gcr3:ug) \
locale(gcr3:uk) \
locale(gcr3:vi) \
locale(gcr3:zh_CN) \
locale(gcr3:zh_HK) \
locale(gcr3:zh_TW)"
RDEPENDS:${PN} += "gcr3"

inherit rpm
