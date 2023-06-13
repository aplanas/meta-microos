SUMMARY = "Translations for package kmplot"
DESCRIPTION = "Provides translations for the 'kmplot' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmplot-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "d7e36b83cbc9b1925c44bc087b770172199482da81f7fe7b1206f5ab7206ca25be99b76211d497f78a50a1de17c9373bb600943977aff1af4f192f1d5172eb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmplot-lang \
kmplot-lang-all \
locale(kmplot:af) \
locale(kmplot:ar) \
locale(kmplot:be) \
locale(kmplot:bg) \
locale(kmplot:bn) \
locale(kmplot:br) \
locale(kmplot:bs) \
locale(kmplot:ca) \
locale(kmplot:ca@valencia) \
locale(kmplot:cs) \
locale(kmplot:cy) \
locale(kmplot:da) \
locale(kmplot:de) \
locale(kmplot:el) \
locale(kmplot:en_GB) \
locale(kmplot:eo) \
locale(kmplot:es) \
locale(kmplot:et) \
locale(kmplot:eu) \
locale(kmplot:fa) \
locale(kmplot:fi) \
locale(kmplot:fr) \
locale(kmplot:ga) \
locale(kmplot:gl) \
locale(kmplot:he) \
locale(kmplot:hi) \
locale(kmplot:hr) \
locale(kmplot:hu) \
locale(kmplot:is) \
locale(kmplot:it) \
locale(kmplot:ja) \
locale(kmplot:ka) \
locale(kmplot:kk) \
locale(kmplot:km) \
locale(kmplot:ko) \
locale(kmplot:lt) \
locale(kmplot:lv) \
locale(kmplot:mai) \
locale(kmplot:mk) \
locale(kmplot:ml) \
locale(kmplot:mr) \
locale(kmplot:ms) \
locale(kmplot:nb) \
locale(kmplot:nds) \
locale(kmplot:ne) \
locale(kmplot:nl) \
locale(kmplot:nn) \
locale(kmplot:oc) \
locale(kmplot:pa) \
locale(kmplot:pl) \
locale(kmplot:pt) \
locale(kmplot:pt_BR) \
locale(kmplot:ro) \
locale(kmplot:ru) \
locale(kmplot:si) \
locale(kmplot:sk) \
locale(kmplot:sl) \
locale(kmplot:sq) \
locale(kmplot:sv) \
locale(kmplot:ta) \
locale(kmplot:tr) \
locale(kmplot:ug) \
locale(kmplot:uk) \
locale(kmplot:vi) \
locale(kmplot:zh_CN) \
locale(kmplot:zh_TW)"

RDEPENDS:${PN} += "kmplot"

inherit rpm
