SUMMARY = "Translations for package libmateweather"
DESCRIPTION = "Provides translations for the 'libmateweather' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmateweather-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "bf8563f1b1a3361e0943b46cfeb476fcf16024165d642a2da552b5de16e37b320ccd49adc2d1e3d804d10a3aecd8a96728ac535d63bc21961f3690d0cdc3c29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmateweather-lang \
libmateweather-lang-all \
locale(libmateweather:af) \
locale(libmateweather:ar) \
locale(libmateweather:as) \
locale(libmateweather:ast) \
locale(libmateweather:az) \
locale(libmateweather:be) \
locale(libmateweather:bg) \
locale(libmateweather:bn) \
locale(libmateweather:bn_IN) \
locale(libmateweather:br) \
locale(libmateweather:bs) \
locale(libmateweather:ca) \
locale(libmateweather:ca@valencia) \
locale(libmateweather:cs) \
locale(libmateweather:cy) \
locale(libmateweather:da) \
locale(libmateweather:de) \
locale(libmateweather:dz) \
locale(libmateweather:el) \
locale(libmateweather:en_AU) \
locale(libmateweather:en_CA) \
locale(libmateweather:en_GB) \
locale(libmateweather:eo) \
locale(libmateweather:es) \
locale(libmateweather:es_AR) \
locale(libmateweather:es_CL) \
locale(libmateweather:es_CO) \
locale(libmateweather:es_CR) \
locale(libmateweather:es_DO) \
locale(libmateweather:es_EC) \
locale(libmateweather:es_ES) \
locale(libmateweather:es_MX) \
locale(libmateweather:es_NI) \
locale(libmateweather:es_PA) \
locale(libmateweather:es_PE) \
locale(libmateweather:es_PR) \
locale(libmateweather:es_SV) \
locale(libmateweather:es_UY) \
locale(libmateweather:es_VE) \
locale(libmateweather:et) \
locale(libmateweather:eu) \
locale(libmateweather:fa) \
locale(libmateweather:fi) \
locale(libmateweather:fr) \
locale(libmateweather:fr_CA) \
locale(libmateweather:fur) \
locale(libmateweather:ga) \
locale(libmateweather:gl) \
locale(libmateweather:gu) \
locale(libmateweather:he) \
locale(libmateweather:hi) \
locale(libmateweather:hr) \
locale(libmateweather:hu) \
locale(libmateweather:id) \
locale(libmateweather:is) \
locale(libmateweather:it) \
locale(libmateweather:ja) \
locale(libmateweather:ka) \
locale(libmateweather:kk) \
locale(libmateweather:kn) \
locale(libmateweather:ko) \
locale(libmateweather:lt) \
locale(libmateweather:lv) \
locale(libmateweather:mai) \
locale(libmateweather:mk) \
locale(libmateweather:ml) \
locale(libmateweather:mr) \
locale(libmateweather:ms) \
locale(libmateweather:nb) \
locale(libmateweather:nds) \
locale(libmateweather:ne) \
locale(libmateweather:nl) \
locale(libmateweather:nn) \
locale(libmateweather:oc) \
locale(libmateweather:or) \
locale(libmateweather:pa) \
locale(libmateweather:pl) \
locale(libmateweather:pt) \
locale(libmateweather:pt_BR) \
locale(libmateweather:ro) \
locale(libmateweather:ru) \
locale(libmateweather:si) \
locale(libmateweather:sk) \
locale(libmateweather:sl) \
locale(libmateweather:sq) \
locale(libmateweather:sr) \
locale(libmateweather:sr@latin) \
locale(libmateweather:sv) \
locale(libmateweather:ta) \
locale(libmateweather:te) \
locale(libmateweather:th) \
locale(libmateweather:tr) \
locale(libmateweather:ug) \
locale(libmateweather:uk) \
locale(libmateweather:vi) \
locale(libmateweather:wa) \
locale(libmateweather:zh_CN) \
locale(libmateweather:zh_HK) \
locale(libmateweather:zh_TW)"
RDEPENDS:${PN} += "libmateweather"

inherit rpm
