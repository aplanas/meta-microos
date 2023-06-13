SUMMARY = "Translations for package pipewire"
DESCRIPTION = "Provides translations for the 'pipewire' package."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-lang-0.3.71-3.1.noarch.rpm"
RPM_HASH = "785d7bf127059f735560dd02b18bc3a1eb8d5798935640077fb9be5723dc2b842479701bce0bb287318fe6aecc4197ca1336115e844863dcb5727b4f2a13fa83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pipewire:af) \
locale(pipewire:as) \
locale(pipewire:be) \
locale(pipewire:bg) \
locale(pipewire:bn_IN) \
locale(pipewire:ca) \
locale(pipewire:cs) \
locale(pipewire:da) \
locale(pipewire:de) \
locale(pipewire:de_CH) \
locale(pipewire:el) \
locale(pipewire:eo) \
locale(pipewire:es) \
locale(pipewire:fi) \
locale(pipewire:fr) \
locale(pipewire:gl) \
locale(pipewire:gu) \
locale(pipewire:he) \
locale(pipewire:hi) \
locale(pipewire:hr) \
locale(pipewire:hu) \
locale(pipewire:id) \
locale(pipewire:it) \
locale(pipewire:ja) \
locale(pipewire:ka) \
locale(pipewire:kk) \
locale(pipewire:kn) \
locale(pipewire:ko) \
locale(pipewire:lt) \
locale(pipewire:ml) \
locale(pipewire:mr) \
locale(pipewire:nl) \
locale(pipewire:nn) \
locale(pipewire:oc) \
locale(pipewire:or) \
locale(pipewire:pa) \
locale(pipewire:pl) \
locale(pipewire:pt) \
locale(pipewire:pt_BR) \
locale(pipewire:ro) \
locale(pipewire:ru) \
locale(pipewire:si) \
locale(pipewire:sk) \
locale(pipewire:sr) \
locale(pipewire:sr@latin) \
locale(pipewire:sv) \
locale(pipewire:ta) \
locale(pipewire:te) \
locale(pipewire:tr) \
locale(pipewire:uk) \
locale(pipewire:zh_CN) \
locale(pipewire:zh_TW) \
pipewire-lang \
pipewire-lang-all"

RDEPENDS:${PN} += "pipewire"

inherit rpm
