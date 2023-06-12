SUMMARY = "Translations for package file-roller"
DESCRIPTION = "Provides translations for the 'file-roller' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "file-roller-lang-43.0-1.3.noarch.rpm"
RPM_HASH = "45c1a87a5b1978297537dc745d65f59211bad3baa03301b06542e7bf5649e46761aa7e82afe986a2927c35aabe5d39521bef75cf69a35e4ed0a80150d63ca715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "file-roller-lang \
file-roller-lang-all \
locale(file-roller:af) \
locale(file-roller:ar) \
locale(file-roller:as) \
locale(file-roller:ast) \
locale(file-roller:az) \
locale(file-roller:be) \
locale(file-roller:be@latin) \
locale(file-roller:bg) \
locale(file-roller:bn) \
locale(file-roller:bn_IN) \
locale(file-roller:br) \
locale(file-roller:bs) \
locale(file-roller:ca) \
locale(file-roller:ca@valencia) \
locale(file-roller:cs) \
locale(file-roller:cy) \
locale(file-roller:da) \
locale(file-roller:de) \
locale(file-roller:dz) \
locale(file-roller:el) \
locale(file-roller:en@shaw) \
locale(file-roller:en_CA) \
locale(file-roller:en_GB) \
locale(file-roller:eo) \
locale(file-roller:es) \
locale(file-roller:et) \
locale(file-roller:eu) \
locale(file-roller:fa) \
locale(file-roller:fi) \
locale(file-roller:fr) \
locale(file-roller:fur) \
locale(file-roller:ga) \
locale(file-roller:gd) \
locale(file-roller:gl) \
locale(file-roller:gu) \
locale(file-roller:he) \
locale(file-roller:hi) \
locale(file-roller:hr) \
locale(file-roller:hu) \
locale(file-roller:id) \
locale(file-roller:is) \
locale(file-roller:it) \
locale(file-roller:ja) \
locale(file-roller:ka) \
locale(file-roller:kk) \
locale(file-roller:km) \
locale(file-roller:kn) \
locale(file-roller:ko) \
locale(file-roller:lt) \
locale(file-roller:lv) \
locale(file-roller:mai) \
locale(file-roller:mk) \
locale(file-roller:ml) \
locale(file-roller:mr) \
locale(file-roller:ms) \
locale(file-roller:nb) \
locale(file-roller:nds) \
locale(file-roller:ne) \
locale(file-roller:nl) \
locale(file-roller:nn) \
locale(file-roller:oc) \
locale(file-roller:or) \
locale(file-roller:pa) \
locale(file-roller:pl) \
locale(file-roller:pt) \
locale(file-roller:pt_BR) \
locale(file-roller:ro) \
locale(file-roller:ru) \
locale(file-roller:si) \
locale(file-roller:sk) \
locale(file-roller:sl) \
locale(file-roller:sq) \
locale(file-roller:sr) \
locale(file-roller:sr@ije) \
locale(file-roller:sr@latin) \
locale(file-roller:sv) \
locale(file-roller:ta) \
locale(file-roller:te) \
locale(file-roller:th) \
locale(file-roller:tr) \
locale(file-roller:ug) \
locale(file-roller:uk) \
locale(file-roller:vi) \
locale(file-roller:zh_CN) \
locale(file-roller:zh_HK) \
locale(file-roller:zh_TW)"
RDEPENDS:${PN} += "file-roller"

inherit rpm
