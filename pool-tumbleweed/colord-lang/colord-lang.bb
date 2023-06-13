SUMMARY = "Translations for package colord"
DESCRIPTION = "Provides translations for the 'colord' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-lang-1.4.6-2.3.noarch.rpm"
RPM_HASH = "0ae186985f62b70644339eca79e3dcf76efc7e82988b255435b18cf208e1ba531c730a46e09a9336dd3606c5a1fa7f18eba9729173671dd0e3faab3bb7949822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-lang \
colord-lang-all \
locale(colord:as) \
locale(colord:bn_IN) \
locale(colord:ca) \
locale(colord:cs) \
locale(colord:da) \
locale(colord:de) \
locale(colord:el) \
locale(colord:en_GB) \
locale(colord:eo) \
locale(colord:es) \
locale(colord:eu) \
locale(colord:fi) \
locale(colord:fr) \
locale(colord:fur) \
locale(colord:gl) \
locale(colord:gu) \
locale(colord:he) \
locale(colord:hi) \
locale(colord:hr) \
locale(colord:hu) \
locale(colord:id) \
locale(colord:is) \
locale(colord:it) \
locale(colord:ja) \
locale(colord:kk) \
locale(colord:kn) \
locale(colord:ko) \
locale(colord:lt) \
locale(colord:lv) \
locale(colord:ml) \
locale(colord:mr) \
locale(colord:nb) \
locale(colord:nl) \
locale(colord:oc) \
locale(colord:or) \
locale(colord:pa) \
locale(colord:pl) \
locale(colord:pt) \
locale(colord:pt_BR) \
locale(colord:ro) \
locale(colord:ru) \
locale(colord:sk) \
locale(colord:sl) \
locale(colord:sr) \
locale(colord:sr@latin) \
locale(colord:sv) \
locale(colord:ta) \
locale(colord:th) \
locale(colord:tr) \
locale(colord:uk) \
locale(colord:zh_CN) \
locale(colord:zh_TW)"

RDEPENDS:${PN} += "colord"

inherit rpm
