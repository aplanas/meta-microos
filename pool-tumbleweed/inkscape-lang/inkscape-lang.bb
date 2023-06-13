SUMMARY = "Translations for package inkscape"
DESCRIPTION = "Provides translations for the 'inkscape' package."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-lang-1.2.2-3.1.noarch.rpm"
RPM_HASH = "8343fbc84a1b750a4226467214972bf9270cb96247f59ebd2153c352bceafd8ecf147389d01466fd024ef631a23b2a8db7b0db875908ea5ead3a29652d226615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inkscape-lang \
inkscape-lang-all \
locale(inkscape:ar) \
locale(inkscape:as) \
locale(inkscape:az) \
locale(inkscape:be) \
locale(inkscape:bg) \
locale(inkscape:bn) \
locale(inkscape:br) \
locale(inkscape:ca) \
locale(inkscape:ca@valencia) \
locale(inkscape:cs) \
locale(inkscape:da) \
locale(inkscape:de) \
locale(inkscape:dz) \
locale(inkscape:el) \
locale(inkscape:en_AU) \
locale(inkscape:en_CA) \
locale(inkscape:en_GB) \
locale(inkscape:eo) \
locale(inkscape:es) \
locale(inkscape:es_MX) \
locale(inkscape:et) \
locale(inkscape:eu) \
locale(inkscape:fa) \
locale(inkscape:fi) \
locale(inkscape:fr) \
locale(inkscape:ga) \
locale(inkscape:gl) \
locale(inkscape:gu) \
locale(inkscape:he) \
locale(inkscape:hi) \
locale(inkscape:hr) \
locale(inkscape:hu) \
locale(inkscape:id) \
locale(inkscape:is) \
locale(inkscape:it) \
locale(inkscape:ja) \
locale(inkscape:km) \
locale(inkscape:kn) \
locale(inkscape:ko) \
locale(inkscape:lt) \
locale(inkscape:lv) \
locale(inkscape:mai) \
locale(inkscape:mk) \
locale(inkscape:ml) \
locale(inkscape:mr) \
locale(inkscape:nb) \
locale(inkscape:ne) \
locale(inkscape:nl) \
locale(inkscape:nn) \
locale(inkscape:or) \
locale(inkscape:pa) \
locale(inkscape:pl) \
locale(inkscape:pt) \
locale(inkscape:pt_BR) \
locale(inkscape:ro) \
locale(inkscape:ru) \
locale(inkscape:sk) \
locale(inkscape:sl) \
locale(inkscape:sq) \
locale(inkscape:sr) \
locale(inkscape:sr@latin) \
locale(inkscape:sv) \
locale(inkscape:ta) \
locale(inkscape:te) \
locale(inkscape:th) \
locale(inkscape:tr) \
locale(inkscape:uk) \
locale(inkscape:vi) \
locale(inkscape:zh_CN) \
locale(inkscape:zh_TW)"

RDEPENDS:${PN} += "inkscape"

inherit rpm
