SUMMARY = "Translations for package khotkeys5"
DESCRIPTION = "Provides translations for the 'khotkeys5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "khotkeys5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "b671d12b328f1062601925030afa3e1e1e883ba383f7328bb8b3936fbcb8661d542832860cf1b11f7839b4d4c00769f0baaa2eb95f7ab50c3c6fb4797e30a5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "khotkeys5-lang \
khotkeys5-lang-all \
locale(khotkeys5:af) \
locale(khotkeys5:ar) \
locale(khotkeys5:be) \
locale(khotkeys5:bg) \
locale(khotkeys5:bn_IN) \
locale(khotkeys5:br) \
locale(khotkeys5:bs) \
locale(khotkeys5:ca) \
locale(khotkeys5:ca@valencia) \
locale(khotkeys5:cs) \
locale(khotkeys5:cy) \
locale(khotkeys5:da) \
locale(khotkeys5:de) \
locale(khotkeys5:el) \
locale(khotkeys5:en_GB) \
locale(khotkeys5:eo) \
locale(khotkeys5:es) \
locale(khotkeys5:et) \
locale(khotkeys5:eu) \
locale(khotkeys5:fa) \
locale(khotkeys5:fi) \
locale(khotkeys5:fr) \
locale(khotkeys5:ga) \
locale(khotkeys5:gl) \
locale(khotkeys5:gu) \
locale(khotkeys5:he) \
locale(khotkeys5:hi) \
locale(khotkeys5:hr) \
locale(khotkeys5:hu) \
locale(khotkeys5:ia) \
locale(khotkeys5:id) \
locale(khotkeys5:is) \
locale(khotkeys5:it) \
locale(khotkeys5:ja) \
locale(khotkeys5:ka) \
locale(khotkeys5:kk) \
locale(khotkeys5:km) \
locale(khotkeys5:kn) \
locale(khotkeys5:ko) \
locale(khotkeys5:lt) \
locale(khotkeys5:lv) \
locale(khotkeys5:mai) \
locale(khotkeys5:mk) \
locale(khotkeys5:ml) \
locale(khotkeys5:mr) \
locale(khotkeys5:ms) \
locale(khotkeys5:nb) \
locale(khotkeys5:nds) \
locale(khotkeys5:ne) \
locale(khotkeys5:nl) \
locale(khotkeys5:nn) \
locale(khotkeys5:oc) \
locale(khotkeys5:or) \
locale(khotkeys5:pa) \
locale(khotkeys5:pl) \
locale(khotkeys5:pt) \
locale(khotkeys5:pt_BR) \
locale(khotkeys5:ro) \
locale(khotkeys5:ru) \
locale(khotkeys5:si) \
locale(khotkeys5:sk) \
locale(khotkeys5:sl) \
locale(khotkeys5:sq) \
locale(khotkeys5:sr) \
locale(khotkeys5:sr@ijekavian) \
locale(khotkeys5:sr@ijekavianlatin) \
locale(khotkeys5:sr@latin) \
locale(khotkeys5:sv) \
locale(khotkeys5:ta) \
locale(khotkeys5:te) \
locale(khotkeys5:th) \
locale(khotkeys5:tr) \
locale(khotkeys5:ug) \
locale(khotkeys5:uk) \
locale(khotkeys5:vi) \
locale(khotkeys5:wa) \
locale(khotkeys5:zh_CN) \
locale(khotkeys5:zh_TW)"

RDEPENDS:${PN} += "khotkeys5"

inherit rpm
