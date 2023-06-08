SUMMARY = "Translations for package blinken"
DESCRIPTION = "Provides translations for the 'blinken' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "blinken-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e4486a590e01e78ad510c1245b2509d671ad1b00d2c30bc908ceb3ce621d7441b95f782e46d1d25ec69e70e3cfa3a5b678c44778662eed392de842d84097c79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blinken-lang blinken-lang-all locale(blinken:ar) locale(blinken:be) locale(blinken:bg) locale(blinken:bn) locale(blinken:br) locale(blinken:bs) locale(blinken:ca) locale(blinken:ca@valencia) locale(blinken:cs) locale(blinken:cy) locale(blinken:da) locale(blinken:de) locale(blinken:el) locale(blinken:en_GB) locale(blinken:eo) locale(blinken:es) locale(blinken:et) locale(blinken:eu) locale(blinken:fa) locale(blinken:fi) locale(blinken:fr) locale(blinken:ga) locale(blinken:gl) locale(blinken:gu) locale(blinken:he) locale(blinken:hi) locale(blinken:hr) locale(blinken:hu) locale(blinken:ia) locale(blinken:is) locale(blinken:it) locale(blinken:ja) locale(blinken:ka) locale(blinken:kk) locale(blinken:km) locale(blinken:ko) locale(blinken:lt) locale(blinken:lv) locale(blinken:mk) locale(blinken:ml) locale(blinken:mr) locale(blinken:ms) locale(blinken:nb) locale(blinken:nds) locale(blinken:ne) locale(blinken:nl) locale(blinken:nn) locale(blinken:oc) locale(blinken:pa) locale(blinken:pl) locale(blinken:pt) locale(blinken:pt_BR) locale(blinken:ro) locale(blinken:ru) locale(blinken:si) locale(blinken:sk) locale(blinken:sl) locale(blinken:sq) locale(blinken:sv) locale(blinken:tr) locale(blinken:ug) locale(blinken:uk) locale(blinken:vi) locale(blinken:zh_CN) locale(blinken:zh_TW)"
RDEPENDS:${PN} += "blinken"

inherit rpm
