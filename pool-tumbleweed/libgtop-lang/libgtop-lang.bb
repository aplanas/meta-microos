SUMMARY = "Translations for package libgtop"
DESCRIPTION = "Provides translations for the 'libgtop' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-lang-2.40.0-4.3.noarch.rpm"
RPM_HASH = "05c7fa9d41b68f30575496c59d1459cb349bf6d77d0b206339ded056f07fc7a1093875e3f4a68d830efe3b4d4d33ff690b648e4b3f05deb2cd84c7b0c7110724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgtop-lang \
libgtop-lang-all \
locale(libgtop:ar) \
locale(libgtop:as) \
locale(libgtop:ast) \
locale(libgtop:az) \
locale(libgtop:be) \
locale(libgtop:bg) \
locale(libgtop:bn) \
locale(libgtop:bn_IN) \
locale(libgtop:bs) \
locale(libgtop:ca) \
locale(libgtop:ca@valencia) \
locale(libgtop:cs) \
locale(libgtop:cy) \
locale(libgtop:da) \
locale(libgtop:de) \
locale(libgtop:dz) \
locale(libgtop:el) \
locale(libgtop:en@shaw) \
locale(libgtop:en_CA) \
locale(libgtop:en_GB) \
locale(libgtop:eo) \
locale(libgtop:es) \
locale(libgtop:et) \
locale(libgtop:eu) \
locale(libgtop:fa) \
locale(libgtop:fi) \
locale(libgtop:fr) \
locale(libgtop:fur) \
locale(libgtop:ga) \
locale(libgtop:gl) \
locale(libgtop:gu) \
locale(libgtop:he) \
locale(libgtop:hi) \
locale(libgtop:hr) \
locale(libgtop:hu) \
locale(libgtop:id) \
locale(libgtop:it) \
locale(libgtop:ja) \
locale(libgtop:ka) \
locale(libgtop:kn) \
locale(libgtop:ko) \
locale(libgtop:lt) \
locale(libgtop:lv) \
locale(libgtop:mai) \
locale(libgtop:mk) \
locale(libgtop:ml) \
locale(libgtop:mr) \
locale(libgtop:ms) \
locale(libgtop:nb) \
locale(libgtop:ne) \
locale(libgtop:nl) \
locale(libgtop:nn) \
locale(libgtop:oc) \
locale(libgtop:or) \
locale(libgtop:pa) \
locale(libgtop:pl) \
locale(libgtop:pt) \
locale(libgtop:pt_BR) \
locale(libgtop:ro) \
locale(libgtop:ru) \
locale(libgtop:sk) \
locale(libgtop:sl) \
locale(libgtop:sq) \
locale(libgtop:sr) \
locale(libgtop:sr@latin) \
locale(libgtop:sv) \
locale(libgtop:ta) \
locale(libgtop:te) \
locale(libgtop:th) \
locale(libgtop:tr) \
locale(libgtop:ug) \
locale(libgtop:uk) \
locale(libgtop:vi) \
locale(libgtop:zh_CN) \
locale(libgtop:zh_HK) \
locale(libgtop:zh_TW)"

RDEPENDS:${PN} += "libgtop"

inherit rpm
