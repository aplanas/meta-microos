SUMMARY = "Translations for package cinema"
DESCRIPTION = "Provides translations for the 'cinema' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "cinema-lang-1.1.2-1.24.noarch.rpm"
RPM_HASH = "3cc26b0fc8300306fe9170945b74d421446474d1ec00ac210fd7251eb09faa6feda8b63f9d875637bbe8a2c403e7c86525939c0f50db2a9aee9b5c7a1c0ce46f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinema-lang \
cinema-lang-all \
locale(cinema:af) \
locale(cinema:ar) \
locale(cinema:as) \
locale(cinema:ast) \
locale(cinema:az) \
locale(cinema:be) \
locale(cinema:bg) \
locale(cinema:bn) \
locale(cinema:br) \
locale(cinema:bs) \
locale(cinema:ca) \
locale(cinema:cs) \
locale(cinema:cy) \
locale(cinema:da) \
locale(cinema:de) \
locale(cinema:dz) \
locale(cinema:el) \
locale(cinema:en_AU) \
locale(cinema:en_CA) \
locale(cinema:en_GB) \
locale(cinema:eo) \
locale(cinema:es) \
locale(cinema:et) \
locale(cinema:eu) \
locale(cinema:fa) \
locale(cinema:fi) \
locale(cinema:fr) \
locale(cinema:fr_CA) \
locale(cinema:ga) \
locale(cinema:gd) \
locale(cinema:gl) \
locale(cinema:gu) \
locale(cinema:he) \
locale(cinema:hi) \
locale(cinema:hr) \
locale(cinema:hu) \
locale(cinema:ia) \
locale(cinema:id) \
locale(cinema:is) \
locale(cinema:it) \
locale(cinema:ja) \
locale(cinema:ka) \
locale(cinema:kk) \
locale(cinema:km) \
locale(cinema:kn) \
locale(cinema:ko) \
locale(cinema:lt) \
locale(cinema:lv) \
locale(cinema:mk) \
locale(cinema:ml) \
locale(cinema:mr) \
locale(cinema:ms) \
locale(cinema:nb) \
locale(cinema:ne) \
locale(cinema:nl) \
locale(cinema:nn) \
locale(cinema:oc) \
locale(cinema:or) \
locale(cinema:pa) \
locale(cinema:pl) \
locale(cinema:pt) \
locale(cinema:pt_BR) \
locale(cinema:ro) \
locale(cinema:ru) \
locale(cinema:si) \
locale(cinema:sk) \
locale(cinema:sl) \
locale(cinema:sq) \
locale(cinema:sr) \
locale(cinema:sv) \
locale(cinema:ta) \
locale(cinema:te) \
locale(cinema:th) \
locale(cinema:tr) \
locale(cinema:ug) \
locale(cinema:uk) \
locale(cinema:vi) \
locale(cinema:wa) \
locale(cinema:zh) \
locale(cinema:zh_CN) \
locale(cinema:zh_HK) \
locale(cinema:zh_TW)"

RDEPENDS:${PN} += "cinema"

inherit rpm
