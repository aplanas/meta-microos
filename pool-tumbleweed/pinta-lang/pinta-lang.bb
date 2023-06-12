SUMMARY = "Translations for package pinta"
DESCRIPTION = "Provides translations for the 'pinta' package."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "pinta-lang-1.7.1-1.5.noarch.rpm"
RPM_HASH = "9933221bd833c41c5a967d6e9f60d699f8077e384b9a8151e3de634c07822e979ce8b6ded186115d3d89f3c7748e713a47966d7d36ed5de9a4c2d78db2b7eb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pinta:af) \
locale(pinta:ar) \
locale(pinta:ast) \
locale(pinta:az) \
locale(pinta:be) \
locale(pinta:bg) \
locale(pinta:bn) \
locale(pinta:br) \
locale(pinta:bs) \
locale(pinta:ca) \
locale(pinta:cs) \
locale(pinta:da) \
locale(pinta:de) \
locale(pinta:el) \
locale(pinta:en_AU) \
locale(pinta:en_CA) \
locale(pinta:en_GB) \
locale(pinta:eo) \
locale(pinta:es) \
locale(pinta:et) \
locale(pinta:eu) \
locale(pinta:fi) \
locale(pinta:fr) \
locale(pinta:ga) \
locale(pinta:gl) \
locale(pinta:he) \
locale(pinta:hi) \
locale(pinta:hr) \
locale(pinta:hu) \
locale(pinta:id) \
locale(pinta:it) \
locale(pinta:ja) \
locale(pinta:ka) \
locale(pinta:ko) \
locale(pinta:lt) \
locale(pinta:lv) \
locale(pinta:ms) \
locale(pinta:nb) \
locale(pinta:nl) \
locale(pinta:nn) \
locale(pinta:oc) \
locale(pinta:pl) \
locale(pinta:pt) \
locale(pinta:pt_BR) \
locale(pinta:ro) \
locale(pinta:ru) \
locale(pinta:si) \
locale(pinta:sk) \
locale(pinta:sl) \
locale(pinta:sq) \
locale(pinta:sr) \
locale(pinta:sv) \
locale(pinta:th) \
locale(pinta:tr) \
locale(pinta:uk) \
locale(pinta:vi) \
locale(pinta:zh_CN) \
locale(pinta:zh_HK) \
locale(pinta:zh_TW) \
pinta-lang \
pinta-lang-all"
RDEPENDS:${PN} += "pinta"

inherit rpm
