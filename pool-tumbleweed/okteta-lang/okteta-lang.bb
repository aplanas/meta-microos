SUMMARY = "Translations for package okteta"
DESCRIPTION = "Provides translations for the 'okteta' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "okteta-lang-0.26.10-1.3.noarch.rpm"
RPM_HASH = "a8ae2cfc9725313c6e0f0f01f8b9f57fecae782ebc51e56151e4f60441cd8b374a614aabf1d313837767d640eeb24716faaecb8d5b1dbb4ec0c3c64b5aa3d8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(okteta:ar) \
locale(okteta:ast) \
locale(okteta:be) \
locale(okteta:bg) \
locale(okteta:bs) \
locale(okteta:ca) \
locale(okteta:ca@valencia) \
locale(okteta:cs) \
locale(okteta:da) \
locale(okteta:de) \
locale(okteta:el) \
locale(okteta:en_GB) \
locale(okteta:eo) \
locale(okteta:es) \
locale(okteta:et) \
locale(okteta:eu) \
locale(okteta:fi) \
locale(okteta:fr) \
locale(okteta:ga) \
locale(okteta:gl) \
locale(okteta:hr) \
locale(okteta:hu) \
locale(okteta:ia) \
locale(okteta:id) \
locale(okteta:is) \
locale(okteta:it) \
locale(okteta:ja) \
locale(okteta:ka) \
locale(okteta:kk) \
locale(okteta:km) \
locale(okteta:ko) \
locale(okteta:lt) \
locale(okteta:lv) \
locale(okteta:mr) \
locale(okteta:nb) \
locale(okteta:nds) \
locale(okteta:nl) \
locale(okteta:nn) \
locale(okteta:oc) \
locale(okteta:pa) \
locale(okteta:pl) \
locale(okteta:pt) \
locale(okteta:pt_BR) \
locale(okteta:ro) \
locale(okteta:ru) \
locale(okteta:sk) \
locale(okteta:sl) \
locale(okteta:sq) \
locale(okteta:sr) \
locale(okteta:sr@ijekavian) \
locale(okteta:sr@ijekavianlatin) \
locale(okteta:sr@latin) \
locale(okteta:sv) \
locale(okteta:tr) \
locale(okteta:ug) \
locale(okteta:uk) \
locale(okteta:zh_CN) \
locale(okteta:zh_TW) \
okteta-lang \
okteta-lang-all"
RDEPENDS:${PN} += "okteta"

inherit rpm
