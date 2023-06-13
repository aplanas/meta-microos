SUMMARY = "Translations for package gimp"
DESCRIPTION = "Provides translations for the 'gimp' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-lang-2.10.34-4.1.noarch.rpm"
RPM_HASH = "c20f087ba1c00733e6d29c52764fa664e5e73b301c8160e6313e1f8b25adc522c6bca0c0b6e7dd69c0d0efe714e8432f45084bdf08af5e1271c5537023d05e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-lang \
gimp-lang-all \
locale(gimp:ar) \
locale(gimp:ast) \
locale(gimp:az) \
locale(gimp:be) \
locale(gimp:bg) \
locale(gimp:br) \
locale(gimp:bs) \
locale(gimp:ca) \
locale(gimp:ca@valencia) \
locale(gimp:cs) \
locale(gimp:da) \
locale(gimp:de) \
locale(gimp:dz) \
locale(gimp:el) \
locale(gimp:en_CA) \
locale(gimp:en_GB) \
locale(gimp:eo) \
locale(gimp:es) \
locale(gimp:et) \
locale(gimp:eu) \
locale(gimp:fa) \
locale(gimp:fi) \
locale(gimp:fr) \
locale(gimp:ga) \
locale(gimp:gd) \
locale(gimp:gl) \
locale(gimp:gu) \
locale(gimp:he) \
locale(gimp:hi) \
locale(gimp:hr) \
locale(gimp:hu) \
locale(gimp:id) \
locale(gimp:is) \
locale(gimp:it) \
locale(gimp:ja) \
locale(gimp:ka) \
locale(gimp:kk) \
locale(gimp:km) \
locale(gimp:kn) \
locale(gimp:ko) \
locale(gimp:lt) \
locale(gimp:lv) \
locale(gimp:mk) \
locale(gimp:ml) \
locale(gimp:mr) \
locale(gimp:ms) \
locale(gimp:nb) \
locale(gimp:nds) \
locale(gimp:ne) \
locale(gimp:nl) \
locale(gimp:nn) \
locale(gimp:oc) \
locale(gimp:pa) \
locale(gimp:pl) \
locale(gimp:pt) \
locale(gimp:pt_BR) \
locale(gimp:ro) \
locale(gimp:ru) \
locale(gimp:si) \
locale(gimp:sk) \
locale(gimp:sl) \
locale(gimp:sr) \
locale(gimp:sr@latin) \
locale(gimp:sv) \
locale(gimp:ta) \
locale(gimp:te) \
locale(gimp:th) \
locale(gimp:tr) \
locale(gimp:uk) \
locale(gimp:vi) \
locale(gimp:zh_CN) \
locale(gimp:zh_HK) \
locale(gimp:zh_TW)"

RDEPENDS:${PN} += "gimp"

inherit rpm
