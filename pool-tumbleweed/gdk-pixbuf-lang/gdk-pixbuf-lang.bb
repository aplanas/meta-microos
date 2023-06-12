SUMMARY = "Translations for package gdk-pixbuf"
DESCRIPTION = "Provides translations for the 'gdk-pixbuf' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-lang-2.42.10-1.4.noarch.rpm"
RPM_HASH = "6bae178a1ad77e41467f07bbafc7b6da13c0143033a1818a1acdc26a755987565d697ac0a3af59bd1df2c9ed3a7b894c2628eda3d1dbddfac15fe47aea96d975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdk-pixbuf-lang \
gdk-pixbuf-lang-all \
locale(gdk-pixbuf:af) \
locale(gdk-pixbuf:ar) \
locale(gdk-pixbuf:as) \
locale(gdk-pixbuf:ast) \
locale(gdk-pixbuf:az) \
locale(gdk-pixbuf:be) \
locale(gdk-pixbuf:be@latin) \
locale(gdk-pixbuf:bg) \
locale(gdk-pixbuf:bn) \
locale(gdk-pixbuf:bn_IN) \
locale(gdk-pixbuf:br) \
locale(gdk-pixbuf:bs) \
locale(gdk-pixbuf:ca) \
locale(gdk-pixbuf:ca@valencia) \
locale(gdk-pixbuf:cs) \
locale(gdk-pixbuf:cy) \
locale(gdk-pixbuf:da) \
locale(gdk-pixbuf:de) \
locale(gdk-pixbuf:dz) \
locale(gdk-pixbuf:el) \
locale(gdk-pixbuf:en@shaw) \
locale(gdk-pixbuf:en_CA) \
locale(gdk-pixbuf:en_GB) \
locale(gdk-pixbuf:eo) \
locale(gdk-pixbuf:es) \
locale(gdk-pixbuf:et) \
locale(gdk-pixbuf:eu) \
locale(gdk-pixbuf:fa) \
locale(gdk-pixbuf:fi) \
locale(gdk-pixbuf:fr) \
locale(gdk-pixbuf:fur) \
locale(gdk-pixbuf:ga) \
locale(gdk-pixbuf:gl) \
locale(gdk-pixbuf:gu) \
locale(gdk-pixbuf:he) \
locale(gdk-pixbuf:hi) \
locale(gdk-pixbuf:hr) \
locale(gdk-pixbuf:hu) \
locale(gdk-pixbuf:ia) \
locale(gdk-pixbuf:id) \
locale(gdk-pixbuf:is) \
locale(gdk-pixbuf:it) \
locale(gdk-pixbuf:ja) \
locale(gdk-pixbuf:ka) \
locale(gdk-pixbuf:kk) \
locale(gdk-pixbuf:km) \
locale(gdk-pixbuf:kn) \
locale(gdk-pixbuf:ko) \
locale(gdk-pixbuf:lt) \
locale(gdk-pixbuf:lv) \
locale(gdk-pixbuf:mai) \
locale(gdk-pixbuf:mk) \
locale(gdk-pixbuf:ml) \
locale(gdk-pixbuf:mr) \
locale(gdk-pixbuf:ms) \
locale(gdk-pixbuf:nb) \
locale(gdk-pixbuf:nds) \
locale(gdk-pixbuf:ne) \
locale(gdk-pixbuf:nl) \
locale(gdk-pixbuf:nn) \
locale(gdk-pixbuf:oc) \
locale(gdk-pixbuf:or) \
locale(gdk-pixbuf:pa) \
locale(gdk-pixbuf:pl) \
locale(gdk-pixbuf:pt) \
locale(gdk-pixbuf:pt_BR) \
locale(gdk-pixbuf:ro) \
locale(gdk-pixbuf:ru) \
locale(gdk-pixbuf:si) \
locale(gdk-pixbuf:sk) \
locale(gdk-pixbuf:sl) \
locale(gdk-pixbuf:sq) \
locale(gdk-pixbuf:sr) \
locale(gdk-pixbuf:sr@ije) \
locale(gdk-pixbuf:sr@latin) \
locale(gdk-pixbuf:sv) \
locale(gdk-pixbuf:ta) \
locale(gdk-pixbuf:te) \
locale(gdk-pixbuf:th) \
locale(gdk-pixbuf:tr) \
locale(gdk-pixbuf:ug) \
locale(gdk-pixbuf:uk) \
locale(gdk-pixbuf:vi) \
locale(gdk-pixbuf:wa) \
locale(gdk-pixbuf:zh_CN) \
locale(gdk-pixbuf:zh_HK) \
locale(gdk-pixbuf:zh_TW)"
RDEPENDS:${PN} += "gdk-pixbuf"

inherit rpm
