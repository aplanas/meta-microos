SUMMARY = "Translations for package pcmanfm"
DESCRIPTION = "Provides translations for the 'pcmanfm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "pcmanfm-lang-1.3.2-2.7.noarch.rpm"
RPM_HASH = "519ad82da06c3e0dfd78e836c3a83c103c84a7cf750ea9612943db72c1a80cd2e38adfe429c87e5fd95394551f9a1d6b56718865542ce81963e25ce9b7984562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pcmanfm:ar) \
locale(pcmanfm:be) \
locale(pcmanfm:bg) \
locale(pcmanfm:bn) \
locale(pcmanfm:ca) \
locale(pcmanfm:cs) \
locale(pcmanfm:da) \
locale(pcmanfm:de) \
locale(pcmanfm:el) \
locale(pcmanfm:en_GB) \
locale(pcmanfm:es) \
locale(pcmanfm:et) \
locale(pcmanfm:eu) \
locale(pcmanfm:fa) \
locale(pcmanfm:fi) \
locale(pcmanfm:fr) \
locale(pcmanfm:gl) \
locale(pcmanfm:he) \
locale(pcmanfm:hr) \
locale(pcmanfm:hu) \
locale(pcmanfm:id) \
locale(pcmanfm:is) \
locale(pcmanfm:it) \
locale(pcmanfm:ja) \
locale(pcmanfm:kk) \
locale(pcmanfm:km) \
locale(pcmanfm:ko) \
locale(pcmanfm:lt) \
locale(pcmanfm:lv) \
locale(pcmanfm:ms) \
locale(pcmanfm:nl) \
locale(pcmanfm:pa) \
locale(pcmanfm:pl) \
locale(pcmanfm:pt) \
locale(pcmanfm:pt_BR) \
locale(pcmanfm:ro) \
locale(pcmanfm:ru) \
locale(pcmanfm:si) \
locale(pcmanfm:sk) \
locale(pcmanfm:sl) \
locale(pcmanfm:sr) \
locale(pcmanfm:sr@latin) \
locale(pcmanfm:sv) \
locale(pcmanfm:te) \
locale(pcmanfm:th) \
locale(pcmanfm:tr) \
locale(pcmanfm:ug) \
locale(pcmanfm:uk) \
locale(pcmanfm:vi) \
locale(pcmanfm:zh_CN) \
locale(pcmanfm:zh_TW) \
pcmanfm-lang \
pcmanfm-lang-all"
RDEPENDS:${PN} += "pcmanfm"

inherit rpm
