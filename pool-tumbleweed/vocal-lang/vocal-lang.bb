SUMMARY = "Translations for package vocal"
DESCRIPTION = "Provides translations for the 'vocal' package."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "vocal-lang-2.4.2-5.4.noarch.rpm"
RPM_HASH = "4386466522923b0a8f7847f4760ad43eeaf868f7027a8029813ee757b8a719a4e724f70b8cd282a1c868a666be4b751b012d4f0dcf317f5c2b40e2ad6236efca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(vocal:af) \
locale(vocal:ar) \
locale(vocal:as) \
locale(vocal:ast) \
locale(vocal:az) \
locale(vocal:be) \
locale(vocal:bg) \
locale(vocal:bn) \
locale(vocal:br) \
locale(vocal:bs) \
locale(vocal:ca) \
locale(vocal:cs) \
locale(vocal:cy) \
locale(vocal:da) \
locale(vocal:de) \
locale(vocal:de_DE) \
locale(vocal:dz) \
locale(vocal:el) \
locale(vocal:el_GR) \
locale(vocal:en) \
locale(vocal:en_AU) \
locale(vocal:en_CA) \
locale(vocal:en_GB) \
locale(vocal:eo) \
locale(vocal:es) \
locale(vocal:es_SV) \
locale(vocal:et) \
locale(vocal:eu) \
locale(vocal:fa) \
locale(vocal:fi) \
locale(vocal:fr) \
locale(vocal:fr_CA) \
locale(vocal:fr_FR) \
locale(vocal:ga) \
locale(vocal:gd) \
locale(vocal:gl) \
locale(vocal:gu) \
locale(vocal:he) \
locale(vocal:hi) \
locale(vocal:hr) \
locale(vocal:hu) \
locale(vocal:ia) \
locale(vocal:id) \
locale(vocal:is) \
locale(vocal:it) \
locale(vocal:ja) \
locale(vocal:ka) \
locale(vocal:kk) \
locale(vocal:km) \
locale(vocal:kn) \
locale(vocal:ko) \
locale(vocal:lt) \
locale(vocal:lv) \
locale(vocal:mk) \
locale(vocal:ml) \
locale(vocal:mr) \
locale(vocal:ms) \
locale(vocal:nb) \
locale(vocal:ne) \
locale(vocal:nl) \
locale(vocal:nn) \
locale(vocal:oc) \
locale(vocal:or) \
locale(vocal:pa) \
locale(vocal:pl) \
locale(vocal:pt) \
locale(vocal:pt_BR) \
locale(vocal:ro) \
locale(vocal:ru) \
locale(vocal:ru_RU) \
locale(vocal:si) \
locale(vocal:sk) \
locale(vocal:sl) \
locale(vocal:sq) \
locale(vocal:sr) \
locale(vocal:sv) \
locale(vocal:ta) \
locale(vocal:te) \
locale(vocal:th) \
locale(vocal:tr) \
locale(vocal:ug) \
locale(vocal:uk) \
locale(vocal:vi) \
locale(vocal:wa) \
locale(vocal:zh) \
locale(vocal:zh_CN) \
locale(vocal:zh_HK) \
locale(vocal:zh_TW) \
vocal-lang \
vocal-lang-all"
RDEPENDS:${PN} += "vocal"

inherit rpm
