SUMMARY = "Languages for package tumbler"
DESCRIPTION = "Provides translations to the package tumbler"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-lang-4.18.1-1.1.noarch.rpm"
RPM_HASH = "8b3b0fff4b08204c8682ca115b09c233c51c948f3eeb4405b35f27ddb49cd4d94c30a784ffd8209f2d888fb1d59bcce46514e677e9600f7e0ad2ad2ab73a953d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tumbler:ar) \
locale(tumbler:be) \
locale(tumbler:bg) \
locale(tumbler:bn) \
locale(tumbler:ca) \
locale(tumbler:cs) \
locale(tumbler:da) \
locale(tumbler:de) \
locale(tumbler:el) \
locale(tumbler:en_AU) \
locale(tumbler:en_CA) \
locale(tumbler:en_GB) \
locale(tumbler:es) \
locale(tumbler:et) \
locale(tumbler:eu) \
locale(tumbler:fi) \
locale(tumbler:fr) \
locale(tumbler:gl) \
locale(tumbler:he) \
locale(tumbler:hi) \
locale(tumbler:hr) \
locale(tumbler:hu) \
locale(tumbler:id) \
locale(tumbler:is) \
locale(tumbler:it) \
locale(tumbler:ja) \
locale(tumbler:ko) \
locale(tumbler:lt) \
locale(tumbler:lv) \
locale(tumbler:ms) \
locale(tumbler:nb) \
locale(tumbler:nl) \
locale(tumbler:nn) \
locale(tumbler:oc) \
locale(tumbler:pa) \
locale(tumbler:pl) \
locale(tumbler:pt) \
locale(tumbler:pt_BR) \
locale(tumbler:ro) \
locale(tumbler:ru) \
locale(tumbler:si) \
locale(tumbler:sk) \
locale(tumbler:sl) \
locale(tumbler:sq) \
locale(tumbler:sr) \
locale(tumbler:sv) \
locale(tumbler:te) \
locale(tumbler:th) \
locale(tumbler:tr) \
locale(tumbler:ug) \
locale(tumbler:uk) \
locale(tumbler:zh_CN) \
locale(tumbler:zh_HK) \
locale(tumbler:zh_TW) \
tumbler-lang \
tumbler-lang-all"
RDEPENDS:${PN} += "libtumbler-1-0"

inherit rpm
