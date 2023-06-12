SUMMARY = "Translations for package light-locker"
DESCRIPTION = "Provides translations for the 'light-locker' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "light-locker-lang-1.9.0-1.15.noarch.rpm"
RPM_HASH = "45551beaaa991a0b331bb127d5651f6edaa5f5b0fdedba4d2f1e850ad63fd94e05ffb9a9dba17ee42d543f37f8c827e750860e870f4a05b77c28bd28c4f2b3a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "light-locker-lang \
light-locker-lang-all \
locale(light-locker:af) \
locale(light-locker:ar) \
locale(light-locker:as) \
locale(light-locker:ast) \
locale(light-locker:be) \
locale(light-locker:be@latin) \
locale(light-locker:bg) \
locale(light-locker:bn) \
locale(light-locker:bn_IN) \
locale(light-locker:br) \
locale(light-locker:ca) \
locale(light-locker:ca@valencia) \
locale(light-locker:cs) \
locale(light-locker:cy) \
locale(light-locker:da) \
locale(light-locker:de) \
locale(light-locker:dz) \
locale(light-locker:el) \
locale(light-locker:en@shaw) \
locale(light-locker:en_CA) \
locale(light-locker:en_GB) \
locale(light-locker:eo) \
locale(light-locker:es) \
locale(light-locker:et) \
locale(light-locker:eu) \
locale(light-locker:fa) \
locale(light-locker:fi) \
locale(light-locker:fr) \
locale(light-locker:fr_FR) \
locale(light-locker:fur) \
locale(light-locker:ga) \
locale(light-locker:gl) \
locale(light-locker:gu) \
locale(light-locker:he) \
locale(light-locker:hi) \
locale(light-locker:hr) \
locale(light-locker:hu) \
locale(light-locker:id) \
locale(light-locker:is) \
locale(light-locker:it) \
locale(light-locker:ja) \
locale(light-locker:ka) \
locale(light-locker:kk) \
locale(light-locker:km) \
locale(light-locker:kn) \
locale(light-locker:ko) \
locale(light-locker:lt) \
locale(light-locker:lv) \
locale(light-locker:mai) \
locale(light-locker:mk) \
locale(light-locker:ml) \
locale(light-locker:mr) \
locale(light-locker:ms) \
locale(light-locker:nb) \
locale(light-locker:nds) \
locale(light-locker:ne) \
locale(light-locker:nl) \
locale(light-locker:nn) \
locale(light-locker:oc) \
locale(light-locker:or) \
locale(light-locker:pa) \
locale(light-locker:pl) \
locale(light-locker:pt) \
locale(light-locker:pt_BR) \
locale(light-locker:ro) \
locale(light-locker:ru) \
locale(light-locker:si) \
locale(light-locker:sk) \
locale(light-locker:sl) \
locale(light-locker:sq) \
locale(light-locker:sr) \
locale(light-locker:sr@latin) \
locale(light-locker:sv) \
locale(light-locker:ta) \
locale(light-locker:te) \
locale(light-locker:th) \
locale(light-locker:tr) \
locale(light-locker:ug) \
locale(light-locker:uk) \
locale(light-locker:vi) \
locale(light-locker:zh_CN) \
locale(light-locker:zh_HK) \
locale(light-locker:zh_TW)"
RDEPENDS:${PN} += "light-locker"

inherit rpm
