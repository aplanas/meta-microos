SUMMARY = "Translations for package anjuta"
DESCRIPTION = "Provides translations for the 'anjuta' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "anjuta-lang-3.34.0-5.7.noarch.rpm"
RPM_HASH = "c4f785c696b25926b3d331bd1a76adee2775857066cf0fd9a9a1717c7dfbbad1afa08a29bebcf89df4bc85afbe3a9b6b4670c16c60cb5a03be8c2f9828ca4682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "anjuta-lang \
anjuta-lang-all \
locale(anjuta:ar) \
locale(anjuta:ast) \
locale(anjuta:az) \
locale(anjuta:be@latin) \
locale(anjuta:bg) \
locale(anjuta:bs) \
locale(anjuta:ca) \
locale(anjuta:ca@valencia) \
locale(anjuta:cs) \
locale(anjuta:da) \
locale(anjuta:de) \
locale(anjuta:dz) \
locale(anjuta:el) \
locale(anjuta:en@shaw) \
locale(anjuta:en_CA) \
locale(anjuta:en_GB) \
locale(anjuta:eo) \
locale(anjuta:es) \
locale(anjuta:eu) \
locale(anjuta:fi) \
locale(anjuta:fr) \
locale(anjuta:fur) \
locale(anjuta:ga) \
locale(anjuta:gl) \
locale(anjuta:gu) \
locale(anjuta:he) \
locale(anjuta:hi) \
locale(anjuta:hr) \
locale(anjuta:hu) \
locale(anjuta:id) \
locale(anjuta:it) \
locale(anjuta:ja) \
locale(anjuta:kk) \
locale(anjuta:km) \
locale(anjuta:kn) \
locale(anjuta:ko) \
locale(anjuta:lt) \
locale(anjuta:lv) \
locale(anjuta:mai) \
locale(anjuta:mk) \
locale(anjuta:ml) \
locale(anjuta:mr) \
locale(anjuta:ms) \
locale(anjuta:nb) \
locale(anjuta:ne) \
locale(anjuta:nl) \
locale(anjuta:oc) \
locale(anjuta:or) \
locale(anjuta:pa) \
locale(anjuta:pl) \
locale(anjuta:pt) \
locale(anjuta:pt_BR) \
locale(anjuta:ro) \
locale(anjuta:ru) \
locale(anjuta:si) \
locale(anjuta:sk) \
locale(anjuta:sl) \
locale(anjuta:sq) \
locale(anjuta:sr) \
locale(anjuta:sr@latin) \
locale(anjuta:sv) \
locale(anjuta:te) \
locale(anjuta:th) \
locale(anjuta:tr) \
locale(anjuta:ug) \
locale(anjuta:uk) \
locale(anjuta:vi) \
locale(anjuta:zh_CN) \
locale(anjuta:zh_HK) \
locale(anjuta:zh_TW)"
RDEPENDS:${PN} += "anjuta"

inherit rpm
