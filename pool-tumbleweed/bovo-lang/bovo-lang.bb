SUMMARY = "Translations for package bovo"
DESCRIPTION = "Provides translations for the 'bovo' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "bovo-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ebf66a94a980e6e1cfba68cfee80c115d97362214f3426f48b4e2af2c07e4fb4ab172c069ceae280c8a6a2119a89e966f6d10a6d65135912ade063b18c5d1090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bovo-lang \
bovo-lang-all \
locale(bovo:ar) \
locale(bovo:be) \
locale(bovo:bg) \
locale(bovo:bs) \
locale(bovo:ca) \
locale(bovo:ca@valencia) \
locale(bovo:cs) \
locale(bovo:da) \
locale(bovo:de) \
locale(bovo:el) \
locale(bovo:en_GB) \
locale(bovo:eo) \
locale(bovo:es) \
locale(bovo:et) \
locale(bovo:eu) \
locale(bovo:fi) \
locale(bovo:fr) \
locale(bovo:ga) \
locale(bovo:gl) \
locale(bovo:hi) \
locale(bovo:hr) \
locale(bovo:hu) \
locale(bovo:id) \
locale(bovo:is) \
locale(bovo:it) \
locale(bovo:ja) \
locale(bovo:ka) \
locale(bovo:kk) \
locale(bovo:km) \
locale(bovo:ko) \
locale(bovo:lt) \
locale(bovo:lv) \
locale(bovo:mai) \
locale(bovo:ml) \
locale(bovo:mr) \
locale(bovo:nb) \
locale(bovo:nds) \
locale(bovo:nl) \
locale(bovo:nn) \
locale(bovo:oc) \
locale(bovo:pa) \
locale(bovo:pl) \
locale(bovo:pt) \
locale(bovo:pt_BR) \
locale(bovo:ro) \
locale(bovo:ru) \
locale(bovo:sk) \
locale(bovo:sl) \
locale(bovo:sq) \
locale(bovo:sr) \
locale(bovo:sr@ijekavian) \
locale(bovo:sr@ijekavianlatin) \
locale(bovo:sr@latin) \
locale(bovo:sv) \
locale(bovo:tr) \
locale(bovo:ug) \
locale(bovo:uk) \
locale(bovo:zh_CN) \
locale(bovo:zh_TW)"

RDEPENDS:${PN} += "bovo"

inherit rpm
