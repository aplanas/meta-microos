SUMMARY = "Translations for package encfs"
DESCRIPTION = "Provides translations for the 'encfs' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.9.5"

RPM_NAME = "encfs-lang-1.9.5-2.16.noarch.rpm"
RPM_HASH = "2324f687a071467dfc2578b21dea1d13cffacd52bd29591b2ac091f22f498706b0411bae1142b72a545bbaecfefd5665eb841c9da557a74a06f76542a9c06cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "encfs-lang \
encfs-lang-all \
locale(encfs:ar) \
locale(encfs:be) \
locale(encfs:bg) \
locale(encfs:bs) \
locale(encfs:ca) \
locale(encfs:cs) \
locale(encfs:da) \
locale(encfs:de) \
locale(encfs:de_AT) \
locale(encfs:de_CH) \
locale(encfs:de_DE) \
locale(encfs:el) \
locale(encfs:eo) \
locale(encfs:es) \
locale(encfs:es_ES) \
locale(encfs:es_PE) \
locale(encfs:et) \
locale(encfs:fi) \
locale(encfs:fr) \
locale(encfs:fr_FR) \
locale(encfs:gl) \
locale(encfs:he) \
locale(encfs:hr) \
locale(encfs:hu) \
locale(encfs:id) \
locale(encfs:it) \
locale(encfs:ja) \
locale(encfs:ko) \
locale(encfs:lv) \
locale(encfs:nb) \
locale(encfs:nds) \
locale(encfs:nl) \
locale(encfs:nn) \
locale(encfs:oc) \
locale(encfs:pl) \
locale(encfs:pt) \
locale(encfs:pt_BR) \
locale(encfs:pt_PT) \
locale(encfs:ro) \
locale(encfs:ru) \
locale(encfs:sk) \
locale(encfs:sr) \
locale(encfs:sv) \
locale(encfs:ta) \
locale(encfs:tr) \
locale(encfs:uk) \
locale(encfs:vi) \
locale(encfs:zh_CN) \
locale(encfs:zh_HK) \
locale(encfs:zh_TW)"

RDEPENDS:${PN} += "encfs"

inherit rpm
