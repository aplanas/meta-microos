SUMMARY = "Translations for package manaplus"
DESCRIPTION = "Provides translations for the 'manaplus' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.3.17"

RPM_NAME = "manaplus-lang-2.1.3.17-3.1.noarch.rpm"
RPM_HASH = "511b18c77e6351e4dc03bcb7b61f53069c4253545870985d3cf82bc580305fc83a581c54737baf3077c700a0f3f3de6b6fd5bbb596e3202e19a6edcef988c37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(manaplus:ca) \
locale(manaplus:cs) \
locale(manaplus:de) \
locale(manaplus:eo) \
locale(manaplus:es) \
locale(manaplus:fi) \
locale(manaplus:fr) \
locale(manaplus:id) \
locale(manaplus:it) \
locale(manaplus:ja) \
locale(manaplus:nl) \
locale(manaplus:nl_BE) \
locale(manaplus:pl) \
locale(manaplus:pt) \
locale(manaplus:pt_BR) \
locale(manaplus:ru) \
locale(manaplus:sr) \
locale(manaplus:sv) \
locale(manaplus:tr) \
locale(manaplus:uk) \
locale(manaplus:zh_CN) \
locale(manaplus:zh_HK) \
manaplus-lang \
manaplus-lang-all"

RDEPENDS:${PN} += "manaplus"

inherit rpm
