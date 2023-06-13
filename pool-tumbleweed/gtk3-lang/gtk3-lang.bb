SUMMARY = "Translations for package gtk3"
DESCRIPTION = "Provides translations for the 'gtk3' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-lang-3.24.38-1.1.noarch.rpm"
RPM_HASH = "486f29967e5f219eef1f6608cee030f60ef2c2544f8c238f24977edb17f168965757b90cf9727f5c39e738202eccc2b65575115760cc33b786d29235bee3e69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-lang \
gtk3-lang-all \
locale(gtk3:af) \
locale(gtk3:ar) \
locale(gtk3:as) \
locale(gtk3:ast) \
locale(gtk3:az) \
locale(gtk3:be) \
locale(gtk3:be@latin) \
locale(gtk3:bg) \
locale(gtk3:bn) \
locale(gtk3:bn_IN) \
locale(gtk3:br) \
locale(gtk3:bs) \
locale(gtk3:ca) \
locale(gtk3:ca@valencia) \
locale(gtk3:cs) \
locale(gtk3:cy) \
locale(gtk3:da) \
locale(gtk3:de) \
locale(gtk3:dz) \
locale(gtk3:el) \
locale(gtk3:en@shaw) \
locale(gtk3:en_CA) \
locale(gtk3:en_GB) \
locale(gtk3:eo) \
locale(gtk3:es) \
locale(gtk3:et) \
locale(gtk3:eu) \
locale(gtk3:fa) \
locale(gtk3:fi) \
locale(gtk3:fr) \
locale(gtk3:fur) \
locale(gtk3:ga) \
locale(gtk3:gd) \
locale(gtk3:gl) \
locale(gtk3:gu) \
locale(gtk3:he) \
locale(gtk3:hi) \
locale(gtk3:hr) \
locale(gtk3:hu) \
locale(gtk3:ia) \
locale(gtk3:id) \
locale(gtk3:is) \
locale(gtk3:it) \
locale(gtk3:ja) \
locale(gtk3:ka) \
locale(gtk3:kk) \
locale(gtk3:km) \
locale(gtk3:kn) \
locale(gtk3:ko) \
locale(gtk3:lt) \
locale(gtk3:lv) \
locale(gtk3:mai) \
locale(gtk3:mk) \
locale(gtk3:ml) \
locale(gtk3:mr) \
locale(gtk3:ms) \
locale(gtk3:nb) \
locale(gtk3:nds) \
locale(gtk3:ne) \
locale(gtk3:nl) \
locale(gtk3:nn) \
locale(gtk3:oc) \
locale(gtk3:or) \
locale(gtk3:pa) \
locale(gtk3:pl) \
locale(gtk3:pt) \
locale(gtk3:pt_BR) \
locale(gtk3:ro) \
locale(gtk3:ru) \
locale(gtk3:si) \
locale(gtk3:sk) \
locale(gtk3:sl) \
locale(gtk3:sq) \
locale(gtk3:sr) \
locale(gtk3:sr@ije) \
locale(gtk3:sr@latin) \
locale(gtk3:sv) \
locale(gtk3:ta) \
locale(gtk3:te) \
locale(gtk3:th) \
locale(gtk3:tr) \
locale(gtk3:ug) \
locale(gtk3:uk) \
locale(gtk3:vi) \
locale(gtk3:wa) \
locale(gtk3:zh_CN) \
locale(gtk3:zh_HK) \
locale(gtk3:zh_TW)"

RDEPENDS:${PN} += "gtk3"

inherit rpm
