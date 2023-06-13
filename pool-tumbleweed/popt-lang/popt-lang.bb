SUMMARY = "Translations for package popt"
DESCRIPTION = "Provides translations for the 'popt' package."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "popt-lang-1.19-1.3.noarch.rpm"
RPM_HASH = "0e93e47c7219d863e709b9d557c5b7a6eee723524b82375b7ef399ef6d33d8fdaa900923c95bd8fe7ef33e1aa19ca8da73c5ec83c453ea6974ce841f30cffa36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(popt:ca) \
locale(popt:cs) \
locale(popt:da) \
locale(popt:de) \
locale(popt:eo) \
locale(popt:es) \
locale(popt:fi) \
locale(popt:fr) \
locale(popt:ga) \
locale(popt:gl) \
locale(popt:hu) \
locale(popt:id) \
locale(popt:is) \
locale(popt:it) \
locale(popt:ja) \
locale(popt:ka) \
locale(popt:ko) \
locale(popt:lv) \
locale(popt:nb) \
locale(popt:nl) \
locale(popt:pl) \
locale(popt:pt) \
locale(popt:pt_BR) \
locale(popt:ro) \
locale(popt:ru) \
locale(popt:si) \
locale(popt:sk) \
locale(popt:sl) \
locale(popt:sv) \
locale(popt:th) \
locale(popt:tr) \
locale(popt:uk) \
locale(popt:vi) \
locale(popt:wa) \
locale(popt:zh_CN) \
locale(popt:zh_TW) \
popt-lang \
popt-lang-all"

RDEPENDS:${PN} += "popt"

inherit rpm
