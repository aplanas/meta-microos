SUMMARY = "Translations for package caja"
DESCRIPTION = "Provides translations for the 'caja' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-lang-1.26.1-1.4.noarch.rpm"
RPM_HASH = "6cec576f8ccd9fc22c01f16579e21fae2a77e1fa66a3fe42f4c27c08c7b7e927c6baef162fe7d0f5856d33889e1378a21766a581ea5de3602ce8e7b9d49c478e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-lang caja-lang-all locale(caja:af) locale(caja:ar) locale(caja:as) locale(caja:ast) locale(caja:az) locale(caja:be) locale(caja:bg) locale(caja:bn) locale(caja:bn_IN) locale(caja:br) locale(caja:bs) locale(caja:ca) locale(caja:ca@valencia) locale(caja:cs) locale(caja:cy) locale(caja:da) locale(caja:de) locale(caja:dz) locale(caja:el) locale(caja:en_AU) locale(caja:en_CA) locale(caja:en_GB) locale(caja:eo) locale(caja:es) locale(caja:es_AR) locale(caja:es_CL) locale(caja:es_CO) locale(caja:es_ES) locale(caja:es_MX) locale(caja:es_PR) locale(caja:et) locale(caja:eu) locale(caja:fa) locale(caja:fi) locale(caja:fr) locale(caja:fr_CA) locale(caja:fur) locale(caja:ga) locale(caja:gd) locale(caja:gl) locale(caja:gu) locale(caja:he) locale(caja:hi) locale(caja:hr) locale(caja:hu) locale(caja:ia) locale(caja:id) locale(caja:is) locale(caja:it) locale(caja:ja) locale(caja:ka) locale(caja:kk) locale(caja:km) locale(caja:kn) locale(caja:ko) locale(caja:lt) locale(caja:lv) locale(caja:mai) locale(caja:mk) locale(caja:ml) locale(caja:mr) locale(caja:ms) locale(caja:nb) locale(caja:nds) locale(caja:ne) locale(caja:nl) locale(caja:nn) locale(caja:oc) locale(caja:or) locale(caja:pa) locale(caja:pl) locale(caja:pt) locale(caja:pt_BR) locale(caja:ro) locale(caja:ru) locale(caja:si) locale(caja:sk) locale(caja:sl) locale(caja:sq) locale(caja:sr) locale(caja:sr@latin) locale(caja:sv) locale(caja:ta) locale(caja:te) locale(caja:th) locale(caja:tr) locale(caja:ug) locale(caja:uk) locale(caja:vi) locale(caja:wa) locale(caja:zh_CN) locale(caja:zh_HK) locale(caja:zh_TW)"
RDEPENDS:${PN} += "caja"

inherit rpm
