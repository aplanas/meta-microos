SUMMARY = "Translations for package eog-plugins"
DESCRIPTION = "Provides translations for the 'eog-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugins-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "8f61dc00e682f01e0cedd48d4cc9b5f80d215d400c3b78745caffcce3c0b39598756e5804f9c824a33394b4fab3559af4753aa7889c409585a722cb4aa834641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-plugins-lang \
eog-plugins-lang-all \
locale(eog-plugins:ar) \
locale(eog-plugins:as) \
locale(eog-plugins:be) \
locale(eog-plugins:be@latin) \
locale(eog-plugins:bg) \
locale(eog-plugins:bn_IN) \
locale(eog-plugins:bs) \
locale(eog-plugins:ca) \
locale(eog-plugins:ca@valencia) \
locale(eog-plugins:cs) \
locale(eog-plugins:da) \
locale(eog-plugins:de) \
locale(eog-plugins:el) \
locale(eog-plugins:en_GB) \
locale(eog-plugins:es) \
locale(eog-plugins:eu) \
locale(eog-plugins:fi) \
locale(eog-plugins:fr) \
locale(eog-plugins:fur) \
locale(eog-plugins:gl) \
locale(eog-plugins:gu) \
locale(eog-plugins:he) \
locale(eog-plugins:hr) \
locale(eog-plugins:hu) \
locale(eog-plugins:id) \
locale(eog-plugins:is) \
locale(eog-plugins:it) \
locale(eog-plugins:ja) \
locale(eog-plugins:ka) \
locale(eog-plugins:kn) \
locale(eog-plugins:ko) \
locale(eog-plugins:lt) \
locale(eog-plugins:lv) \
locale(eog-plugins:mk) \
locale(eog-plugins:ml) \
locale(eog-plugins:mr) \
locale(eog-plugins:nb) \
locale(eog-plugins:nl) \
locale(eog-plugins:oc) \
locale(eog-plugins:or) \
locale(eog-plugins:pa) \
locale(eog-plugins:pl) \
locale(eog-plugins:pt) \
locale(eog-plugins:pt_BR) \
locale(eog-plugins:ro) \
locale(eog-plugins:ru) \
locale(eog-plugins:sk) \
locale(eog-plugins:sl) \
locale(eog-plugins:sq) \
locale(eog-plugins:sr) \
locale(eog-plugins:sr@latin) \
locale(eog-plugins:sv) \
locale(eog-plugins:ta) \
locale(eog-plugins:te) \
locale(eog-plugins:tr) \
locale(eog-plugins:uk) \
locale(eog-plugins:vi) \
locale(eog-plugins:zh_CN) \
locale(eog-plugins:zh_HK) \
locale(eog-plugins:zh_TW)"

RDEPENDS:${PN} += "eog-plugins"

inherit rpm
