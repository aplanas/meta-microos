SUMMARY = "Translations for package gdl"
DESCRIPTION = "Provides translations for the 'gdl' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "gdl-lang-3.40.0-2.9.noarch.rpm"
RPM_HASH = "b61b3874865c4ce5d5b01dc4e581be4505cf874057c4c95b107349a30ebe3da4e7bb42b7b7983fb500b1e79cc80f04ad8367f6e54e92e91cf5e5e3d89aaa0a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdl-lang \
gdl-lang-all \
locale(gdl:ar) \
locale(gdl:as) \
locale(gdl:ast) \
locale(gdl:az) \
locale(gdl:be) \
locale(gdl:bg) \
locale(gdl:bn) \
locale(gdl:bs) \
locale(gdl:ca) \
locale(gdl:ca@valencia) \
locale(gdl:cs) \
locale(gdl:da) \
locale(gdl:de) \
locale(gdl:dz) \
locale(gdl:el) \
locale(gdl:en@shaw) \
locale(gdl:en_CA) \
locale(gdl:en_GB) \
locale(gdl:eo) \
locale(gdl:es) \
locale(gdl:et) \
locale(gdl:eu) \
locale(gdl:fi) \
locale(gdl:fr) \
locale(gdl:fur) \
locale(gdl:ga) \
locale(gdl:gl) \
locale(gdl:gu) \
locale(gdl:he) \
locale(gdl:hi) \
locale(gdl:hr) \
locale(gdl:hu) \
locale(gdl:id) \
locale(gdl:it) \
locale(gdl:ja) \
locale(gdl:km) \
locale(gdl:ko) \
locale(gdl:lt) \
locale(gdl:lv) \
locale(gdl:mai) \
locale(gdl:mk) \
locale(gdl:ml) \
locale(gdl:mr) \
locale(gdl:nb) \
locale(gdl:ne) \
locale(gdl:nl) \
locale(gdl:oc) \
locale(gdl:or) \
locale(gdl:pa) \
locale(gdl:pl) \
locale(gdl:pt) \
locale(gdl:pt_BR) \
locale(gdl:ro) \
locale(gdl:ru) \
locale(gdl:si) \
locale(gdl:sk) \
locale(gdl:sl) \
locale(gdl:sq) \
locale(gdl:sr) \
locale(gdl:sr@latin) \
locale(gdl:sv) \
locale(gdl:te) \
locale(gdl:th) \
locale(gdl:tr) \
locale(gdl:ug) \
locale(gdl:uk) \
locale(gdl:vi) \
locale(gdl:zh_CN) \
locale(gdl:zh_HK) \
locale(gdl:zh_TW)"

RDEPENDS:${PN} += "gdl"

inherit rpm
