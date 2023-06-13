SUMMARY = "Translations for package kolf"
DESCRIPTION = "Provides translations for the 'kolf' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kolf-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "253b84fb09c9f08bd8fc1a4af054db99c03e08d37a3642160a3496e9e77f7c7e130e924b3c799da1f734fc538a72fc227526f36a80e2ac747a2b0fd483076686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kolf-lang \
kolf-lang-all \
locale(kolf:af) \
locale(kolf:ar) \
locale(kolf:be) \
locale(kolf:bg) \
locale(kolf:br) \
locale(kolf:bs) \
locale(kolf:ca) \
locale(kolf:ca@valencia) \
locale(kolf:cs) \
locale(kolf:cy) \
locale(kolf:da) \
locale(kolf:de) \
locale(kolf:el) \
locale(kolf:en_GB) \
locale(kolf:eo) \
locale(kolf:es) \
locale(kolf:et) \
locale(kolf:eu) \
locale(kolf:fa) \
locale(kolf:fi) \
locale(kolf:fr) \
locale(kolf:ga) \
locale(kolf:gl) \
locale(kolf:he) \
locale(kolf:hi) \
locale(kolf:hr) \
locale(kolf:hu) \
locale(kolf:is) \
locale(kolf:it) \
locale(kolf:ja) \
locale(kolf:ka) \
locale(kolf:kk) \
locale(kolf:km) \
locale(kolf:ko) \
locale(kolf:lt) \
locale(kolf:lv) \
locale(kolf:mai) \
locale(kolf:mk) \
locale(kolf:ml) \
locale(kolf:mr) \
locale(kolf:ms) \
locale(kolf:nb) \
locale(kolf:nds) \
locale(kolf:ne) \
locale(kolf:nl) \
locale(kolf:nn) \
locale(kolf:oc) \
locale(kolf:pa) \
locale(kolf:pl) \
locale(kolf:pt) \
locale(kolf:pt_BR) \
locale(kolf:ro) \
locale(kolf:ru) \
locale(kolf:sk) \
locale(kolf:sl) \
locale(kolf:sq) \
locale(kolf:sr) \
locale(kolf:sr@ijekavian) \
locale(kolf:sr@ijekavianlatin) \
locale(kolf:sr@latin) \
locale(kolf:sv) \
locale(kolf:ta) \
locale(kolf:tr) \
locale(kolf:ug) \
locale(kolf:uk) \
locale(kolf:zh_CN) \
locale(kolf:zh_TW)"

RDEPENDS:${PN} += "kolf"

inherit rpm
