SUMMARY = "Translations for package kshisen"
DESCRIPTION = "Provides translations for the 'kshisen' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kshisen-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "aa094c736b3872a503b91922a3f2492b5ed2564f65ff33ac0e9beb59306a7f07bc4b2c229a42b470a3d08ddafb186f127afb2142d86e471435e3d952f54bff79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kshisen-lang \
kshisen-lang-all \
locale(kshisen:af) \
locale(kshisen:ar) \
locale(kshisen:be) \
locale(kshisen:bg) \
locale(kshisen:bn) \
locale(kshisen:br) \
locale(kshisen:bs) \
locale(kshisen:ca) \
locale(kshisen:ca@valencia) \
locale(kshisen:cs) \
locale(kshisen:cy) \
locale(kshisen:da) \
locale(kshisen:de) \
locale(kshisen:el) \
locale(kshisen:en_GB) \
locale(kshisen:eo) \
locale(kshisen:es) \
locale(kshisen:et) \
locale(kshisen:eu) \
locale(kshisen:fa) \
locale(kshisen:fi) \
locale(kshisen:fr) \
locale(kshisen:ga) \
locale(kshisen:gl) \
locale(kshisen:he) \
locale(kshisen:hi) \
locale(kshisen:hr) \
locale(kshisen:hu) \
locale(kshisen:id) \
locale(kshisen:is) \
locale(kshisen:it) \
locale(kshisen:ja) \
locale(kshisen:ka) \
locale(kshisen:kk) \
locale(kshisen:km) \
locale(kshisen:ko) \
locale(kshisen:lt) \
locale(kshisen:lv) \
locale(kshisen:mai) \
locale(kshisen:mk) \
locale(kshisen:ml) \
locale(kshisen:mr) \
locale(kshisen:nb) \
locale(kshisen:nds) \
locale(kshisen:ne) \
locale(kshisen:nl) \
locale(kshisen:nn) \
locale(kshisen:oc) \
locale(kshisen:pa) \
locale(kshisen:pl) \
locale(kshisen:pt) \
locale(kshisen:pt_BR) \
locale(kshisen:ro) \
locale(kshisen:ru) \
locale(kshisen:sk) \
locale(kshisen:sl) \
locale(kshisen:sq) \
locale(kshisen:sr) \
locale(kshisen:sr@ijekavian) \
locale(kshisen:sr@ijekavianlatin) \
locale(kshisen:sr@latin) \
locale(kshisen:sv) \
locale(kshisen:ta) \
locale(kshisen:th) \
locale(kshisen:tr) \
locale(kshisen:ug) \
locale(kshisen:uk) \
locale(kshisen:zh_CN) \
locale(kshisen:zh_TW)"

RDEPENDS:${PN} += "kshisen"

inherit rpm
