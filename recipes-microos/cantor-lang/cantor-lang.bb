SUMMARY = "Translations for package cantor"
DESCRIPTION = "Provides translations for the 'cantor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "cantor-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "0a6743fa6ef9fd3df211253d031756041c366b5576b9b72dde202b4e729de410eb65585a22a5ab41d21a1ff789087cd06e6ab3c2188cb8f2fca9a536578808df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantor-lang cantor-lang-all locale(cantor:ar) locale(cantor:bg) locale(cantor:bs) locale(cantor:ca) locale(cantor:ca@valencia) locale(cantor:cs) locale(cantor:da) locale(cantor:de) locale(cantor:el) locale(cantor:en_GB) locale(cantor:eo) locale(cantor:es) locale(cantor:et) locale(cantor:eu) locale(cantor:fi) locale(cantor:fr) locale(cantor:ga) locale(cantor:gl) locale(cantor:hr) locale(cantor:hu) locale(cantor:ia) locale(cantor:it) locale(cantor:ja) locale(cantor:ka) locale(cantor:kk) locale(cantor:ko) locale(cantor:lt) locale(cantor:lv) locale(cantor:ml) locale(cantor:mr) locale(cantor:nb) locale(cantor:nds) locale(cantor:nl) locale(cantor:nn) locale(cantor:pa) locale(cantor:pl) locale(cantor:pt) locale(cantor:pt_BR) locale(cantor:ro) locale(cantor:ru) locale(cantor:sk) locale(cantor:sl) locale(cantor:sv) locale(cantor:ta) locale(cantor:th) locale(cantor:tr) locale(cantor:ug) locale(cantor:uk) locale(cantor:zh_CN) locale(cantor:zh_TW)"
RDEPENDS:${PN} += "cantor"

inherit rpm
