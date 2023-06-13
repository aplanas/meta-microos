SUMMARY = "Translations for package orca"
DESCRIPTION = "Provides translations for the 'orca' package."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "orca-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "490e211433cf3c4b64530f7d46c7958d2b891b5408a2f210a7f7437ac10ded19dd7363e2027527adcaae243df25a79e188100029152d7d3aebf84ed1292ce4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(orca:ar) \
locale(orca:ast) \
locale(orca:be) \
locale(orca:bg) \
locale(orca:bn) \
locale(orca:bn_IN) \
locale(orca:bs) \
locale(orca:ca) \
locale(orca:ca@valencia) \
locale(orca:cs) \
locale(orca:cy) \
locale(orca:da) \
locale(orca:de) \
locale(orca:dz) \
locale(orca:el) \
locale(orca:en_CA) \
locale(orca:en_GB) \
locale(orca:eo) \
locale(orca:es) \
locale(orca:et) \
locale(orca:eu) \
locale(orca:fa) \
locale(orca:fi) \
locale(orca:fr) \
locale(orca:fur) \
locale(orca:ga) \
locale(orca:gl) \
locale(orca:gu) \
locale(orca:he) \
locale(orca:hi) \
locale(orca:hr) \
locale(orca:hu) \
locale(orca:id) \
locale(orca:is) \
locale(orca:it) \
locale(orca:ja) \
locale(orca:ka) \
locale(orca:kk) \
locale(orca:kn) \
locale(orca:ko) \
locale(orca:lt) \
locale(orca:lv) \
locale(orca:mai) \
locale(orca:mk) \
locale(orca:ml) \
locale(orca:mr) \
locale(orca:ms) \
locale(orca:nb) \
locale(orca:ne) \
locale(orca:nl) \
locale(orca:nn) \
locale(orca:oc) \
locale(orca:or) \
locale(orca:pa) \
locale(orca:pl) \
locale(orca:pt) \
locale(orca:pt_BR) \
locale(orca:ro) \
locale(orca:ru) \
locale(orca:si) \
locale(orca:sk) \
locale(orca:sl) \
locale(orca:sq) \
locale(orca:sr) \
locale(orca:sr@latin) \
locale(orca:sv) \
locale(orca:ta) \
locale(orca:te) \
locale(orca:th) \
locale(orca:tr) \
locale(orca:ug) \
locale(orca:uk) \
locale(orca:vi) \
locale(orca:zh_CN) \
locale(orca:zh_HK) \
locale(orca:zh_TW) \
orca-lang \
orca-lang-all"

RDEPENDS:${PN} += "orca"

inherit rpm
