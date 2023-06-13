SUMMARY = "Translations for package gitg"
DESCRIPTION = "Provides translations for the 'gitg' package."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "gitg-lang-41-2.8.noarch.rpm"
RPM_HASH = "36eb57a979820d0a056f27eaaf9c70b304a2dd00728b7af21d658544e187c12654928e79d1710ab53b915db90e49cd00aebdd8d255891c6219fcf80f4e7bac9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitg-lang \
gitg-lang-all \
locale(gitg:as) \
locale(gitg:bg) \
locale(gitg:bs) \
locale(gitg:ca) \
locale(gitg:ca@valencia) \
locale(gitg:cs) \
locale(gitg:da) \
locale(gitg:de) \
locale(gitg:el) \
locale(gitg:en_GB) \
locale(gitg:eo) \
locale(gitg:es) \
locale(gitg:eu) \
locale(gitg:fi) \
locale(gitg:fr) \
locale(gitg:fur) \
locale(gitg:gl) \
locale(gitg:he) \
locale(gitg:hu) \
locale(gitg:id) \
locale(gitg:it) \
locale(gitg:ja) \
locale(gitg:kk) \
locale(gitg:ko) \
locale(gitg:lt) \
locale(gitg:lv) \
locale(gitg:ml) \
locale(gitg:ms) \
locale(gitg:nb) \
locale(gitg:ne) \
locale(gitg:nl) \
locale(gitg:oc) \
locale(gitg:pa) \
locale(gitg:pl) \
locale(gitg:pt) \
locale(gitg:pt_BR) \
locale(gitg:ro) \
locale(gitg:ru) \
locale(gitg:sk) \
locale(gitg:sl) \
locale(gitg:sr) \
locale(gitg:sr@latin) \
locale(gitg:sv) \
locale(gitg:tr) \
locale(gitg:uk) \
locale(gitg:vi) \
locale(gitg:zh_CN) \
locale(gitg:zh_HK) \
locale(gitg:zh_TW)"

RDEPENDS:${PN} += "gitg"

inherit rpm
