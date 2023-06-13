SUMMARY = "Translations for package gnome-tetravex"
DESCRIPTION = "Provides translations for the 'gnome-tetravex' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-tetravex-lang-3.38.2-2.7.noarch.rpm"
RPM_HASH = "4b7353ec73a8668934d8549a483394dfe04992c11c1c31d9e4a26ffe1b531711a794eb941cc24bec29a0287086e09c5c177033dbde3ef714a46b6ba2f29a0aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tetravex-lang \
gnome-tetravex-lang-all \
locale(gnome-tetravex:af) \
locale(gnome-tetravex:ar) \
locale(gnome-tetravex:as) \
locale(gnome-tetravex:ast) \
locale(gnome-tetravex:az) \
locale(gnome-tetravex:be) \
locale(gnome-tetravex:bg) \
locale(gnome-tetravex:bn) \
locale(gnome-tetravex:bn_IN) \
locale(gnome-tetravex:br) \
locale(gnome-tetravex:bs) \
locale(gnome-tetravex:ca) \
locale(gnome-tetravex:ca@valencia) \
locale(gnome-tetravex:cs) \
locale(gnome-tetravex:cy) \
locale(gnome-tetravex:da) \
locale(gnome-tetravex:de) \
locale(gnome-tetravex:dz) \
locale(gnome-tetravex:el) \
locale(gnome-tetravex:en@shaw) \
locale(gnome-tetravex:en_CA) \
locale(gnome-tetravex:en_GB) \
locale(gnome-tetravex:eo) \
locale(gnome-tetravex:es) \
locale(gnome-tetravex:et) \
locale(gnome-tetravex:eu) \
locale(gnome-tetravex:fa) \
locale(gnome-tetravex:fi) \
locale(gnome-tetravex:fr) \
locale(gnome-tetravex:fur) \
locale(gnome-tetravex:ga) \
locale(gnome-tetravex:gl) \
locale(gnome-tetravex:gu) \
locale(gnome-tetravex:he) \
locale(gnome-tetravex:hi) \
locale(gnome-tetravex:hr) \
locale(gnome-tetravex:hu) \
locale(gnome-tetravex:id) \
locale(gnome-tetravex:is) \
locale(gnome-tetravex:it) \
locale(gnome-tetravex:ja) \
locale(gnome-tetravex:ka) \
locale(gnome-tetravex:kk) \
locale(gnome-tetravex:km) \
locale(gnome-tetravex:kn) \
locale(gnome-tetravex:ko) \
locale(gnome-tetravex:lt) \
locale(gnome-tetravex:lv) \
locale(gnome-tetravex:mai) \
locale(gnome-tetravex:mk) \
locale(gnome-tetravex:ml) \
locale(gnome-tetravex:mr) \
locale(gnome-tetravex:ms) \
locale(gnome-tetravex:nb) \
locale(gnome-tetravex:ne) \
locale(gnome-tetravex:nl) \
locale(gnome-tetravex:nn) \
locale(gnome-tetravex:oc) \
locale(gnome-tetravex:or) \
locale(gnome-tetravex:pa) \
locale(gnome-tetravex:pl) \
locale(gnome-tetravex:pt) \
locale(gnome-tetravex:pt_BR) \
locale(gnome-tetravex:ro) \
locale(gnome-tetravex:ru) \
locale(gnome-tetravex:si) \
locale(gnome-tetravex:sk) \
locale(gnome-tetravex:sl) \
locale(gnome-tetravex:sq) \
locale(gnome-tetravex:sr) \
locale(gnome-tetravex:sr@latin) \
locale(gnome-tetravex:sv) \
locale(gnome-tetravex:ta) \
locale(gnome-tetravex:te) \
locale(gnome-tetravex:th) \
locale(gnome-tetravex:tr) \
locale(gnome-tetravex:ug) \
locale(gnome-tetravex:uk) \
locale(gnome-tetravex:vi) \
locale(gnome-tetravex:wa) \
locale(gnome-tetravex:zh_CN) \
locale(gnome-tetravex:zh_HK) \
locale(gnome-tetravex:zh_TW)"

RDEPENDS:${PN} += "gnome-tetravex"

inherit rpm
