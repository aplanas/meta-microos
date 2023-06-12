SUMMARY = "Translations for package cheese"
DESCRIPTION = "Provides translations for the 'cheese' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "cheese-lang-44.0.1-1.1.noarch.rpm"
RPM_HASH = "6d8de199201354f5514f70789fc7b6dd9a013304df8da6d9178059a9e2d691dab840a353907474a8c17ad7984b7542d1bf66af9218458049daf027c9f3faac88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cheese-lang \
cheese-lang-all \
locale(cheese:af) \
locale(cheese:ar) \
locale(cheese:as) \
locale(cheese:ast) \
locale(cheese:be) \
locale(cheese:be@latin) \
locale(cheese:bg) \
locale(cheese:bn) \
locale(cheese:bn_IN) \
locale(cheese:bs) \
locale(cheese:ca) \
locale(cheese:ca@valencia) \
locale(cheese:cs) \
locale(cheese:da) \
locale(cheese:de) \
locale(cheese:dz) \
locale(cheese:el) \
locale(cheese:en@shaw) \
locale(cheese:en_GB) \
locale(cheese:eo) \
locale(cheese:es) \
locale(cheese:et) \
locale(cheese:eu) \
locale(cheese:fa) \
locale(cheese:fi) \
locale(cheese:fr) \
locale(cheese:fur) \
locale(cheese:ga) \
locale(cheese:gl) \
locale(cheese:gu) \
locale(cheese:he) \
locale(cheese:hi) \
locale(cheese:hr) \
locale(cheese:hu) \
locale(cheese:id) \
locale(cheese:is) \
locale(cheese:it) \
locale(cheese:ja) \
locale(cheese:ka) \
locale(cheese:kk) \
locale(cheese:km) \
locale(cheese:kn) \
locale(cheese:ko) \
locale(cheese:lt) \
locale(cheese:lv) \
locale(cheese:mai) \
locale(cheese:mk) \
locale(cheese:ml) \
locale(cheese:mr) \
locale(cheese:ms) \
locale(cheese:nb) \
locale(cheese:nds) \
locale(cheese:ne) \
locale(cheese:nl) \
locale(cheese:nn) \
locale(cheese:oc) \
locale(cheese:or) \
locale(cheese:pa) \
locale(cheese:pl) \
locale(cheese:pt) \
locale(cheese:pt_BR) \
locale(cheese:ro) \
locale(cheese:ru) \
locale(cheese:sk) \
locale(cheese:sl) \
locale(cheese:sq) \
locale(cheese:sr) \
locale(cheese:sr@latin) \
locale(cheese:sv) \
locale(cheese:ta) \
locale(cheese:te) \
locale(cheese:th) \
locale(cheese:tr) \
locale(cheese:ug) \
locale(cheese:uk) \
locale(cheese:vi) \
locale(cheese:zh_CN) \
locale(cheese:zh_HK) \
locale(cheese:zh_TW)"
RDEPENDS:${PN} += "cheese"

inherit rpm
