SUMMARY = "Translations for package gnome-bluetooth"
DESCRIPTION = "Provides translations for the 'gnome-bluetooth' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "gnome-bluetooth-lang-42.5-1.3.noarch.rpm"
RPM_HASH = "a9dda7689af62e4c942ebc1052bc980b0ec67109fd7936829a5d59ebc025f01013c4f21d4f49f8c299b82141283658594d8bad9816fcf2622150aa0d773bff42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-bluetooth-lang \
gnome-bluetooth-lang-all \
locale(gnome-bluetooth:af) \
locale(gnome-bluetooth:ar) \
locale(gnome-bluetooth:as) \
locale(gnome-bluetooth:ast) \
locale(gnome-bluetooth:be) \
locale(gnome-bluetooth:bg) \
locale(gnome-bluetooth:bn) \
locale(gnome-bluetooth:bn_IN) \
locale(gnome-bluetooth:bs) \
locale(gnome-bluetooth:ca) \
locale(gnome-bluetooth:ca@valencia) \
locale(gnome-bluetooth:cs) \
locale(gnome-bluetooth:da) \
locale(gnome-bluetooth:de) \
locale(gnome-bluetooth:el) \
locale(gnome-bluetooth:en@shaw) \
locale(gnome-bluetooth:en_GB) \
locale(gnome-bluetooth:eo) \
locale(gnome-bluetooth:es) \
locale(gnome-bluetooth:et) \
locale(gnome-bluetooth:eu) \
locale(gnome-bluetooth:fa) \
locale(gnome-bluetooth:fi) \
locale(gnome-bluetooth:fr) \
locale(gnome-bluetooth:fur) \
locale(gnome-bluetooth:ga) \
locale(gnome-bluetooth:gd) \
locale(gnome-bluetooth:gl) \
locale(gnome-bluetooth:gu) \
locale(gnome-bluetooth:he) \
locale(gnome-bluetooth:hi) \
locale(gnome-bluetooth:hr) \
locale(gnome-bluetooth:hu) \
locale(gnome-bluetooth:id) \
locale(gnome-bluetooth:is) \
locale(gnome-bluetooth:it) \
locale(gnome-bluetooth:ja) \
locale(gnome-bluetooth:ka) \
locale(gnome-bluetooth:kk) \
locale(gnome-bluetooth:km) \
locale(gnome-bluetooth:kn) \
locale(gnome-bluetooth:ko) \
locale(gnome-bluetooth:lt) \
locale(gnome-bluetooth:lv) \
locale(gnome-bluetooth:mai) \
locale(gnome-bluetooth:mk) \
locale(gnome-bluetooth:ml) \
locale(gnome-bluetooth:mr) \
locale(gnome-bluetooth:ms) \
locale(gnome-bluetooth:nb) \
locale(gnome-bluetooth:ne) \
locale(gnome-bluetooth:nl) \
locale(gnome-bluetooth:nn) \
locale(gnome-bluetooth:oc) \
locale(gnome-bluetooth:or) \
locale(gnome-bluetooth:pa) \
locale(gnome-bluetooth:pl) \
locale(gnome-bluetooth:pt) \
locale(gnome-bluetooth:pt_BR) \
locale(gnome-bluetooth:ro) \
locale(gnome-bluetooth:ru) \
locale(gnome-bluetooth:sk) \
locale(gnome-bluetooth:sl) \
locale(gnome-bluetooth:sr) \
locale(gnome-bluetooth:sr@latin) \
locale(gnome-bluetooth:sv) \
locale(gnome-bluetooth:ta) \
locale(gnome-bluetooth:te) \
locale(gnome-bluetooth:th) \
locale(gnome-bluetooth:tr) \
locale(gnome-bluetooth:ug) \
locale(gnome-bluetooth:uk) \
locale(gnome-bluetooth:vi) \
locale(gnome-bluetooth:zh_CN) \
locale(gnome-bluetooth:zh_HK) \
locale(gnome-bluetooth:zh_TW)"

RDEPENDS:${PN} += "gnome-bluetooth"

inherit rpm
