SUMMARY = "Translations for package balsa"
DESCRIPTION = "Provides translations for the 'balsa' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "balsa-lang-2.6.4-2.3.noarch.rpm"
RPM_HASH = "f283ed14b9fd9e04a65bc30aaccfa404b32e882c470368584068443966c3227d54429ed36064b2731c78222a47234b48bf26b082968c3bc8c74b0f44de55dfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "balsa-lang \
balsa-lang-all \
locale(balsa:ar) \
locale(balsa:az) \
locale(balsa:bg) \
locale(balsa:ca) \
locale(balsa:cs) \
locale(balsa:da) \
locale(balsa:de) \
locale(balsa:dz) \
locale(balsa:el) \
locale(balsa:en_CA) \
locale(balsa:en_GB) \
locale(balsa:es) \
locale(balsa:et) \
locale(balsa:eu) \
locale(balsa:fi) \
locale(balsa:fr) \
locale(balsa:ga) \
locale(balsa:gl) \
locale(balsa:he) \
locale(balsa:hi) \
locale(balsa:hr) \
locale(balsa:hu) \
locale(balsa:id) \
locale(balsa:it) \
locale(balsa:ja) \
locale(balsa:ka) \
locale(balsa:ko) \
locale(balsa:lt) \
locale(balsa:lv) \
locale(balsa:mk) \
locale(balsa:ml) \
locale(balsa:ms) \
locale(balsa:nb) \
locale(balsa:ne) \
locale(balsa:nl) \
locale(balsa:nn) \
locale(balsa:oc) \
locale(balsa:pa) \
locale(balsa:pl) \
locale(balsa:pt) \
locale(balsa:pt_BR) \
locale(balsa:ro) \
locale(balsa:ru) \
locale(balsa:sk) \
locale(balsa:sl) \
locale(balsa:sq) \
locale(balsa:sr) \
locale(balsa:sr@latin) \
locale(balsa:sv) \
locale(balsa:tr) \
locale(balsa:uk) \
locale(balsa:vi) \
locale(balsa:wa) \
locale(balsa:zh_CN) \
locale(balsa:zh_HK) \
locale(balsa:zh_TW)"
RDEPENDS:${PN} += "balsa"

inherit rpm
