SUMMARY = "Translations for package gpicview"
DESCRIPTION = "Provides translations for the 'gpicview' package."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "gpicview-lang-0.2.5-2.16.noarch.rpm"
RPM_HASH = "bbe4297f2ccd0f8677e51d080ae3af22d45b773a9f875f044b91b2228f6499398c31f625852bd2391e2500de2244e69776759c85201d23496ebc624750df5517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpicview-lang \
gpicview-lang-all \
locale(gpicview:af) \
locale(gpicview:ar) \
locale(gpicview:ast) \
locale(gpicview:be) \
locale(gpicview:bg) \
locale(gpicview:bn) \
locale(gpicview:bn_IN) \
locale(gpicview:bs) \
locale(gpicview:ca) \
locale(gpicview:cs) \
locale(gpicview:da) \
locale(gpicview:de) \
locale(gpicview:el) \
locale(gpicview:en_GB) \
locale(gpicview:eo) \
locale(gpicview:es) \
locale(gpicview:et) \
locale(gpicview:eu) \
locale(gpicview:fa) \
locale(gpicview:fi) \
locale(gpicview:fr) \
locale(gpicview:gl) \
locale(gpicview:he) \
locale(gpicview:hr) \
locale(gpicview:hu) \
locale(gpicview:id) \
locale(gpicview:is) \
locale(gpicview:it) \
locale(gpicview:ja) \
locale(gpicview:kk) \
locale(gpicview:kn) \
locale(gpicview:ko) \
locale(gpicview:lt) \
locale(gpicview:ml) \
locale(gpicview:ms) \
locale(gpicview:nb) \
locale(gpicview:nl) \
locale(gpicview:nn) \
locale(gpicview:pa) \
locale(gpicview:pl) \
locale(gpicview:pt) \
locale(gpicview:pt_BR) \
locale(gpicview:ro) \
locale(gpicview:ru) \
locale(gpicview:sk) \
locale(gpicview:sr) \
locale(gpicview:sr@latin) \
locale(gpicview:sv) \
locale(gpicview:te) \
locale(gpicview:th) \
locale(gpicview:tr) \
locale(gpicview:ug) \
locale(gpicview:uk) \
locale(gpicview:vi) \
locale(gpicview:zh_CN) \
locale(gpicview:zh_TW)"
RDEPENDS:${PN} += "gpicview"

inherit rpm
