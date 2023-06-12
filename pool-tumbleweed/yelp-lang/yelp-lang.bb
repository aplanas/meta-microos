SUMMARY = "Translations for package yelp"
DESCRIPTION = "Provides translations for the 'yelp' package."
LICENSE = "GPL-2.0-or-later"

PV = "42.2"

RPM_NAME = "yelp-lang-42.2-1.3.noarch.rpm"
RPM_HASH = "e6c90f31f3bca7a7c0d813189f3f02c112f42e854d4afbca47517765fcd323e28b0e464b092d96fb5398f48e9f4d9d238ce3373ad1d23a7fd1a31f0f3228ccda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yelp:af) \
locale(yelp:ar) \
locale(yelp:as) \
locale(yelp:ast) \
locale(yelp:az) \
locale(yelp:be) \
locale(yelp:be@latin) \
locale(yelp:bg) \
locale(yelp:bn) \
locale(yelp:bn_IN) \
locale(yelp:br) \
locale(yelp:bs) \
locale(yelp:ca) \
locale(yelp:ca@valencia) \
locale(yelp:cs) \
locale(yelp:cy) \
locale(yelp:da) \
locale(yelp:de) \
locale(yelp:dz) \
locale(yelp:el) \
locale(yelp:en_CA) \
locale(yelp:en_GB) \
locale(yelp:eo) \
locale(yelp:es) \
locale(yelp:et) \
locale(yelp:eu) \
locale(yelp:fa) \
locale(yelp:fi) \
locale(yelp:fr) \
locale(yelp:fur) \
locale(yelp:ga) \
locale(yelp:gd) \
locale(yelp:gl) \
locale(yelp:gu) \
locale(yelp:he) \
locale(yelp:hi) \
locale(yelp:hr) \
locale(yelp:hu) \
locale(yelp:id) \
locale(yelp:is) \
locale(yelp:it) \
locale(yelp:ja) \
locale(yelp:ka) \
locale(yelp:kk) \
locale(yelp:km) \
locale(yelp:kn) \
locale(yelp:ko) \
locale(yelp:lt) \
locale(yelp:lv) \
locale(yelp:mai) \
locale(yelp:mk) \
locale(yelp:ml) \
locale(yelp:mr) \
locale(yelp:ms) \
locale(yelp:nb) \
locale(yelp:nds) \
locale(yelp:ne) \
locale(yelp:nl) \
locale(yelp:nn) \
locale(yelp:oc) \
locale(yelp:or) \
locale(yelp:pa) \
locale(yelp:pl) \
locale(yelp:pt) \
locale(yelp:pt_BR) \
locale(yelp:ro) \
locale(yelp:ru) \
locale(yelp:si) \
locale(yelp:sk) \
locale(yelp:sl) \
locale(yelp:sq) \
locale(yelp:sr) \
locale(yelp:sr@latin) \
locale(yelp:sv) \
locale(yelp:ta) \
locale(yelp:te) \
locale(yelp:th) \
locale(yelp:tr) \
locale(yelp:ug) \
locale(yelp:uk) \
locale(yelp:vi) \
locale(yelp:wa) \
locale(yelp:zh_CN) \
locale(yelp:zh_HK) \
locale(yelp:zh_TW) \
yelp-lang \
yelp-lang-all"
RDEPENDS:${PN} += "yelp"

inherit rpm
