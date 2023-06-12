SUMMARY = "Translations for package plasma5-desktop"
DESCRIPTION = "Provides translations for the 'plasma5-desktop' package."
LICENSE = "GPL-2.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-desktop-lang-5.27.5-1.2.noarch.rpm"
RPM_HASH = "0698f621e8bf9ecf6743038dc5d65fec0af08dc42223398db884d41ceb7eaa30c797e835a5f77ff9bd13147c2e829d1470d81e3cce54354b080c0d3702f3f04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-desktop:af) \
locale(plasma5-desktop:ar) \
locale(plasma5-desktop:as) \
locale(plasma5-desktop:ast) \
locale(plasma5-desktop:az) \
locale(plasma5-desktop:be) \
locale(plasma5-desktop:be@latin) \
locale(plasma5-desktop:bg) \
locale(plasma5-desktop:bn) \
locale(plasma5-desktop:bn_IN) \
locale(plasma5-desktop:br) \
locale(plasma5-desktop:bs) \
locale(plasma5-desktop:ca) \
locale(plasma5-desktop:ca@valencia) \
locale(plasma5-desktop:cs) \
locale(plasma5-desktop:cy) \
locale(plasma5-desktop:da) \
locale(plasma5-desktop:de) \
locale(plasma5-desktop:el) \
locale(plasma5-desktop:en_GB) \
locale(plasma5-desktop:eo) \
locale(plasma5-desktop:es) \
locale(plasma5-desktop:et) \
locale(plasma5-desktop:eu) \
locale(plasma5-desktop:fa) \
locale(plasma5-desktop:fi) \
locale(plasma5-desktop:fr) \
locale(plasma5-desktop:ga) \
locale(plasma5-desktop:gl) \
locale(plasma5-desktop:gu) \
locale(plasma5-desktop:he) \
locale(plasma5-desktop:hi) \
locale(plasma5-desktop:hr) \
locale(plasma5-desktop:hu) \
locale(plasma5-desktop:ia) \
locale(plasma5-desktop:id) \
locale(plasma5-desktop:is) \
locale(plasma5-desktop:it) \
locale(plasma5-desktop:ja) \
locale(plasma5-desktop:ka) \
locale(plasma5-desktop:kk) \
locale(plasma5-desktop:km) \
locale(plasma5-desktop:kn) \
locale(plasma5-desktop:ko) \
locale(plasma5-desktop:lt) \
locale(plasma5-desktop:lv) \
locale(plasma5-desktop:mai) \
locale(plasma5-desktop:mk) \
locale(plasma5-desktop:ml) \
locale(plasma5-desktop:mr) \
locale(plasma5-desktop:ms) \
locale(plasma5-desktop:nb) \
locale(plasma5-desktop:nds) \
locale(plasma5-desktop:ne) \
locale(plasma5-desktop:nl) \
locale(plasma5-desktop:nn) \
locale(plasma5-desktop:oc) \
locale(plasma5-desktop:or) \
locale(plasma5-desktop:pa) \
locale(plasma5-desktop:pl) \
locale(plasma5-desktop:pt) \
locale(plasma5-desktop:pt_BR) \
locale(plasma5-desktop:ro) \
locale(plasma5-desktop:ru) \
locale(plasma5-desktop:si) \
locale(plasma5-desktop:sk) \
locale(plasma5-desktop:sl) \
locale(plasma5-desktop:sq) \
locale(plasma5-desktop:sr) \
locale(plasma5-desktop:sr@ijekavian) \
locale(plasma5-desktop:sr@ijekavianlatin) \
locale(plasma5-desktop:sr@latin) \
locale(plasma5-desktop:sv) \
locale(plasma5-desktop:ta) \
locale(plasma5-desktop:te) \
locale(plasma5-desktop:th) \
locale(plasma5-desktop:tr) \
locale(plasma5-desktop:ug) \
locale(plasma5-desktop:uk) \
locale(plasma5-desktop:vi) \
locale(plasma5-desktop:wa) \
locale(plasma5-desktop:zh_CN) \
locale(plasma5-desktop:zh_TW) \
plasma5-desktop-lang \
plasma5-desktop-lang-all"
RDEPENDS:${PN} += "plasma5-desktop"

inherit rpm