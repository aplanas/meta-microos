SUMMARY = "Translations for package gnome-calendar"
DESCRIPTION = "Provides translations for the 'gnome-calendar' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-calendar-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "5381a4bfa15ca4b647cd4a6123eaceaeaa6c66e868e8b56228fe40fa7a0cc7ec6a741c1bfb4a25d19998c4f161e024ae9a59191a601e30e5c47f0416c2e5ee52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-calendar-lang \
gnome-calendar-lang-all \
locale(gnome-calendar:af) \
locale(gnome-calendar:ar) \
locale(gnome-calendar:be) \
locale(gnome-calendar:bg) \
locale(gnome-calendar:bs) \
locale(gnome-calendar:ca) \
locale(gnome-calendar:ca@valencia) \
locale(gnome-calendar:cs) \
locale(gnome-calendar:da) \
locale(gnome-calendar:de) \
locale(gnome-calendar:el) \
locale(gnome-calendar:en_GB) \
locale(gnome-calendar:eo) \
locale(gnome-calendar:es) \
locale(gnome-calendar:et) \
locale(gnome-calendar:eu) \
locale(gnome-calendar:fa) \
locale(gnome-calendar:fi) \
locale(gnome-calendar:fr) \
locale(gnome-calendar:fur) \
locale(gnome-calendar:ga) \
locale(gnome-calendar:gd) \
locale(gnome-calendar:gl) \
locale(gnome-calendar:he) \
locale(gnome-calendar:hi) \
locale(gnome-calendar:hr) \
locale(gnome-calendar:hu) \
locale(gnome-calendar:id) \
locale(gnome-calendar:is) \
locale(gnome-calendar:it) \
locale(gnome-calendar:ja) \
locale(gnome-calendar:ka) \
locale(gnome-calendar:kk) \
locale(gnome-calendar:ko) \
locale(gnome-calendar:lt) \
locale(gnome-calendar:lv) \
locale(gnome-calendar:ml) \
locale(gnome-calendar:ms) \
locale(gnome-calendar:nb) \
locale(gnome-calendar:ne) \
locale(gnome-calendar:nl) \
locale(gnome-calendar:oc) \
locale(gnome-calendar:pa) \
locale(gnome-calendar:pl) \
locale(gnome-calendar:pt) \
locale(gnome-calendar:pt_BR) \
locale(gnome-calendar:ro) \
locale(gnome-calendar:ru) \
locale(gnome-calendar:sk) \
locale(gnome-calendar:sl) \
locale(gnome-calendar:sr) \
locale(gnome-calendar:sr@latin) \
locale(gnome-calendar:sv) \
locale(gnome-calendar:ta) \
locale(gnome-calendar:th) \
locale(gnome-calendar:tr) \
locale(gnome-calendar:uk) \
locale(gnome-calendar:vi) \
locale(gnome-calendar:zh_CN) \
locale(gnome-calendar:zh_HK) \
locale(gnome-calendar:zh_TW)"
RDEPENDS:${PN} += "gnome-calendar"

inherit rpm
