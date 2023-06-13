SUMMARY = "Translations for package nautilus"
DESCRIPTION = "Provides translations for the 'nautilus' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "nautilus-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "7ff6bf33af25d7a780f863f90ac4bdd679e9b4e62f9840f09892fe6b063b493d60e9ef277feab25cc7739ca56951fdfcf124a5621856d5dd0433ffb18118783d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nautilus:af) \
locale(nautilus:ar) \
locale(nautilus:as) \
locale(nautilus:ast) \
locale(nautilus:az) \
locale(nautilus:be) \
locale(nautilus:be@latin) \
locale(nautilus:bg) \
locale(nautilus:bn) \
locale(nautilus:bn_IN) \
locale(nautilus:br) \
locale(nautilus:bs) \
locale(nautilus:ca) \
locale(nautilus:ca@valencia) \
locale(nautilus:cs) \
locale(nautilus:cy) \
locale(nautilus:da) \
locale(nautilus:de) \
locale(nautilus:dz) \
locale(nautilus:el) \
locale(nautilus:en@shaw) \
locale(nautilus:en_CA) \
locale(nautilus:en_GB) \
locale(nautilus:eo) \
locale(nautilus:es) \
locale(nautilus:et) \
locale(nautilus:eu) \
locale(nautilus:fa) \
locale(nautilus:fi) \
locale(nautilus:fr) \
locale(nautilus:fur) \
locale(nautilus:ga) \
locale(nautilus:gd) \
locale(nautilus:gl) \
locale(nautilus:gu) \
locale(nautilus:he) \
locale(nautilus:hi) \
locale(nautilus:hr) \
locale(nautilus:hu) \
locale(nautilus:id) \
locale(nautilus:is) \
locale(nautilus:it) \
locale(nautilus:ja) \
locale(nautilus:ka) \
locale(nautilus:kk) \
locale(nautilus:km) \
locale(nautilus:kn) \
locale(nautilus:ko) \
locale(nautilus:lt) \
locale(nautilus:lv) \
locale(nautilus:mai) \
locale(nautilus:mk) \
locale(nautilus:ml) \
locale(nautilus:mr) \
locale(nautilus:ms) \
locale(nautilus:nb) \
locale(nautilus:nds) \
locale(nautilus:ne) \
locale(nautilus:nl) \
locale(nautilus:nn) \
locale(nautilus:oc) \
locale(nautilus:or) \
locale(nautilus:pa) \
locale(nautilus:pl) \
locale(nautilus:pt) \
locale(nautilus:pt_BR) \
locale(nautilus:ro) \
locale(nautilus:ru) \
locale(nautilus:si) \
locale(nautilus:sk) \
locale(nautilus:sl) \
locale(nautilus:sq) \
locale(nautilus:sr) \
locale(nautilus:sr@ije) \
locale(nautilus:sr@latin) \
locale(nautilus:sv) \
locale(nautilus:ta) \
locale(nautilus:te) \
locale(nautilus:th) \
locale(nautilus:tr) \
locale(nautilus:ug) \
locale(nautilus:uk) \
locale(nautilus:vi) \
locale(nautilus:wa) \
locale(nautilus:zh_CN) \
locale(nautilus:zh_HK) \
locale(nautilus:zh_TW) \
nautilus-lang \
nautilus-lang-all"

RDEPENDS:${PN} += "nautilus"

inherit rpm
