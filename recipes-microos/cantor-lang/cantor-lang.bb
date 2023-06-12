SUMMARY = "Translations for package cantor"
DESCRIPTION = "Provides translations for the 'cantor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "cantor-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "d864f88f905c8f117f62804605de0be85a6c13674465b5694a26e2e79d348f25ce7da715b7dd8e6f7959b39a39bb8e8a297d6c817bdd662bba8c36aa1cf747f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantor-lang \
cantor-lang-all \
locale(cantor:ar) \
locale(cantor:bg) \
locale(cantor:bs) \
locale(cantor:ca) \
locale(cantor:ca@valencia) \
locale(cantor:cs) \
locale(cantor:da) \
locale(cantor:de) \
locale(cantor:el) \
locale(cantor:en_GB) \
locale(cantor:eo) \
locale(cantor:es) \
locale(cantor:et) \
locale(cantor:eu) \
locale(cantor:fi) \
locale(cantor:fr) \
locale(cantor:ga) \
locale(cantor:gl) \
locale(cantor:hr) \
locale(cantor:hu) \
locale(cantor:ia) \
locale(cantor:it) \
locale(cantor:ja) \
locale(cantor:ka) \
locale(cantor:kk) \
locale(cantor:ko) \
locale(cantor:lt) \
locale(cantor:lv) \
locale(cantor:ml) \
locale(cantor:mr) \
locale(cantor:nb) \
locale(cantor:nds) \
locale(cantor:nl) \
locale(cantor:nn) \
locale(cantor:pa) \
locale(cantor:pl) \
locale(cantor:pt) \
locale(cantor:pt_BR) \
locale(cantor:ro) \
locale(cantor:ru) \
locale(cantor:sk) \
locale(cantor:sl) \
locale(cantor:sv) \
locale(cantor:ta) \
locale(cantor:th) \
locale(cantor:tr) \
locale(cantor:ug) \
locale(cantor:uk) \
locale(cantor:zh_CN) \
locale(cantor:zh_TW)"
RDEPENDS:${PN} += "cantor"

inherit rpm
