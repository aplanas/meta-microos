SUMMARY = "Translations for package eog"
DESCRIPTION = "Provides translations for the 'eog' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "eog-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "12fd004cea1841ca57b0c8f004953846495632a21bb622e62e97e80560230e42aab5488e5b452c6b63353452068a81a685e772f0a42fbbc4536996360845526d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-lang eog-lang-all locale(eog:af) locale(eog:ar) locale(eog:as) locale(eog:ast) locale(eog:az) locale(eog:be) locale(eog:be@latin) locale(eog:bg) locale(eog:bn) locale(eog:bn_IN) locale(eog:br) locale(eog:bs) locale(eog:ca) locale(eog:ca@valencia) locale(eog:cs) locale(eog:cy) locale(eog:da) locale(eog:de) locale(eog:dz) locale(eog:el) locale(eog:en@shaw) locale(eog:en_CA) locale(eog:en_GB) locale(eog:eo) locale(eog:es) locale(eog:et) locale(eog:eu) locale(eog:fa) locale(eog:fi) locale(eog:fr) locale(eog:fur) locale(eog:ga) locale(eog:gd) locale(eog:gl) locale(eog:gu) locale(eog:he) locale(eog:hi) locale(eog:hr) locale(eog:hu) locale(eog:id) locale(eog:is) locale(eog:it) locale(eog:ja) locale(eog:ka) locale(eog:kk) locale(eog:km) locale(eog:kn) locale(eog:ko) locale(eog:lt) locale(eog:lv) locale(eog:mai) locale(eog:mk) locale(eog:ml) locale(eog:mr) locale(eog:ms) locale(eog:nb) locale(eog:nds) locale(eog:ne) locale(eog:nl) locale(eog:nn) locale(eog:oc) locale(eog:or) locale(eog:pa) locale(eog:pl) locale(eog:pt) locale(eog:pt_BR) locale(eog:ro) locale(eog:ru) locale(eog:si) locale(eog:sk) locale(eog:sl) locale(eog:sq) locale(eog:sr) locale(eog:sr@latin) locale(eog:sv) locale(eog:ta) locale(eog:te) locale(eog:th) locale(eog:tr) locale(eog:ug) locale(eog:uk) locale(eog:vi) locale(eog:wa) locale(eog:zh_CN) locale(eog:zh_HK) locale(eog:zh_TW)"
RDEPENDS:${PN} += "eog"

inherit rpm
