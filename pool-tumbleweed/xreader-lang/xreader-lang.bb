SUMMARY = "Translations for package xreader"
DESCRIPTION = "Provides translations for the 'xreader' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-lang-3.4.5-1.4.noarch.rpm"
RPM_HASH = "572d77bc2211c13c844c9a1a85e3c7eaace349b9634962034d10ff6b6095914e94c481851444e34ebf099e8c6be9804bd15cc229f5c82763ea991a14d65cf8f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xreader:af) \
locale(xreader:ar) \
locale(xreader:as) \
locale(xreader:ast) \
locale(xreader:az) \
locale(xreader:be) \
locale(xreader:be@latin) \
locale(xreader:bg) \
locale(xreader:bn) \
locale(xreader:bn_IN) \
locale(xreader:br) \
locale(xreader:ca) \
locale(xreader:ca@valencia) \
locale(xreader:cs) \
locale(xreader:cy) \
locale(xreader:da) \
locale(xreader:de) \
locale(xreader:dz) \
locale(xreader:el) \
locale(xreader:en@shaw) \
locale(xreader:en_AU) \
locale(xreader:en_CA) \
locale(xreader:en_GB) \
locale(xreader:eo) \
locale(xreader:es) \
locale(xreader:es_CO) \
locale(xreader:es_VE) \
locale(xreader:et) \
locale(xreader:eu) \
locale(xreader:fa) \
locale(xreader:fi) \
locale(xreader:fr) \
locale(xreader:fr_CA) \
locale(xreader:ga) \
locale(xreader:gl) \
locale(xreader:gu) \
locale(xreader:he) \
locale(xreader:hi) \
locale(xreader:hr) \
locale(xreader:hu) \
locale(xreader:ia) \
locale(xreader:id) \
locale(xreader:is) \
locale(xreader:it) \
locale(xreader:ja) \
locale(xreader:ka) \
locale(xreader:kk) \
locale(xreader:kn) \
locale(xreader:ko) \
locale(xreader:lt) \
locale(xreader:lv) \
locale(xreader:mai) \
locale(xreader:mk) \
locale(xreader:ml) \
locale(xreader:mr) \
locale(xreader:ms) \
locale(xreader:nb) \
locale(xreader:nds) \
locale(xreader:ne) \
locale(xreader:nl) \
locale(xreader:nn) \
locale(xreader:oc) \
locale(xreader:or) \
locale(xreader:pa) \
locale(xreader:pl) \
locale(xreader:pt) \
locale(xreader:pt_BR) \
locale(xreader:ro) \
locale(xreader:ru) \
locale(xreader:si) \
locale(xreader:sk) \
locale(xreader:sl) \
locale(xreader:sq) \
locale(xreader:sr) \
locale(xreader:sr@latin) \
locale(xreader:sv) \
locale(xreader:ta) \
locale(xreader:te) \
locale(xreader:th) \
locale(xreader:tr) \
locale(xreader:uk) \
locale(xreader:vi) \
locale(xreader:wa) \
locale(xreader:zh_CN) \
locale(xreader:zh_HK) \
locale(xreader:zh_TW) \
xreader-lang \
xreader-lang-all"

RDEPENDS:${PN} += "xreader"

inherit rpm
