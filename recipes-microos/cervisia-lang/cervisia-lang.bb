SUMMARY = "Translations for package cervisia"
DESCRIPTION = "Provides translations for the 'cervisia' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "cervisia-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "d2ee75947d234fc8c4ec7528e694671e4d5ab142f9f5c58605c252fd200ba8d659a603a8053676e17e520dd36ff84fa3010a0ddbb4eba1413f10e54592cd5acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cervisia-lang cervisia-lang-all locale(cervisia:af) locale(cervisia:ar) locale(cervisia:be) locale(cervisia:bg) locale(cervisia:br) locale(cervisia:bs) locale(cervisia:ca) locale(cervisia:ca@valencia) locale(cervisia:cs) locale(cervisia:cy) locale(cervisia:da) locale(cervisia:de) locale(cervisia:el) locale(cervisia:en_GB) locale(cervisia:eo) locale(cervisia:es) locale(cervisia:et) locale(cervisia:eu) locale(cervisia:fa) locale(cervisia:fi) locale(cervisia:fr) locale(cervisia:ga) locale(cervisia:gl) locale(cervisia:he) locale(cervisia:hi) locale(cervisia:hr) locale(cervisia:hu) locale(cervisia:is) locale(cervisia:it) locale(cervisia:ja) locale(cervisia:ka) locale(cervisia:kk) locale(cervisia:km) locale(cervisia:ko) locale(cervisia:lt) locale(cervisia:lv) locale(cervisia:mai) locale(cervisia:mk) locale(cervisia:mr) locale(cervisia:ms) locale(cervisia:nb) locale(cervisia:nds) locale(cervisia:ne) locale(cervisia:nl) locale(cervisia:nn) locale(cervisia:oc) locale(cervisia:pa) locale(cervisia:pl) locale(cervisia:pt) locale(cervisia:pt_BR) locale(cervisia:ro) locale(cervisia:ru) locale(cervisia:sk) locale(cervisia:sl) locale(cervisia:sq) locale(cervisia:sv) locale(cervisia:ta) locale(cervisia:tr) locale(cervisia:ug) locale(cervisia:uk) locale(cervisia:zh_CN) locale(cervisia:zh_TW)"
RDEPENDS:${PN} += "cervisia"

inherit rpm
