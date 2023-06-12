SUMMARY = "Translations for package atomix"
DESCRIPTION = "Provides translations for the 'atomix' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "atomix-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "6e6a714d3a1751deaccea76585b337249c2bc0d35019f873bad8264cd51b4c573f1e289c247b77ca4145733cd086fab94924d3d4373b6b77f5f19f23fa9d1d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atomix-lang \
atomix-lang-all \
locale(atomix:af) \
locale(atomix:ar) \
locale(atomix:az) \
locale(atomix:be) \
locale(atomix:bg) \
locale(atomix:bn) \
locale(atomix:bs) \
locale(atomix:ca) \
locale(atomix:cs) \
locale(atomix:da) \
locale(atomix:de) \
locale(atomix:dz) \
locale(atomix:el) \
locale(atomix:en_CA) \
locale(atomix:en_GB) \
locale(atomix:eo) \
locale(atomix:es) \
locale(atomix:et) \
locale(atomix:eu) \
locale(atomix:fa) \
locale(atomix:fi) \
locale(atomix:fr) \
locale(atomix:fur) \
locale(atomix:ga) \
locale(atomix:gl) \
locale(atomix:gu) \
locale(atomix:he) \
locale(atomix:hi) \
locale(atomix:hu) \
locale(atomix:id) \
locale(atomix:is) \
locale(atomix:it) \
locale(atomix:ja) \
locale(atomix:ka) \
locale(atomix:kn) \
locale(atomix:ko) \
locale(atomix:lt) \
locale(atomix:lv) \
locale(atomix:mk) \
locale(atomix:ml) \
locale(atomix:ms) \
locale(atomix:nb) \
locale(atomix:ne) \
locale(atomix:nl) \
locale(atomix:oc) \
locale(atomix:pa) \
locale(atomix:pl) \
locale(atomix:pt) \
locale(atomix:pt_BR) \
locale(atomix:ro) \
locale(atomix:ru) \
locale(atomix:sk) \
locale(atomix:sl) \
locale(atomix:sq) \
locale(atomix:sr) \
locale(atomix:sr@latin) \
locale(atomix:sv) \
locale(atomix:ta) \
locale(atomix:th) \
locale(atomix:tr) \
locale(atomix:uk) \
locale(atomix:vi) \
locale(atomix:wa) \
locale(atomix:zh_CN) \
locale(atomix:zh_HK) \
locale(atomix:zh_TW)"
RDEPENDS:${PN} += "atomix"

inherit rpm
