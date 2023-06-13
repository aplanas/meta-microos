SUMMARY = "Translations for package gajim"
DESCRIPTION = "Provides translations for the 'gajim' package."
LICENSE = "GPL-3.0-only"

PV = "1.7.3"

RPM_NAME = "gajim-lang-1.7.3-1.1.noarch.rpm"
RPM_HASH = "28fb35f7cef68a3664706e76dd2bd5e89c6d7bead85c48a615b4bf4c3f26cb1fed925da4bd49557f83f10620e073032179a1277f16d5157abd3cc0e3064c01e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim-lang \
gajim-lang-all \
locale(gajim:be) \
locale(gajim:be@latin) \
locale(gajim:bg) \
locale(gajim:br) \
locale(gajim:ca) \
locale(gajim:cs) \
locale(gajim:da) \
locale(gajim:de) \
locale(gajim:el) \
locale(gajim:en_GB) \
locale(gajim:eo) \
locale(gajim:es) \
locale(gajim:eu) \
locale(gajim:fr) \
locale(gajim:gl) \
locale(gajim:he) \
locale(gajim:hr) \
locale(gajim:hu) \
locale(gajim:it) \
locale(gajim:ja) \
locale(gajim:kk) \
locale(gajim:ko) \
locale(gajim:lt) \
locale(gajim:nb_NO) \
locale(gajim:nl) \
locale(gajim:pl) \
locale(gajim:pt) \
locale(gajim:pt_BR) \
locale(gajim:ro) \
locale(gajim:ru) \
locale(gajim:sk) \
locale(gajim:sr) \
locale(gajim:sv) \
locale(gajim:tr) \
locale(gajim:uk) \
locale(gajim:zh_CN) \
locale(gajim:zh_TW)"

RDEPENDS:${PN} += "gajim"

inherit rpm
