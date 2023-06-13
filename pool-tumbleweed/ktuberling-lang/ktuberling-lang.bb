SUMMARY = "Translations for package ktuberling"
DESCRIPTION = "Provides translations for the 'ktuberling' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktuberling-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "9bb55155413cfe67188b88b2c84414b5c741fd21f2b70e68cc6708cce5bdfa11e5c1bba12e0d4fa70212cb80800bd993fbd1bb26b24b1c31e38bc2244d71bf9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktuberling-lang \
ktuberling-lang-all \
locale(ktuberling:af) \
locale(ktuberling:ar) \
locale(ktuberling:be) \
locale(ktuberling:bg) \
locale(ktuberling:br) \
locale(ktuberling:bs) \
locale(ktuberling:ca) \
locale(ktuberling:ca@valencia) \
locale(ktuberling:cs) \
locale(ktuberling:cy) \
locale(ktuberling:da) \
locale(ktuberling:de) \
locale(ktuberling:el) \
locale(ktuberling:en_GB) \
locale(ktuberling:eo) \
locale(ktuberling:es) \
locale(ktuberling:et) \
locale(ktuberling:eu) \
locale(ktuberling:fa) \
locale(ktuberling:fi) \
locale(ktuberling:fr) \
locale(ktuberling:ga) \
locale(ktuberling:gl) \
locale(ktuberling:he) \
locale(ktuberling:hi) \
locale(ktuberling:hr) \
locale(ktuberling:hu) \
locale(ktuberling:id) \
locale(ktuberling:is) \
locale(ktuberling:it) \
locale(ktuberling:ja) \
locale(ktuberling:ka) \
locale(ktuberling:kk) \
locale(ktuberling:km) \
locale(ktuberling:ko) \
locale(ktuberling:lt) \
locale(ktuberling:lv) \
locale(ktuberling:mai) \
locale(ktuberling:mk) \
locale(ktuberling:ml) \
locale(ktuberling:mr) \
locale(ktuberling:nb) \
locale(ktuberling:nds) \
locale(ktuberling:ne) \
locale(ktuberling:nl) \
locale(ktuberling:nn) \
locale(ktuberling:oc) \
locale(ktuberling:pa) \
locale(ktuberling:pl) \
locale(ktuberling:pt) \
locale(ktuberling:pt_BR) \
locale(ktuberling:ro) \
locale(ktuberling:ru) \
locale(ktuberling:sk) \
locale(ktuberling:sl) \
locale(ktuberling:sq) \
locale(ktuberling:sr) \
locale(ktuberling:sr@ijekavian) \
locale(ktuberling:sr@ijekavianlatin) \
locale(ktuberling:sr@latin) \
locale(ktuberling:sv) \
locale(ktuberling:ta) \
locale(ktuberling:tr) \
locale(ktuberling:ug) \
locale(ktuberling:uk) \
locale(ktuberling:wa) \
locale(ktuberling:zh_CN) \
locale(ktuberling:zh_TW)"

RDEPENDS:${PN} += "ktuberling"

inherit rpm
