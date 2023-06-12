SUMMARY = "Translations for package gnome-bluetooth-1"
DESCRIPTION = "Provides translations for the 'gnome-bluetooth-1' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "gnome-bluetooth-1-lang-3.34.5-2.7.noarch.rpm"
RPM_HASH = "c1b387759ae6869ad0ec0239541764497a1abcb79312df535a2ef501e77a0794b48076ac47cde0cc97c49b900903a51fad19abb4446600e77a14e981fc882749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-bluetooth-1-lang \
gnome-bluetooth-1-lang-all \
locale(gnome-bluetooth-1:af) \
locale(gnome-bluetooth-1:ar) \
locale(gnome-bluetooth-1:as) \
locale(gnome-bluetooth-1:ast) \
locale(gnome-bluetooth-1:be) \
locale(gnome-bluetooth-1:bg) \
locale(gnome-bluetooth-1:bn) \
locale(gnome-bluetooth-1:bn_IN) \
locale(gnome-bluetooth-1:bs) \
locale(gnome-bluetooth-1:ca) \
locale(gnome-bluetooth-1:ca@valencia) \
locale(gnome-bluetooth-1:cs) \
locale(gnome-bluetooth-1:da) \
locale(gnome-bluetooth-1:de) \
locale(gnome-bluetooth-1:el) \
locale(gnome-bluetooth-1:en@shaw) \
locale(gnome-bluetooth-1:en_GB) \
locale(gnome-bluetooth-1:eo) \
locale(gnome-bluetooth-1:es) \
locale(gnome-bluetooth-1:et) \
locale(gnome-bluetooth-1:eu) \
locale(gnome-bluetooth-1:fa) \
locale(gnome-bluetooth-1:fi) \
locale(gnome-bluetooth-1:fr) \
locale(gnome-bluetooth-1:fur) \
locale(gnome-bluetooth-1:ga) \
locale(gnome-bluetooth-1:gd) \
locale(gnome-bluetooth-1:gl) \
locale(gnome-bluetooth-1:gu) \
locale(gnome-bluetooth-1:he) \
locale(gnome-bluetooth-1:hi) \
locale(gnome-bluetooth-1:hr) \
locale(gnome-bluetooth-1:hu) \
locale(gnome-bluetooth-1:id) \
locale(gnome-bluetooth-1:is) \
locale(gnome-bluetooth-1:it) \
locale(gnome-bluetooth-1:ja) \
locale(gnome-bluetooth-1:ka) \
locale(gnome-bluetooth-1:kk) \
locale(gnome-bluetooth-1:km) \
locale(gnome-bluetooth-1:kn) \
locale(gnome-bluetooth-1:ko) \
locale(gnome-bluetooth-1:lt) \
locale(gnome-bluetooth-1:lv) \
locale(gnome-bluetooth-1:mai) \
locale(gnome-bluetooth-1:mk) \
locale(gnome-bluetooth-1:ml) \
locale(gnome-bluetooth-1:mr) \
locale(gnome-bluetooth-1:ms) \
locale(gnome-bluetooth-1:nb) \
locale(gnome-bluetooth-1:ne) \
locale(gnome-bluetooth-1:nl) \
locale(gnome-bluetooth-1:nn) \
locale(gnome-bluetooth-1:oc) \
locale(gnome-bluetooth-1:or) \
locale(gnome-bluetooth-1:pa) \
locale(gnome-bluetooth-1:pl) \
locale(gnome-bluetooth-1:pt) \
locale(gnome-bluetooth-1:pt_BR) \
locale(gnome-bluetooth-1:ro) \
locale(gnome-bluetooth-1:ru) \
locale(gnome-bluetooth-1:sk) \
locale(gnome-bluetooth-1:sl) \
locale(gnome-bluetooth-1:sr) \
locale(gnome-bluetooth-1:sr@latin) \
locale(gnome-bluetooth-1:sv) \
locale(gnome-bluetooth-1:ta) \
locale(gnome-bluetooth-1:te) \
locale(gnome-bluetooth-1:th) \
locale(gnome-bluetooth-1:tr) \
locale(gnome-bluetooth-1:ug) \
locale(gnome-bluetooth-1:uk) \
locale(gnome-bluetooth-1:vi) \
locale(gnome-bluetooth-1:zh_CN) \
locale(gnome-bluetooth-1:zh_HK) \
locale(gnome-bluetooth-1:zh_TW)"
RDEPENDS:${PN} += "gnome-bluetooth-1"

inherit rpm
