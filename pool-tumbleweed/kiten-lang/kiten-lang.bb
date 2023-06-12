SUMMARY = "Translations for package kiten"
DESCRIPTION = "Provides translations for the 'kiten' package."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.04.1"

RPM_NAME = "kiten-lang-23.04.1-2.1.noarch.rpm"
RPM_HASH = "a7acca6b0dae6ed11d9fd7494dd9b1c95b59bbf3ae13017a4f5e62b19381fd6a158690d284e4e31ade854be2a962642621c8ab5d422c1082aafd72048d5515a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiten-lang \
kiten-lang-all \
locale(kiten:af) \
locale(kiten:ar) \
locale(kiten:be) \
locale(kiten:bg) \
locale(kiten:br) \
locale(kiten:bs) \
locale(kiten:ca) \
locale(kiten:ca@valencia) \
locale(kiten:cs) \
locale(kiten:cy) \
locale(kiten:da) \
locale(kiten:de) \
locale(kiten:el) \
locale(kiten:en_GB) \
locale(kiten:eo) \
locale(kiten:es) \
locale(kiten:et) \
locale(kiten:eu) \
locale(kiten:fa) \
locale(kiten:fi) \
locale(kiten:fr) \
locale(kiten:ga) \
locale(kiten:gl) \
locale(kiten:hi) \
locale(kiten:hr) \
locale(kiten:hu) \
locale(kiten:is) \
locale(kiten:it) \
locale(kiten:ja) \
locale(kiten:ka) \
locale(kiten:kk) \
locale(kiten:km) \
locale(kiten:ko) \
locale(kiten:lt) \
locale(kiten:lv) \
locale(kiten:mk) \
locale(kiten:ml) \
locale(kiten:mr) \
locale(kiten:ms) \
locale(kiten:nb) \
locale(kiten:nds) \
locale(kiten:ne) \
locale(kiten:nl) \
locale(kiten:nn) \
locale(kiten:oc) \
locale(kiten:pl) \
locale(kiten:pt) \
locale(kiten:pt_BR) \
locale(kiten:ro) \
locale(kiten:ru) \
locale(kiten:si) \
locale(kiten:sk) \
locale(kiten:sl) \
locale(kiten:sq) \
locale(kiten:sv) \
locale(kiten:ta) \
locale(kiten:tr) \
locale(kiten:ug) \
locale(kiten:uk) \
locale(kiten:zh_CN) \
locale(kiten:zh_TW)"
RDEPENDS:${PN} += "kiten"

inherit rpm
