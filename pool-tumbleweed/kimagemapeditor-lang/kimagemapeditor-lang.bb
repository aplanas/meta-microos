SUMMARY = "Translations for package kimagemapeditor"
DESCRIPTION = "Provides translations for the 'kimagemapeditor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kimagemapeditor-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "634f86de872896d16936fee3f08cd786f192751c5a35fe42647aa6a5a4bb6cdcf1cf04d42ea0d3aa8b90d1bab9e991f4fb245a37167ad5df2efe48e4cee44607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kimagemapeditor-lang \
kimagemapeditor-lang-all \
locale(kimagemapeditor:ar) \
locale(kimagemapeditor:be) \
locale(kimagemapeditor:bg) \
locale(kimagemapeditor:br) \
locale(kimagemapeditor:bs) \
locale(kimagemapeditor:ca) \
locale(kimagemapeditor:ca@valencia) \
locale(kimagemapeditor:cs) \
locale(kimagemapeditor:cy) \
locale(kimagemapeditor:da) \
locale(kimagemapeditor:de) \
locale(kimagemapeditor:el) \
locale(kimagemapeditor:en_GB) \
locale(kimagemapeditor:eo) \
locale(kimagemapeditor:es) \
locale(kimagemapeditor:et) \
locale(kimagemapeditor:eu) \
locale(kimagemapeditor:fa) \
locale(kimagemapeditor:fi) \
locale(kimagemapeditor:fr) \
locale(kimagemapeditor:ga) \
locale(kimagemapeditor:gl) \
locale(kimagemapeditor:hi) \
locale(kimagemapeditor:hr) \
locale(kimagemapeditor:hu) \
locale(kimagemapeditor:it) \
locale(kimagemapeditor:ja) \
locale(kimagemapeditor:ka) \
locale(kimagemapeditor:kk) \
locale(kimagemapeditor:km) \
locale(kimagemapeditor:ko) \
locale(kimagemapeditor:lt) \
locale(kimagemapeditor:lv) \
locale(kimagemapeditor:mr) \
locale(kimagemapeditor:ms) \
locale(kimagemapeditor:nb) \
locale(kimagemapeditor:nds) \
locale(kimagemapeditor:ne) \
locale(kimagemapeditor:nl) \
locale(kimagemapeditor:nn) \
locale(kimagemapeditor:oc) \
locale(kimagemapeditor:pa) \
locale(kimagemapeditor:pl) \
locale(kimagemapeditor:pt) \
locale(kimagemapeditor:pt_BR) \
locale(kimagemapeditor:ro) \
locale(kimagemapeditor:ru) \
locale(kimagemapeditor:sk) \
locale(kimagemapeditor:sl) \
locale(kimagemapeditor:sv) \
locale(kimagemapeditor:ta) \
locale(kimagemapeditor:tr) \
locale(kimagemapeditor:ug) \
locale(kimagemapeditor:uk) \
locale(kimagemapeditor:zh_CN) \
locale(kimagemapeditor:zh_HK) \
locale(kimagemapeditor:zh_TW)"

RDEPENDS:${PN} += "kimagemapeditor"

inherit rpm
