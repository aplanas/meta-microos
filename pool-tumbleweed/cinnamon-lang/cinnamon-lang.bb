SUMMARY = "Translations for package cinnamon"
DESCRIPTION = "Provides translations for the 'cinnamon' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.0"

RPM_NAME = "cinnamon-lang-5.8.0-1.1.noarch.rpm"
RPM_HASH = "c6779c5f8a80ce50cbb970b6700344d809ee61312787b6f6d96d18440a57e79712edf3e0b43517a021de73f35bbd54f9327716605caad4538e97ba98827c2aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-lang \
cinnamon-lang-all \
locale(cinnamon:af) \
locale(cinnamon:ar) \
locale(cinnamon:ast) \
locale(cinnamon:az) \
locale(cinnamon:be) \
locale(cinnamon:bg) \
locale(cinnamon:bn) \
locale(cinnamon:bs) \
locale(cinnamon:ca) \
locale(cinnamon:ca@valencia) \
locale(cinnamon:cs) \
locale(cinnamon:cy) \
locale(cinnamon:da) \
locale(cinnamon:de) \
locale(cinnamon:el) \
locale(cinnamon:en_AU) \
locale(cinnamon:en_CA) \
locale(cinnamon:en_GB) \
locale(cinnamon:en_NZ) \
locale(cinnamon:eo) \
locale(cinnamon:es) \
locale(cinnamon:es_AR) \
locale(cinnamon:et) \
locale(cinnamon:eu) \
locale(cinnamon:fa) \
locale(cinnamon:fi) \
locale(cinnamon:fr) \
locale(cinnamon:fr_CA) \
locale(cinnamon:fur) \
locale(cinnamon:ga) \
locale(cinnamon:gd) \
locale(cinnamon:gl) \
locale(cinnamon:gu) \
locale(cinnamon:he) \
locale(cinnamon:hi) \
locale(cinnamon:hr) \
locale(cinnamon:hu) \
locale(cinnamon:ia) \
locale(cinnamon:id) \
locale(cinnamon:is) \
locale(cinnamon:it) \
locale(cinnamon:ja) \
locale(cinnamon:ka) \
locale(cinnamon:kk) \
locale(cinnamon:km) \
locale(cinnamon:kn) \
locale(cinnamon:ko) \
locale(cinnamon:lt) \
locale(cinnamon:lv) \
locale(cinnamon:mai) \
locale(cinnamon:mk) \
locale(cinnamon:ml) \
locale(cinnamon:mr) \
locale(cinnamon:ms) \
locale(cinnamon:nb) \
locale(cinnamon:nds) \
locale(cinnamon:ne) \
locale(cinnamon:nl) \
locale(cinnamon:nn) \
locale(cinnamon:oc) \
locale(cinnamon:or) \
locale(cinnamon:pa) \
locale(cinnamon:pl) \
locale(cinnamon:pt) \
locale(cinnamon:pt_BR) \
locale(cinnamon:ro) \
locale(cinnamon:ru) \
locale(cinnamon:si) \
locale(cinnamon:sk) \
locale(cinnamon:sl) \
locale(cinnamon:sq) \
locale(cinnamon:sr) \
locale(cinnamon:sr@ijekavian) \
locale(cinnamon:sr@ijekavianlatin) \
locale(cinnamon:sr@latin) \
locale(cinnamon:sv) \
locale(cinnamon:ta) \
locale(cinnamon:te) \
locale(cinnamon:th) \
locale(cinnamon:tr) \
locale(cinnamon:ug) \
locale(cinnamon:uk) \
locale(cinnamon:vi) \
locale(cinnamon:wa) \
locale(cinnamon:zh_CN) \
locale(cinnamon:zh_HK) \
locale(cinnamon:zh_TW)"
RDEPENDS:${PN} += "cinnamon"

inherit rpm
