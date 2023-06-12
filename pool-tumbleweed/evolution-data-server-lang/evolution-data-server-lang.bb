SUMMARY = "Translations for package evolution-data-server"
DESCRIPTION = "Provides translations for the 'evolution-data-server' package."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "evolution-data-server-lang-3.48.2-1.1.noarch.rpm"
RPM_HASH = "a644deeb8166c1ef0eec542c4d21a4162db9708c978ae76f7fdf34d694d53fa57a37b92140be53ceb5a0a5da105b61d92056ab9fcbe3b94348da6b408e5b1f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "evolution-data-server-lang \
evolution-data-server-lang-all \
locale(evolution-data-server:ar) \
locale(evolution-data-server:as) \
locale(evolution-data-server:ast) \
locale(evolution-data-server:az) \
locale(evolution-data-server:be) \
locale(evolution-data-server:bg) \
locale(evolution-data-server:bn) \
locale(evolution-data-server:bn_IN) \
locale(evolution-data-server:bs) \
locale(evolution-data-server:ca) \
locale(evolution-data-server:ca@valencia) \
locale(evolution-data-server:cs) \
locale(evolution-data-server:cy) \
locale(evolution-data-server:da) \
locale(evolution-data-server:de) \
locale(evolution-data-server:dz) \
locale(evolution-data-server:el) \
locale(evolution-data-server:en@shaw) \
locale(evolution-data-server:en_AU) \
locale(evolution-data-server:en_CA) \
locale(evolution-data-server:en_GB) \
locale(evolution-data-server:eo) \
locale(evolution-data-server:es) \
locale(evolution-data-server:et) \
locale(evolution-data-server:eu) \
locale(evolution-data-server:fa) \
locale(evolution-data-server:fi) \
locale(evolution-data-server:fr) \
locale(evolution-data-server:fur) \
locale(evolution-data-server:ga) \
locale(evolution-data-server:gl) \
locale(evolution-data-server:gu) \
locale(evolution-data-server:he) \
locale(evolution-data-server:hi) \
locale(evolution-data-server:hr) \
locale(evolution-data-server:hu) \
locale(evolution-data-server:id) \
locale(evolution-data-server:is) \
locale(evolution-data-server:it) \
locale(evolution-data-server:ja) \
locale(evolution-data-server:ka) \
locale(evolution-data-server:kk) \
locale(evolution-data-server:km) \
locale(evolution-data-server:kn) \
locale(evolution-data-server:ko) \
locale(evolution-data-server:lt) \
locale(evolution-data-server:lv) \
locale(evolution-data-server:mai) \
locale(evolution-data-server:mk) \
locale(evolution-data-server:ml) \
locale(evolution-data-server:mr) \
locale(evolution-data-server:ms) \
locale(evolution-data-server:nb) \
locale(evolution-data-server:ne) \
locale(evolution-data-server:nl) \
locale(evolution-data-server:nn) \
locale(evolution-data-server:oc) \
locale(evolution-data-server:or) \
locale(evolution-data-server:pa) \
locale(evolution-data-server:pl) \
locale(evolution-data-server:pt) \
locale(evolution-data-server:pt_BR) \
locale(evolution-data-server:ro) \
locale(evolution-data-server:ru) \
locale(evolution-data-server:si) \
locale(evolution-data-server:sk) \
locale(evolution-data-server:sl) \
locale(evolution-data-server:sq) \
locale(evolution-data-server:sr) \
locale(evolution-data-server:sr@latin) \
locale(evolution-data-server:sv) \
locale(evolution-data-server:ta) \
locale(evolution-data-server:te) \
locale(evolution-data-server:th) \
locale(evolution-data-server:tr) \
locale(evolution-data-server:ug) \
locale(evolution-data-server:uk) \
locale(evolution-data-server:vi) \
locale(evolution-data-server:wa) \
locale(evolution-data-server:zh_CN) \
locale(evolution-data-server:zh_HK) \
locale(evolution-data-server:zh_TW)"
RDEPENDS:${PN} += "evolution-data-server"

inherit rpm
