SUMMARY = "Translations for package pan"
DESCRIPTION = "Provides translations for the 'pan' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.154"

RPM_NAME = "pan-lang-0.154-2.3.noarch.rpm"
RPM_HASH = "1051209182996adb8a2cfaf00ddcca3bfb0a736279ed4b51b5b05f87d2880b24c3beeed201649a755e45d3717f814bf80a24591a726603e2cf1f3ef54bfc0322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pan:ar) \
locale(pan:az) \
locale(pan:bg) \
locale(pan:bs) \
locale(pan:ca) \
locale(pan:cs) \
locale(pan:da) \
locale(pan:de) \
locale(pan:dz) \
locale(pan:el) \
locale(pan:en_CA) \
locale(pan:en_GB) \
locale(pan:eo) \
locale(pan:es) \
locale(pan:et) \
locale(pan:eu) \
locale(pan:fi) \
locale(pan:fr) \
locale(pan:ga) \
locale(pan:gl) \
locale(pan:hr) \
locale(pan:hu) \
locale(pan:id) \
locale(pan:it) \
locale(pan:ja) \
locale(pan:ko) \
locale(pan:lt) \
locale(pan:lv) \
locale(pan:ms) \
locale(pan:nb) \
locale(pan:nl) \
locale(pan:oc) \
locale(pan:pl) \
locale(pan:pt) \
locale(pan:pt_BR) \
locale(pan:ro) \
locale(pan:ru) \
locale(pan:sk) \
locale(pan:sl) \
locale(pan:sq) \
locale(pan:sr) \
locale(pan:sr@latin) \
locale(pan:sv) \
locale(pan:tr) \
locale(pan:uk) \
locale(pan:vi) \
locale(pan:zh_CN) \
locale(pan:zh_TW) \
pan-lang \
pan-lang-all"

RDEPENDS:${PN} += "pan"

inherit rpm
