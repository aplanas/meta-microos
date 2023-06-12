SUMMARY = "Translations for package eog"
DESCRIPTION = "Provides translations for the 'eog' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "eog-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "7a6e01395149c0084fa9fbaa7d78023c0661f73a1495e41b5dfb0389e8b26b9b7d155a2ec31bc7da341f6f836bc4c0dead391299f78d8c3a1e4b29e836a56c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-lang eog-lang-all locale(eog:af) locale(eog:ar) locale(eog:as) locale(eog:ast) locale(eog:az) locale(eog:be) locale(eog:be@latin) locale(eog:bg) locale(eog:bn) locale(eog:bn_IN) locale(eog:br) locale(eog:bs) locale(eog:ca) locale(eog:ca@valencia) locale(eog:cs) locale(eog:cy) locale(eog:da) locale(eog:de) locale(eog:dz) locale(eog:el) locale(eog:en@shaw) locale(eog:en_CA) locale(eog:en_GB) locale(eog:eo) locale(eog:es) locale(eog:et) locale(eog:eu) locale(eog:fa) locale(eog:fi) locale(eog:fr) locale(eog:fur) locale(eog:ga) locale(eog:gd) locale(eog:gl) locale(eog:gu) locale(eog:he) locale(eog:hi) locale(eog:hr) locale(eog:hu) locale(eog:id) locale(eog:is) locale(eog:it) locale(eog:ja) locale(eog:ka) locale(eog:kk) locale(eog:km) locale(eog:kn) locale(eog:ko) locale(eog:lt) locale(eog:lv) locale(eog:mai) locale(eog:mk) locale(eog:ml) locale(eog:mr) locale(eog:ms) locale(eog:nb) locale(eog:nds) locale(eog:ne) locale(eog:nl) locale(eog:nn) locale(eog:oc) locale(eog:or) locale(eog:pa) locale(eog:pl) locale(eog:pt) locale(eog:pt_BR) locale(eog:ro) locale(eog:ru) locale(eog:si) locale(eog:sk) locale(eog:sl) locale(eog:sq) locale(eog:sr) locale(eog:sr@latin) locale(eog:sv) locale(eog:ta) locale(eog:te) locale(eog:th) locale(eog:tr) locale(eog:ug) locale(eog:uk) locale(eog:vi) locale(eog:wa) locale(eog:zh_CN) locale(eog:zh_HK) locale(eog:zh_TW)"
RDEPENDS:${PN} += "eog"

inherit rpm
