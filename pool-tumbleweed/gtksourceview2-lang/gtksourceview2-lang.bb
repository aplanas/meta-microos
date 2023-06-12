SUMMARY = "Translations for package gtksourceview2"
DESCRIPTION = "Provides translations for the 'gtksourceview2' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "gtksourceview2-lang-2.10.5-20.9.noarch.rpm"
RPM_HASH = "c8cdfcfddb2aa0801675c124409db70cdc3d12cc2ef9dd54b8b6a26136ad043d33493febca6ce75edad14b6d602e5ec766a8fccf42faebff4142d5f31b1d9428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview2-lang \
gtksourceview2-lang-all \
locale(gtksourceview2:ar) \
locale(gtksourceview2:as) \
locale(gtksourceview2:ast) \
locale(gtksourceview2:az) \
locale(gtksourceview2:be) \
locale(gtksourceview2:bg) \
locale(gtksourceview2:bn) \
locale(gtksourceview2:bn_IN) \
locale(gtksourceview2:bs) \
locale(gtksourceview2:ca) \
locale(gtksourceview2:ca@valencia) \
locale(gtksourceview2:cs) \
locale(gtksourceview2:cy) \
locale(gtksourceview2:da) \
locale(gtksourceview2:de) \
locale(gtksourceview2:dz) \
locale(gtksourceview2:el) \
locale(gtksourceview2:en@shaw) \
locale(gtksourceview2:en_CA) \
locale(gtksourceview2:en_GB) \
locale(gtksourceview2:es) \
locale(gtksourceview2:et) \
locale(gtksourceview2:eu) \
locale(gtksourceview2:fa) \
locale(gtksourceview2:fi) \
locale(gtksourceview2:fr) \
locale(gtksourceview2:ga) \
locale(gtksourceview2:gl) \
locale(gtksourceview2:gu) \
locale(gtksourceview2:he) \
locale(gtksourceview2:hi) \
locale(gtksourceview2:hr) \
locale(gtksourceview2:hu) \
locale(gtksourceview2:id) \
locale(gtksourceview2:it) \
locale(gtksourceview2:ja) \
locale(gtksourceview2:kn) \
locale(gtksourceview2:ko) \
locale(gtksourceview2:lt) \
locale(gtksourceview2:lv) \
locale(gtksourceview2:mai) \
locale(gtksourceview2:mk) \
locale(gtksourceview2:ml) \
locale(gtksourceview2:mr) \
locale(gtksourceview2:ms) \
locale(gtksourceview2:nb) \
locale(gtksourceview2:ne) \
locale(gtksourceview2:nl) \
locale(gtksourceview2:nn) \
locale(gtksourceview2:oc) \
locale(gtksourceview2:or) \
locale(gtksourceview2:pa) \
locale(gtksourceview2:pl) \
locale(gtksourceview2:pt) \
locale(gtksourceview2:pt_BR) \
locale(gtksourceview2:ro) \
locale(gtksourceview2:ru) \
locale(gtksourceview2:si) \
locale(gtksourceview2:sk) \
locale(gtksourceview2:sl) \
locale(gtksourceview2:sq) \
locale(gtksourceview2:sr) \
locale(gtksourceview2:sr@latin) \
locale(gtksourceview2:sv) \
locale(gtksourceview2:ta) \
locale(gtksourceview2:te) \
locale(gtksourceview2:th) \
locale(gtksourceview2:tr) \
locale(gtksourceview2:uk) \
locale(gtksourceview2:vi) \
locale(gtksourceview2:zh_CN) \
locale(gtksourceview2:zh_HK) \
locale(gtksourceview2:zh_TW)"
RDEPENDS:${PN} += "gtksourceview2"

inherit rpm
