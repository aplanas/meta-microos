SUMMARY = "Translations for package colorhug-client"
DESCRIPTION = "Provides translations for the 'colorhug-client' package."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "colorhug-client-lang-0.2.8-1.26.noarch.rpm"
RPM_HASH = "85ae71d8c0b911132e1f93af4906d65e7a5c90ed9c2c37baf42749d57aa89b4833a99b6839492162d95134f37f68413f73a8f963cd59ed63b8ec9a2fd3ec8e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colorhug-client-lang \
colorhug-client-lang-all \
locale(colorhug-client:cs_CZ) \
locale(colorhug-client:da) \
locale(colorhug-client:de) \
locale(colorhug-client:de_DE) \
locale(colorhug-client:el_GR) \
locale(colorhug-client:en_GB) \
locale(colorhug-client:en_US) \
locale(colorhug-client:es_ES) \
locale(colorhug-client:et) \
locale(colorhug-client:fa) \
locale(colorhug-client:fi) \
locale(colorhug-client:fr_FR) \
locale(colorhug-client:hu) \
locale(colorhug-client:it_IT) \
locale(colorhug-client:lv) \
locale(colorhug-client:nb) \
locale(colorhug-client:nn) \
locale(colorhug-client:pl) \
locale(colorhug-client:pl_PL) \
locale(colorhug-client:pt) \
locale(colorhug-client:pt_BR) \
locale(colorhug-client:pt_PT) \
locale(colorhug-client:ro) \
locale(colorhug-client:ru) \
locale(colorhug-client:sr) \
locale(colorhug-client:sv) \
locale(colorhug-client:tr) \
locale(colorhug-client:uk) \
locale(colorhug-client:zh_TW)"

RDEPENDS:${PN} += "colorhug-client"

inherit rpm
