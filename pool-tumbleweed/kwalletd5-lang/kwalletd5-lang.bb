SUMMARY = "Translations for package kwalletd5"
DESCRIPTION = "Provides translations for the 'kwalletd5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwalletd5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "663ce23f3674f49b3667e8cf47d04121da7931306090c3e4bb7e970edff4a86dfb97b6cc5e074de8c68bf1542d6540a1a7bbd76744a98549c1ac3b726839f3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwalletd5-lang \
kwalletd5-lang-all \
locale(kwalletd5:ar) \
locale(kwalletd5:az) \
locale(kwalletd5:be) \
locale(kwalletd5:bg) \
locale(kwalletd5:bn) \
locale(kwalletd5:bn_IN) \
locale(kwalletd5:bs) \
locale(kwalletd5:ca) \
locale(kwalletd5:ca@valencia) \
locale(kwalletd5:cs) \
locale(kwalletd5:da) \
locale(kwalletd5:de) \
locale(kwalletd5:el) \
locale(kwalletd5:en_GB) \
locale(kwalletd5:eo) \
locale(kwalletd5:es) \
locale(kwalletd5:et) \
locale(kwalletd5:eu) \
locale(kwalletd5:fa) \
locale(kwalletd5:fi) \
locale(kwalletd5:fr) \
locale(kwalletd5:ga) \
locale(kwalletd5:gd) \
locale(kwalletd5:gl) \
locale(kwalletd5:gu) \
locale(kwalletd5:he) \
locale(kwalletd5:hi) \
locale(kwalletd5:hr) \
locale(kwalletd5:hu) \
locale(kwalletd5:ia) \
locale(kwalletd5:id) \
locale(kwalletd5:is) \
locale(kwalletd5:it) \
locale(kwalletd5:ja) \
locale(kwalletd5:ka) \
locale(kwalletd5:kk) \
locale(kwalletd5:km) \
locale(kwalletd5:kn) \
locale(kwalletd5:ko) \
locale(kwalletd5:lt) \
locale(kwalletd5:lv) \
locale(kwalletd5:mai) \
locale(kwalletd5:mk) \
locale(kwalletd5:ml) \
locale(kwalletd5:mr) \
locale(kwalletd5:ms) \
locale(kwalletd5:nb) \
locale(kwalletd5:nds) \
locale(kwalletd5:nl) \
locale(kwalletd5:nn) \
locale(kwalletd5:or) \
locale(kwalletd5:pa) \
locale(kwalletd5:pl) \
locale(kwalletd5:pt) \
locale(kwalletd5:pt_BR) \
locale(kwalletd5:ro) \
locale(kwalletd5:ru) \
locale(kwalletd5:si) \
locale(kwalletd5:sk) \
locale(kwalletd5:sl) \
locale(kwalletd5:sq) \
locale(kwalletd5:sr) \
locale(kwalletd5:sr@ijekavian) \
locale(kwalletd5:sr@ijekavianlatin) \
locale(kwalletd5:sr@latin) \
locale(kwalletd5:sv) \
locale(kwalletd5:te) \
locale(kwalletd5:th) \
locale(kwalletd5:tr) \
locale(kwalletd5:ug) \
locale(kwalletd5:uk) \
locale(kwalletd5:vi) \
locale(kwalletd5:wa) \
locale(kwalletd5:zh_CN) \
locale(kwalletd5:zh_TW)"

RDEPENDS:${PN} += "kwalletd5"

inherit rpm
