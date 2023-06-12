SUMMARY = "Translations for package muffin"
DESCRIPTION = "Provides translations for the 'muffin' package."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.1"

RPM_NAME = "muffin-lang-5.2.1-1.1.noarch.rpm"
RPM_HASH = "4ca49f64f77ce31663f72b8c63e900b4145caf7129915c23e0084349699924bde5758345b7aacaf9482f43e2b14135be8e13a5cbaa18e05261de70cb44d5f572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(muffin:ar) \
locale(muffin:as) \
locale(muffin:ast) \
locale(muffin:az) \
locale(muffin:be) \
locale(muffin:be@latin) \
locale(muffin:bg) \
locale(muffin:bn) \
locale(muffin:bn_IN) \
locale(muffin:br) \
locale(muffin:bs) \
locale(muffin:ca) \
locale(muffin:ca@valencia) \
locale(muffin:cs) \
locale(muffin:cy) \
locale(muffin:da) \
locale(muffin:de) \
locale(muffin:dz) \
locale(muffin:el) \
locale(muffin:en_CA) \
locale(muffin:en_GB) \
locale(muffin:eo) \
locale(muffin:es) \
locale(muffin:et) \
locale(muffin:eu) \
locale(muffin:fa) \
locale(muffin:fi) \
locale(muffin:fr) \
locale(muffin:ga) \
locale(muffin:gl) \
locale(muffin:gu) \
locale(muffin:he) \
locale(muffin:hi) \
locale(muffin:hr) \
locale(muffin:hu) \
locale(muffin:id) \
locale(muffin:is) \
locale(muffin:it) \
locale(muffin:ja) \
locale(muffin:ka) \
locale(muffin:kn) \
locale(muffin:ko) \
locale(muffin:lt) \
locale(muffin:lv) \
locale(muffin:mai) \
locale(muffin:mk) \
locale(muffin:ml) \
locale(muffin:mr) \
locale(muffin:ms) \
locale(muffin:nb) \
locale(muffin:nds) \
locale(muffin:ne) \
locale(muffin:nl) \
locale(muffin:nn) \
locale(muffin:oc) \
locale(muffin:or) \
locale(muffin:pa) \
locale(muffin:pl) \
locale(muffin:pt) \
locale(muffin:pt_BR) \
locale(muffin:ro) \
locale(muffin:ru) \
locale(muffin:si) \
locale(muffin:sk) \
locale(muffin:sl) \
locale(muffin:sq) \
locale(muffin:sr) \
locale(muffin:sr@latin) \
locale(muffin:sv) \
locale(muffin:ta) \
locale(muffin:te) \
locale(muffin:th) \
locale(muffin:tr) \
locale(muffin:ug) \
locale(muffin:uk) \
locale(muffin:vi) \
locale(muffin:wa) \
locale(muffin:zh_CN) \
locale(muffin:zh_HK) \
locale(muffin:zh_TW) \
muffin-lang \
muffin-lang-all"
RDEPENDS:${PN} += "muffin"

inherit rpm
