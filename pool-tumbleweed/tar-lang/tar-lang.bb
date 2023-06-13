SUMMARY = "Translations for package tar"
DESCRIPTION = "Provides translations for the 'tar' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-lang-1.34-10.3.noarch.rpm"
RPM_HASH = "4db116c7840d432e4314781800848dbfd3bd72f3db53b436ab01502ac0b71c95147cd2720ce90c58c64e1be246820c4b234f8b89974cd64ff02bb7f67dd56dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tar:bg) \
locale(tar:ca) \
locale(tar:cs) \
locale(tar:da) \
locale(tar:de) \
locale(tar:el) \
locale(tar:eo) \
locale(tar:es) \
locale(tar:et) \
locale(tar:eu) \
locale(tar:fi) \
locale(tar:fr) \
locale(tar:ga) \
locale(tar:gl) \
locale(tar:hr) \
locale(tar:hu) \
locale(tar:id) \
locale(tar:it) \
locale(tar:ja) \
locale(tar:ko) \
locale(tar:ms) \
locale(tar:nb) \
locale(tar:nl) \
locale(tar:pl) \
locale(tar:pt) \
locale(tar:pt_BR) \
locale(tar:ro) \
locale(tar:ru) \
locale(tar:sk) \
locale(tar:sl) \
locale(tar:sr) \
locale(tar:sv) \
locale(tar:tr) \
locale(tar:uk) \
locale(tar:vi) \
locale(tar:zh_CN) \
locale(tar:zh_TW) \
tar-lang \
tar-lang-all"

RDEPENDS:${PN} += "tar"

inherit rpm
