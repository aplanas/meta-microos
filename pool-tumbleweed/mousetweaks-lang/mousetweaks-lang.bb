SUMMARY = "Translations for package mousetweaks"
DESCRIPTION = "Provides translations for the 'mousetweaks' package."
LICENSE = "GPL-3.0-only"

PV = "3.32.0"

RPM_NAME = "mousetweaks-lang-3.32.0-3.8.noarch.rpm"
RPM_HASH = "bfe4c3789bef4f6d317cd77150e92db0a260609470a7414f8ee84e7175ebf31451202bbf774c7891e17b3149d04c6a39148c4ac9a63583a338b6d9e5c97f8374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mousetweaks:ar) \
locale(mousetweaks:as) \
locale(mousetweaks:ast) \
locale(mousetweaks:be) \
locale(mousetweaks:bg) \
locale(mousetweaks:bn) \
locale(mousetweaks:bn_IN) \
locale(mousetweaks:bs) \
locale(mousetweaks:ca) \
locale(mousetweaks:ca@valencia) \
locale(mousetweaks:cs) \
locale(mousetweaks:da) \
locale(mousetweaks:de) \
locale(mousetweaks:el) \
locale(mousetweaks:en@shaw) \
locale(mousetweaks:en_GB) \
locale(mousetweaks:eo) \
locale(mousetweaks:es) \
locale(mousetweaks:et) \
locale(mousetweaks:eu) \
locale(mousetweaks:fa) \
locale(mousetweaks:fi) \
locale(mousetweaks:fr) \
locale(mousetweaks:fur) \
locale(mousetweaks:gd) \
locale(mousetweaks:gl) \
locale(mousetweaks:gu) \
locale(mousetweaks:he) \
locale(mousetweaks:hi) \
locale(mousetweaks:hr) \
locale(mousetweaks:hu) \
locale(mousetweaks:id) \
locale(mousetweaks:is) \
locale(mousetweaks:it) \
locale(mousetweaks:ja) \
locale(mousetweaks:kk) \
locale(mousetweaks:kn) \
locale(mousetweaks:ko) \
locale(mousetweaks:lt) \
locale(mousetweaks:lv) \
locale(mousetweaks:mai) \
locale(mousetweaks:mk) \
locale(mousetweaks:ml) \
locale(mousetweaks:mr) \
locale(mousetweaks:nb) \
locale(mousetweaks:ne) \
locale(mousetweaks:nl) \
locale(mousetweaks:nn) \
locale(mousetweaks:oc) \
locale(mousetweaks:or) \
locale(mousetweaks:pa) \
locale(mousetweaks:pl) \
locale(mousetweaks:pt) \
locale(mousetweaks:pt_BR) \
locale(mousetweaks:ro) \
locale(mousetweaks:ru) \
locale(mousetweaks:sk) \
locale(mousetweaks:sl) \
locale(mousetweaks:sq) \
locale(mousetweaks:sr) \
locale(mousetweaks:sr@latin) \
locale(mousetweaks:sv) \
locale(mousetweaks:ta) \
locale(mousetweaks:te) \
locale(mousetweaks:th) \
locale(mousetweaks:tr) \
locale(mousetweaks:ug) \
locale(mousetweaks:uk) \
locale(mousetweaks:vi) \
locale(mousetweaks:zh_CN) \
locale(mousetweaks:zh_HK) \
locale(mousetweaks:zh_TW) \
mousetweaks-lang \
mousetweaks-lang-all"

RDEPENDS:${PN} += "mousetweaks"

inherit rpm
