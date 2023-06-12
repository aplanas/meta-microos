SUMMARY = "Translations for package lollypop"
DESCRIPTION = "Provides translations for the 'lollypop' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.37"

RPM_NAME = "lollypop-lang-1.4.37-1.2.noarch.rpm"
RPM_HASH = "8bdb68d299c6a949c716a1b61201adc56a78c4d67df0b7ba1fcf6b61847cf8a4ae0edcfaa567be524811c2a5164351c1cb606ad726f4ad5ad5d187dc3196c3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lollypop:ar) \
locale(lollypop:bg) \
locale(lollypop:bn) \
locale(lollypop:ca) \
locale(lollypop:cs) \
locale(lollypop:da) \
locale(lollypop:de) \
locale(lollypop:el) \
locale(lollypop:en_GB) \
locale(lollypop:eo) \
locale(lollypop:es) \
locale(lollypop:es_EC) \
locale(lollypop:eu) \
locale(lollypop:fa) \
locale(lollypop:fi) \
locale(lollypop:fr) \
locale(lollypop:ga) \
locale(lollypop:gl) \
locale(lollypop:he) \
locale(lollypop:hr) \
locale(lollypop:hu) \
locale(lollypop:id) \
locale(lollypop:it) \
locale(lollypop:ja) \
locale(lollypop:ka) \
locale(lollypop:ko) \
locale(lollypop:lt) \
locale(lollypop:nb_NO) \
locale(lollypop:nl) \
locale(lollypop:nl_BE) \
locale(lollypop:pl) \
locale(lollypop:pt) \
locale(lollypop:pt_BR) \
locale(lollypop:pt_PT) \
locale(lollypop:ro) \
locale(lollypop:ru) \
locale(lollypop:sk) \
locale(lollypop:sr) \
locale(lollypop:sr@latin) \
locale(lollypop:sv) \
locale(lollypop:tr) \
locale(lollypop:uk) \
locale(lollypop:zh_CN) \
locale(lollypop:zh_Hant) \
lollypop-lang \
lollypop-lang-all"
RDEPENDS:${PN} += "lollypop"

inherit rpm
