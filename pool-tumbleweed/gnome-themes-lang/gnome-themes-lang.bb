SUMMARY = "Translations for package gnome-themes"
DESCRIPTION = "Provides translations for the 'gnome-themes' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gnome-themes-lang-3.0.0-22.6.noarch.rpm"
RPM_HASH = "49da8a87b25c7ce95c5aabe0b0d5202ef71a226fa57733cec043a4a9bf754e52ffa92a1dbbbd78e1ce2b15a6d629f9cad5ac5d2c6f895361b5c31766105f21b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-lang \
gnome-themes-lang-all \
locale(gnome-themes:af) \
locale(gnome-themes:ar) \
locale(gnome-themes:as) \
locale(gnome-themes:ast) \
locale(gnome-themes:az) \
locale(gnome-themes:be) \
locale(gnome-themes:be@latin) \
locale(gnome-themes:bg) \
locale(gnome-themes:bn) \
locale(gnome-themes:bn_IN) \
locale(gnome-themes:br) \
locale(gnome-themes:bs) \
locale(gnome-themes:ca) \
locale(gnome-themes:ca@valencia) \
locale(gnome-themes:cs) \
locale(gnome-themes:cy) \
locale(gnome-themes:da) \
locale(gnome-themes:de) \
locale(gnome-themes:dz) \
locale(gnome-themes:el) \
locale(gnome-themes:en@shaw) \
locale(gnome-themes:en_CA) \
locale(gnome-themes:en_GB) \
locale(gnome-themes:es) \
locale(gnome-themes:et) \
locale(gnome-themes:eu) \
locale(gnome-themes:fa) \
locale(gnome-themes:fi) \
locale(gnome-themes:fr) \
locale(gnome-themes:fur) \
locale(gnome-themes:ga) \
locale(gnome-themes:gl) \
locale(gnome-themes:gu) \
locale(gnome-themes:he) \
locale(gnome-themes:hi) \
locale(gnome-themes:hr) \
locale(gnome-themes:hu) \
locale(gnome-themes:id) \
locale(gnome-themes:is) \
locale(gnome-themes:it) \
locale(gnome-themes:ja) \
locale(gnome-themes:ka) \
locale(gnome-themes:kn) \
locale(gnome-themes:ko) \
locale(gnome-themes:lt) \
locale(gnome-themes:lv) \
locale(gnome-themes:mai) \
locale(gnome-themes:mk) \
locale(gnome-themes:ml) \
locale(gnome-themes:mr) \
locale(gnome-themes:ms) \
locale(gnome-themes:nb) \
locale(gnome-themes:nds) \
locale(gnome-themes:ne) \
locale(gnome-themes:nl) \
locale(gnome-themes:nn) \
locale(gnome-themes:oc) \
locale(gnome-themes:or) \
locale(gnome-themes:pa) \
locale(gnome-themes:pl) \
locale(gnome-themes:pt) \
locale(gnome-themes:pt_BR) \
locale(gnome-themes:ro) \
locale(gnome-themes:ru) \
locale(gnome-themes:si) \
locale(gnome-themes:sk) \
locale(gnome-themes:sl) \
locale(gnome-themes:sq) \
locale(gnome-themes:sr) \
locale(gnome-themes:sr@latin) \
locale(gnome-themes:sv) \
locale(gnome-themes:ta) \
locale(gnome-themes:te) \
locale(gnome-themes:th) \
locale(gnome-themes:tr) \
locale(gnome-themes:ug) \
locale(gnome-themes:uk) \
locale(gnome-themes:vi) \
locale(gnome-themes:wa) \
locale(gnome-themes:zh_CN) \
locale(gnome-themes:zh_HK) \
locale(gnome-themes:zh_TW)"

RDEPENDS:${PN} += "gnome-themes"

inherit rpm
