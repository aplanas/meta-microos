SUMMARY = "Translations for package melody"
DESCRIPTION = "Provides translations for the 'melody' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "melody-lang-2.2.1-1.18.noarch.rpm"
RPM_HASH = "d864e7b93a6b4342b3564e4d0dca67a4b2e7a3f0003d8bdf1178ca38f64edf29e99a3a344a5765b78bb20fab8a90ffa26526b734a3de947084aa7a235bc71b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(melody:af) \
locale(melody:ar) \
locale(melody:as) \
locale(melody:ast) \
locale(melody:az) \
locale(melody:be) \
locale(melody:bg) \
locale(melody:bn) \
locale(melody:br) \
locale(melody:bs) \
locale(melody:ca) \
locale(melody:cs) \
locale(melody:cy) \
locale(melody:da) \
locale(melody:de) \
locale(melody:dz) \
locale(melody:el) \
locale(melody:en_AU) \
locale(melody:en_CA) \
locale(melody:en_GB) \
locale(melody:eo) \
locale(melody:es) \
locale(melody:et) \
locale(melody:eu) \
locale(melody:fa) \
locale(melody:fi) \
locale(melody:fr) \
locale(melody:fr_CA) \
locale(melody:ga) \
locale(melody:gd) \
locale(melody:gl) \
locale(melody:gu) \
locale(melody:he) \
locale(melody:hi) \
locale(melody:hr) \
locale(melody:hu) \
locale(melody:ia) \
locale(melody:id) \
locale(melody:is) \
locale(melody:it) \
locale(melody:ja) \
locale(melody:ka) \
locale(melody:kk) \
locale(melody:km) \
locale(melody:kn) \
locale(melody:ko) \
locale(melody:lt) \
locale(melody:lv) \
locale(melody:mk) \
locale(melody:ml) \
locale(melody:mr) \
locale(melody:ms) \
locale(melody:nb) \
locale(melody:ne) \
locale(melody:nl) \
locale(melody:nn) \
locale(melody:oc) \
locale(melody:or) \
locale(melody:pa) \
locale(melody:pl) \
locale(melody:pt) \
locale(melody:pt_BR) \
locale(melody:ro) \
locale(melody:ru) \
locale(melody:si) \
locale(melody:sk) \
locale(melody:sl) \
locale(melody:sq) \
locale(melody:sr) \
locale(melody:sv) \
locale(melody:ta) \
locale(melody:te) \
locale(melody:th) \
locale(melody:tr) \
locale(melody:ug) \
locale(melody:uk) \
locale(melody:vi) \
locale(melody:wa) \
locale(melody:zh) \
locale(melody:zh_HK) \
locale(melody:zh_TW) \
melody-lang \
melody-lang-all"

RDEPENDS:${PN} += "melody"

inherit rpm
