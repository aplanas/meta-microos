SUMMARY = "Translations for package epiphany"
DESCRIPTION = "Provides translations for the 'epiphany' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "epiphany-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "97a7f499e6d4f3f8a85adece67738311545c2910c4e8fbf2a920542e2e053a6a83128f9f9fd82b5100a54618de7a3235d95363bfcb6a20b4cd6d4a47bdc98a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-lang epiphany-lang-all locale(epiphany:af) locale(epiphany:ar) locale(epiphany:as) locale(epiphany:ast) locale(epiphany:az) locale(epiphany:be) locale(epiphany:be@latin) locale(epiphany:bg) locale(epiphany:bn) locale(epiphany:bn_IN) locale(epiphany:br) locale(epiphany:bs) locale(epiphany:ca) locale(epiphany:ca@valencia) locale(epiphany:cs) locale(epiphany:cy) locale(epiphany:da) locale(epiphany:de) locale(epiphany:dz) locale(epiphany:el) locale(epiphany:en@shaw) locale(epiphany:en_CA) locale(epiphany:en_GB) locale(epiphany:eo) locale(epiphany:es) locale(epiphany:et) locale(epiphany:eu) locale(epiphany:fa) locale(epiphany:fi) locale(epiphany:fr) locale(epiphany:fur) locale(epiphany:ga) locale(epiphany:gl) locale(epiphany:gu) locale(epiphany:he) locale(epiphany:hi) locale(epiphany:hr) locale(epiphany:hu) locale(epiphany:id) locale(epiphany:is) locale(epiphany:it) locale(epiphany:ja) locale(epiphany:ka) locale(epiphany:kk) locale(epiphany:km) locale(epiphany:kn) locale(epiphany:ko) locale(epiphany:lt) locale(epiphany:lv) locale(epiphany:mai) locale(epiphany:mk) locale(epiphany:ml) locale(epiphany:mr) locale(epiphany:ms) locale(epiphany:nb) locale(epiphany:nds) locale(epiphany:ne) locale(epiphany:nl) locale(epiphany:nn) locale(epiphany:oc) locale(epiphany:or) locale(epiphany:pa) locale(epiphany:pl) locale(epiphany:pt) locale(epiphany:pt_BR) locale(epiphany:ro) locale(epiphany:ru) locale(epiphany:si) locale(epiphany:sk) locale(epiphany:sl) locale(epiphany:sq) locale(epiphany:sr) locale(epiphany:sr@latin) locale(epiphany:sv) locale(epiphany:ta) locale(epiphany:te) locale(epiphany:th) locale(epiphany:tr) locale(epiphany:ug) locale(epiphany:uk) locale(epiphany:vi) locale(epiphany:wa) locale(epiphany:zh_CN) locale(epiphany:zh_HK) locale(epiphany:zh_TW)"
RDEPENDS:${PN} += "epiphany"

inherit rpm
