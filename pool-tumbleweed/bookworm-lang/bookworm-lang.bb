SUMMARY = "Translations for package bookworm"
DESCRIPTION = "Provides translations for the 'bookworm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "bookworm-lang-1.1.2-2.10.noarch.rpm"
RPM_HASH = "bf5e273bea10fd7de7f39b75b1e8faf11938839dbca88f4229d15dd78a052118829c67fddcb6182b734906e4fd7778cde102559ee29a7de13ed1b26ce12c76cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bookworm-lang \
bookworm-lang-all \
locale(bookworm:af) \
locale(bookworm:ar) \
locale(bookworm:as) \
locale(bookworm:ast) \
locale(bookworm:az) \
locale(bookworm:be) \
locale(bookworm:bg) \
locale(bookworm:bn) \
locale(bookworm:br) \
locale(bookworm:bs) \
locale(bookworm:ca) \
locale(bookworm:cs) \
locale(bookworm:cy) \
locale(bookworm:da) \
locale(bookworm:de) \
locale(bookworm:dz) \
locale(bookworm:el) \
locale(bookworm:en_AU) \
locale(bookworm:en_CA) \
locale(bookworm:en_GB) \
locale(bookworm:eo) \
locale(bookworm:es) \
locale(bookworm:es_MX) \
locale(bookworm:et) \
locale(bookworm:eu) \
locale(bookworm:fa) \
locale(bookworm:fi) \
locale(bookworm:fr) \
locale(bookworm:fr_CA) \
locale(bookworm:ga) \
locale(bookworm:gd) \
locale(bookworm:gl) \
locale(bookworm:gu) \
locale(bookworm:he) \
locale(bookworm:hi) \
locale(bookworm:hr) \
locale(bookworm:hu) \
locale(bookworm:ia) \
locale(bookworm:id) \
locale(bookworm:is) \
locale(bookworm:it) \
locale(bookworm:ja) \
locale(bookworm:ka) \
locale(bookworm:kk) \
locale(bookworm:km) \
locale(bookworm:kn) \
locale(bookworm:ko) \
locale(bookworm:lt) \
locale(bookworm:lv) \
locale(bookworm:mk) \
locale(bookworm:ml) \
locale(bookworm:mr) \
locale(bookworm:ms) \
locale(bookworm:nb_NO) \
locale(bookworm:ne) \
locale(bookworm:nl) \
locale(bookworm:nn) \
locale(bookworm:oc) \
locale(bookworm:or) \
locale(bookworm:pa) \
locale(bookworm:pl) \
locale(bookworm:pt) \
locale(bookworm:pt_BR) \
locale(bookworm:ro) \
locale(bookworm:ru) \
locale(bookworm:si) \
locale(bookworm:sk) \
locale(bookworm:sl) \
locale(bookworm:sq) \
locale(bookworm:sr) \
locale(bookworm:sv) \
locale(bookworm:ta) \
locale(bookworm:te) \
locale(bookworm:th) \
locale(bookworm:tr) \
locale(bookworm:ug) \
locale(bookworm:uk) \
locale(bookworm:vi) \
locale(bookworm:wa) \
locale(bookworm:zh) \
locale(bookworm:zh_CN) \
locale(bookworm:zh_HK) \
locale(bookworm:zh_TW)"

RDEPENDS:${PN} += "bookworm"

inherit rpm
