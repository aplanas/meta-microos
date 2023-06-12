SUMMARY = "Translations for package deepin-pw-check"
DESCRIPTION = "Provides translations for the 'deepin-pw-check' package."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-lang-5.1.16-1.5.noarch.rpm"
RPM_HASH = "a4bde229eb0f7067374c4e92369f05d815ab562477773ee303e2c90b383858dda8dc4dd4662899d6be1f68f13ea338db7b1bf9ce17d7fbf10f427b48554bfcbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-pw-check-lang \
deepin-pw-check-lang-all \
locale(deepin-pw-check:ar) \
locale(deepin-pw-check:az) \
locale(deepin-pw-check:ca) \
locale(deepin-pw-check:cs) \
locale(deepin-pw-check:da) \
locale(deepin-pw-check:de) \
locale(deepin-pw-check:el) \
locale(deepin-pw-check:en_US) \
locale(deepin-pw-check:es) \
locale(deepin-pw-check:fi) \
locale(deepin-pw-check:fr) \
locale(deepin-pw-check:hr) \
locale(deepin-pw-check:hu) \
locale(deepin-pw-check:it) \
locale(deepin-pw-check:ko) \
locale(deepin-pw-check:ms) \
locale(deepin-pw-check:nl) \
locale(deepin-pw-check:pl) \
locale(deepin-pw-check:pt) \
locale(deepin-pw-check:pt_BR) \
locale(deepin-pw-check:ro) \
locale(deepin-pw-check:ru) \
locale(deepin-pw-check:si) \
locale(deepin-pw-check:sk) \
locale(deepin-pw-check:sl) \
locale(deepin-pw-check:sq) \
locale(deepin-pw-check:sr) \
locale(deepin-pw-check:th) \
locale(deepin-pw-check:tr) \
locale(deepin-pw-check:ug) \
locale(deepin-pw-check:uk) \
locale(deepin-pw-check:vi) \
locale(deepin-pw-check:zh_CN) \
locale(deepin-pw-check:zh_HK) \
locale(deepin-pw-check:zh_TW)"
RDEPENDS:${PN} += "deepin-pw-check"

inherit rpm
