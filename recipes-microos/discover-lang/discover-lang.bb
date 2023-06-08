SUMMARY = "Translations for package discover"
DESCRIPTION = "Provides translations for the 'discover' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "discover-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "2605cfe6edcf892658749c11e64599254112351b30168465477dd7a70c7a880151cfa2dda268d848710ee41e31b0cf43bc8f94ebf016363079d6c942bb48a1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "discover-lang discover-lang-all locale(discover:ar) locale(discover:az) locale(discover:bg) locale(discover:bs) locale(discover:ca) locale(discover:ca@valencia) locale(discover:cs) locale(discover:da) locale(discover:de) locale(discover:el) locale(discover:en_GB) locale(discover:es) locale(discover:et) locale(discover:eu) locale(discover:fi) locale(discover:fr) locale(discover:ga) locale(discover:gl) locale(discover:he) locale(discover:hi) locale(discover:hu) locale(discover:ia) locale(discover:id) locale(discover:it) locale(discover:ja) locale(discover:ka) locale(discover:kk) locale(discover:ko) locale(discover:lt) locale(discover:ml) locale(discover:mr) locale(discover:nb) locale(discover:nds) locale(discover:nl) locale(discover:nn) locale(discover:pa) locale(discover:pl) locale(discover:pt) locale(discover:pt_BR) locale(discover:ro) locale(discover:ru) locale(discover:sk) locale(discover:sl) locale(discover:sr) locale(discover:sr@ijekavian) locale(discover:sr@ijekavianlatin) locale(discover:sr@latin) locale(discover:sv) locale(discover:ta) locale(discover:tr) locale(discover:ug) locale(discover:uk) locale(discover:vi) locale(discover:zh_CN) locale(discover:zh_TW)"
RDEPENDS:${PN} += "discover"

inherit rpm
