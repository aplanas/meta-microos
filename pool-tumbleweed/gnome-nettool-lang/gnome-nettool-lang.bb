SUMMARY = "Translations for package gnome-nettool"
DESCRIPTION = "Provides translations for the 'gnome-nettool' package."
LICENSE = "GPL-2.0-or-later"

PV = "42.0"

RPM_NAME = "gnome-nettool-lang-42.0-2.1.noarch.rpm"
RPM_HASH = "8fbc94aa4915d048c513eacb88b8a9425a7d4442cbcf425a9d294ba1458554d69f3d2b9ab49b1925e5b07cc7d99934f6ae04e0aa46a7c71955b3921386037e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-nettool-lang \
gnome-nettool-lang-all \
locale(gnome-nettool:af) \
locale(gnome-nettool:ar) \
locale(gnome-nettool:as) \
locale(gnome-nettool:ast) \
locale(gnome-nettool:az) \
locale(gnome-nettool:be) \
locale(gnome-nettool:bg) \
locale(gnome-nettool:bn) \
locale(gnome-nettool:bn_IN) \
locale(gnome-nettool:br) \
locale(gnome-nettool:bs) \
locale(gnome-nettool:ca) \
locale(gnome-nettool:ca@valencia) \
locale(gnome-nettool:cs) \
locale(gnome-nettool:cy) \
locale(gnome-nettool:da) \
locale(gnome-nettool:de) \
locale(gnome-nettool:dz) \
locale(gnome-nettool:el) \
locale(gnome-nettool:en@shaw) \
locale(gnome-nettool:en_CA) \
locale(gnome-nettool:en_GB) \
locale(gnome-nettool:eo) \
locale(gnome-nettool:es) \
locale(gnome-nettool:et) \
locale(gnome-nettool:eu) \
locale(gnome-nettool:fa) \
locale(gnome-nettool:fi) \
locale(gnome-nettool:fr) \
locale(gnome-nettool:fur) \
locale(gnome-nettool:ga) \
locale(gnome-nettool:gd) \
locale(gnome-nettool:gl) \
locale(gnome-nettool:gu) \
locale(gnome-nettool:he) \
locale(gnome-nettool:hi) \
locale(gnome-nettool:hr) \
locale(gnome-nettool:hu) \
locale(gnome-nettool:id) \
locale(gnome-nettool:is) \
locale(gnome-nettool:it) \
locale(gnome-nettool:ja) \
locale(gnome-nettool:ka) \
locale(gnome-nettool:kk) \
locale(gnome-nettool:km) \
locale(gnome-nettool:kn) \
locale(gnome-nettool:ko) \
locale(gnome-nettool:lt) \
locale(gnome-nettool:lv) \
locale(gnome-nettool:mai) \
locale(gnome-nettool:mk) \
locale(gnome-nettool:ml) \
locale(gnome-nettool:mr) \
locale(gnome-nettool:ms) \
locale(gnome-nettool:nb) \
locale(gnome-nettool:ne) \
locale(gnome-nettool:nl) \
locale(gnome-nettool:nn) \
locale(gnome-nettool:oc) \
locale(gnome-nettool:or) \
locale(gnome-nettool:pa) \
locale(gnome-nettool:pl) \
locale(gnome-nettool:pt) \
locale(gnome-nettool:pt_BR) \
locale(gnome-nettool:ro) \
locale(gnome-nettool:ru) \
locale(gnome-nettool:si) \
locale(gnome-nettool:sk) \
locale(gnome-nettool:sl) \
locale(gnome-nettool:sq) \
locale(gnome-nettool:sr) \
locale(gnome-nettool:sr@latin) \
locale(gnome-nettool:sv) \
locale(gnome-nettool:ta) \
locale(gnome-nettool:te) \
locale(gnome-nettool:th) \
locale(gnome-nettool:tr) \
locale(gnome-nettool:ug) \
locale(gnome-nettool:uk) \
locale(gnome-nettool:vi) \
locale(gnome-nettool:wa) \
locale(gnome-nettool:zh_CN) \
locale(gnome-nettool:zh_HK) \
locale(gnome-nettool:zh_TW)"
RDEPENDS:${PN} += "gnome-nettool"

inherit rpm
