SUMMARY = "Translations for package cogl"
DESCRIPTION = "Provides translations for the 'cogl' package."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "cogl-lang-1.22.8-2.11.noarch.rpm"
RPM_HASH = "caa2a7c7710e826a6b557cf07eb7548b49985962db187569f4cd326e9ad39c172b4033bef9f40290077c74417d06c2b55edccec8b7d1027f293245c86cda9bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cogl-lang cogl-lang-all locale(cogl:ar) locale(cogl:as) locale(cogl:ast) locale(cogl:be) locale(cogl:bg) locale(cogl:bs) locale(cogl:ca) locale(cogl:ca@valencia) locale(cogl:cs) locale(cogl:da) locale(cogl:de) locale(cogl:el) locale(cogl:en_CA) locale(cogl:en_GB) locale(cogl:eo) locale(cogl:es) locale(cogl:eu) locale(cogl:fa) locale(cogl:fi) locale(cogl:fr) locale(cogl:fur) locale(cogl:gl) locale(cogl:he) locale(cogl:hi) locale(cogl:hr) locale(cogl:hu) locale(cogl:id) locale(cogl:it) locale(cogl:ja) locale(cogl:km) locale(cogl:kn) locale(cogl:ko) locale(cogl:lt) locale(cogl:lv) locale(cogl:ml) locale(cogl:ms) locale(cogl:nb) locale(cogl:ne) locale(cogl:nl) locale(cogl:oc) locale(cogl:or) locale(cogl:pa) locale(cogl:pl) locale(cogl:pt) locale(cogl:pt_BR) locale(cogl:ro) locale(cogl:ru) locale(cogl:sk) locale(cogl:sl) locale(cogl:sr) locale(cogl:sr@latin) locale(cogl:sv) locale(cogl:ta) locale(cogl:te) locale(cogl:th) locale(cogl:tr) locale(cogl:ug) locale(cogl:uk) locale(cogl:vi) locale(cogl:zh_CN) locale(cogl:zh_HK) locale(cogl:zh_TW)"
RDEPENDS:${PN} += "cogl"

inherit rpm
