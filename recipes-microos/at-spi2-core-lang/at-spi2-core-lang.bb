SUMMARY = "Translations for package at-spi2-core"
DESCRIPTION = "Provides translations for the 'at-spi2-core' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "at-spi2-core-lang-2.48.3-1.1.noarch.rpm"
RPM_HASH = "229982357f186c7731740097cabd0f4a9b9b1438964f5c331d149348f10690bdf8dace3db641accda6972ad901c52939c32d655a9c7a0e8e1e36511e24b2fadb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "at-spi2-core-lang at-spi2-core-lang-all locale(at-spi2-core:af) locale(at-spi2-core:ar) locale(at-spi2-core:as) locale(at-spi2-core:ast) locale(at-spi2-core:az) locale(at-spi2-core:be) locale(at-spi2-core:be@latin) locale(at-spi2-core:bg) locale(at-spi2-core:bn) locale(at-spi2-core:bn_IN) locale(at-spi2-core:bs) locale(at-spi2-core:ca) locale(at-spi2-core:ca@valencia) locale(at-spi2-core:cs) locale(at-spi2-core:cy) locale(at-spi2-core:da) locale(at-spi2-core:de) locale(at-spi2-core:dz) locale(at-spi2-core:el) locale(at-spi2-core:en@shaw) locale(at-spi2-core:en_CA) locale(at-spi2-core:en_GB) locale(at-spi2-core:eo) locale(at-spi2-core:es) locale(at-spi2-core:et) locale(at-spi2-core:eu) locale(at-spi2-core:fa) locale(at-spi2-core:fi) locale(at-spi2-core:fr) locale(at-spi2-core:fur) locale(at-spi2-core:ga) locale(at-spi2-core:gd) locale(at-spi2-core:gl) locale(at-spi2-core:gu) locale(at-spi2-core:he) locale(at-spi2-core:hi) locale(at-spi2-core:hr) locale(at-spi2-core:hu) locale(at-spi2-core:id) locale(at-spi2-core:is) locale(at-spi2-core:it) locale(at-spi2-core:ja) locale(at-spi2-core:ka) locale(at-spi2-core:kk) locale(at-spi2-core:km) locale(at-spi2-core:kn) locale(at-spi2-core:ko) locale(at-spi2-core:lt) locale(at-spi2-core:lv) locale(at-spi2-core:mai) locale(at-spi2-core:mk) locale(at-spi2-core:ml) locale(at-spi2-core:mr) locale(at-spi2-core:ms) locale(at-spi2-core:nb) locale(at-spi2-core:ne) locale(at-spi2-core:nl) locale(at-spi2-core:nn) locale(at-spi2-core:oc) locale(at-spi2-core:or) locale(at-spi2-core:pa) locale(at-spi2-core:pl) locale(at-spi2-core:pt) locale(at-spi2-core:pt_BR) locale(at-spi2-core:ro) locale(at-spi2-core:ru) locale(at-spi2-core:si) locale(at-spi2-core:sk) locale(at-spi2-core:sl) locale(at-spi2-core:sq) locale(at-spi2-core:sr) locale(at-spi2-core:sr@ije) locale(at-spi2-core:sr@latin) locale(at-spi2-core:sv) locale(at-spi2-core:ta) locale(at-spi2-core:te) locale(at-spi2-core:th) locale(at-spi2-core:tr) locale(at-spi2-core:ug) locale(at-spi2-core:uk) locale(at-spi2-core:vi) locale(at-spi2-core:wa) locale(at-spi2-core:zh_CN) locale(at-spi2-core:zh_HK) locale(at-spi2-core:zh_TW)"
RDEPENDS:${PN} += "at-spi2-core"

inherit rpm
