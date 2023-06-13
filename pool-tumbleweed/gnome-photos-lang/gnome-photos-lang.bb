SUMMARY = "Translations for package gnome-photos"
DESCRIPTION = "Provides translations for the 'gnome-photos' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-photos-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "d9299bd774f97d32625c9ba12ccaec8d5ac95aa24049d4fdd395df625b244da3279c7ace7312c78f0c5a80eb84e60c59a174e9906cba018674742e1e6b11a96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-photos-lang \
gnome-photos-lang-all \
locale(gnome-photos:ar) \
locale(gnome-photos:as) \
locale(gnome-photos:be) \
locale(gnome-photos:bg) \
locale(gnome-photos:bs) \
locale(gnome-photos:ca) \
locale(gnome-photos:ca@valencia) \
locale(gnome-photos:cs) \
locale(gnome-photos:da) \
locale(gnome-photos:de) \
locale(gnome-photos:el) \
locale(gnome-photos:en_GB) \
locale(gnome-photos:eo) \
locale(gnome-photos:es) \
locale(gnome-photos:et) \
locale(gnome-photos:eu) \
locale(gnome-photos:fa) \
locale(gnome-photos:fi) \
locale(gnome-photos:fr) \
locale(gnome-photos:fur) \
locale(gnome-photos:ga) \
locale(gnome-photos:gd) \
locale(gnome-photos:gl) \
locale(gnome-photos:gu) \
locale(gnome-photos:he) \
locale(gnome-photos:hr) \
locale(gnome-photos:hu) \
locale(gnome-photos:id) \
locale(gnome-photos:is) \
locale(gnome-photos:it) \
locale(gnome-photos:ja) \
locale(gnome-photos:ka) \
locale(gnome-photos:kk) \
locale(gnome-photos:km) \
locale(gnome-photos:kn) \
locale(gnome-photos:ko) \
locale(gnome-photos:lt) \
locale(gnome-photos:lv) \
locale(gnome-photos:ml) \
locale(gnome-photos:ms) \
locale(gnome-photos:nb) \
locale(gnome-photos:ne) \
locale(gnome-photos:nl) \
locale(gnome-photos:oc) \
locale(gnome-photos:pa) \
locale(gnome-photos:pl) \
locale(gnome-photos:pt) \
locale(gnome-photos:pt_BR) \
locale(gnome-photos:ro) \
locale(gnome-photos:ru) \
locale(gnome-photos:sk) \
locale(gnome-photos:sl) \
locale(gnome-photos:sr) \
locale(gnome-photos:sr@latin) \
locale(gnome-photos:sv) \
locale(gnome-photos:te) \
locale(gnome-photos:tr) \
locale(gnome-photos:uk) \
locale(gnome-photos:vi) \
locale(gnome-photos:zh_CN) \
locale(gnome-photos:zh_HK) \
locale(gnome-photos:zh_TW)"

RDEPENDS:${PN} += "gnome-photos"

inherit rpm
