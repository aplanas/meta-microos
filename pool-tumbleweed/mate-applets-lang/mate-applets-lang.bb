SUMMARY = "Translations for package mate-applets"
DESCRIPTION = "Provides translations for the 'mate-applets' package."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-applets-lang-1.26.1-1.4.noarch.rpm"
RPM_HASH = "2fe146a44f95e54f74bfbc4c6c291d67edc1e2012d776b165fd20b4c2288ffee0aea2e236d1a0751bb4f9c2125f0c0b319e8beb14d1789aebdfc6982f2c9a567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-applets:af) \
locale(mate-applets:ar) \
locale(mate-applets:as) \
locale(mate-applets:ast) \
locale(mate-applets:az) \
locale(mate-applets:be) \
locale(mate-applets:bg) \
locale(mate-applets:bn) \
locale(mate-applets:bn_IN) \
locale(mate-applets:br) \
locale(mate-applets:bs) \
locale(mate-applets:ca) \
locale(mate-applets:ca@valencia) \
locale(mate-applets:cs) \
locale(mate-applets:cy) \
locale(mate-applets:da) \
locale(mate-applets:de) \
locale(mate-applets:dz) \
locale(mate-applets:el) \
locale(mate-applets:en_AU) \
locale(mate-applets:en_CA) \
locale(mate-applets:en_GB) \
locale(mate-applets:eo) \
locale(mate-applets:es) \
locale(mate-applets:es_AR) \
locale(mate-applets:es_CL) \
locale(mate-applets:es_CO) \
locale(mate-applets:es_CR) \
locale(mate-applets:es_DO) \
locale(mate-applets:es_EC) \
locale(mate-applets:es_ES) \
locale(mate-applets:es_MX) \
locale(mate-applets:es_NI) \
locale(mate-applets:es_PA) \
locale(mate-applets:es_PE) \
locale(mate-applets:es_PR) \
locale(mate-applets:es_SV) \
locale(mate-applets:es_UY) \
locale(mate-applets:es_VE) \
locale(mate-applets:et) \
locale(mate-applets:eu) \
locale(mate-applets:fa) \
locale(mate-applets:fi) \
locale(mate-applets:fr) \
locale(mate-applets:fr_CA) \
locale(mate-applets:fur) \
locale(mate-applets:ga) \
locale(mate-applets:gl) \
locale(mate-applets:gu) \
locale(mate-applets:he) \
locale(mate-applets:hi) \
locale(mate-applets:hr) \
locale(mate-applets:hu) \
locale(mate-applets:id) \
locale(mate-applets:is) \
locale(mate-applets:it) \
locale(mate-applets:ja) \
locale(mate-applets:ka) \
locale(mate-applets:kk) \
locale(mate-applets:km) \
locale(mate-applets:kn) \
locale(mate-applets:ko) \
locale(mate-applets:lt) \
locale(mate-applets:lv) \
locale(mate-applets:mai) \
locale(mate-applets:mk) \
locale(mate-applets:ml) \
locale(mate-applets:mr) \
locale(mate-applets:ms) \
locale(mate-applets:nb) \
locale(mate-applets:nds) \
locale(mate-applets:ne) \
locale(mate-applets:nl) \
locale(mate-applets:nn) \
locale(mate-applets:oc) \
locale(mate-applets:or) \
locale(mate-applets:pa) \
locale(mate-applets:pl) \
locale(mate-applets:pt) \
locale(mate-applets:pt_BR) \
locale(mate-applets:ro) \
locale(mate-applets:ru) \
locale(mate-applets:si) \
locale(mate-applets:sk) \
locale(mate-applets:sl) \
locale(mate-applets:sq) \
locale(mate-applets:sr) \
locale(mate-applets:sr@latin) \
locale(mate-applets:sv) \
locale(mate-applets:ta) \
locale(mate-applets:te) \
locale(mate-applets:th) \
locale(mate-applets:tr) \
locale(mate-applets:ug) \
locale(mate-applets:uk) \
locale(mate-applets:vi) \
locale(mate-applets:wa) \
locale(mate-applets:zh_CN) \
locale(mate-applets:zh_HK) \
locale(mate-applets:zh_TW) \
mate-applets-lang \
mate-applets-lang-all"
RDEPENDS:${PN} += "mate-applets"

inherit rpm
