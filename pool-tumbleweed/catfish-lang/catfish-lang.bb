SUMMARY = "Translations for package catfish"
DESCRIPTION = "Provides translations for the 'catfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.4"

RPM_NAME = "catfish-lang-4.16.4-1.3.noarch.rpm"
RPM_HASH = "1c58a00b149f2d45cce689ef62282ea58ff37c7f469410d3bee3f866a6514158293fd655c14a9083bc5c722cb8940453e2c9eb958de7f946707ab1af5273a564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish-lang \
catfish-lang-all \
locale(catfish:af) \
locale(catfish:ar) \
locale(catfish:be) \
locale(catfish:bg) \
locale(catfish:ca) \
locale(catfish:cs) \
locale(catfish:da) \
locale(catfish:de) \
locale(catfish:el) \
locale(catfish:en_AU) \
locale(catfish:eo) \
locale(catfish:es) \
locale(catfish:et) \
locale(catfish:eu) \
locale(catfish:fi) \
locale(catfish:fr) \
locale(catfish:gl) \
locale(catfish:he) \
locale(catfish:hr) \
locale(catfish:hu) \
locale(catfish:id) \
locale(catfish:is) \
locale(catfish:it) \
locale(catfish:ja) \
locale(catfish:ko) \
locale(catfish:lt) \
locale(catfish:lv) \
locale(catfish:ml) \
locale(catfish:ms) \
locale(catfish:nb) \
locale(catfish:nl) \
locale(catfish:nn) \
locale(catfish:pl) \
locale(catfish:pt) \
locale(catfish:pt_BR) \
locale(catfish:ru) \
locale(catfish:si) \
locale(catfish:sk) \
locale(catfish:sl) \
locale(catfish:sq) \
locale(catfish:sr) \
locale(catfish:sv) \
locale(catfish:th) \
locale(catfish:tr) \
locale(catfish:uk) \
locale(catfish:zh_CN) \
locale(catfish:zh_TW)"

RDEPENDS:${PN} += "catfish"

inherit rpm
