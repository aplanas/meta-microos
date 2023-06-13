SUMMARY = "Translations for package plasma5-pk-updates"
DESCRIPTION = "Provides translations for the 'plasma5-pk-updates' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2+git70"

RPM_NAME = "plasma5-pk-updates-lang-0.3.2+git70-2.6.noarch.rpm"
RPM_HASH = "ab8e5f1d7f240de65fd2672e0f77502020c4e7840798f3910b04487a9fa7761a2e66f9a1af165037f0e63a7973cbc7e6c2224217d4fab5478aa2af7e4d731259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-pk-updates:ast) \
locale(plasma5-pk-updates:ca) \
locale(plasma5-pk-updates:ca@valencia) \
locale(plasma5-pk-updates:cs) \
locale(plasma5-pk-updates:da) \
locale(plasma5-pk-updates:de) \
locale(plasma5-pk-updates:en_GB) \
locale(plasma5-pk-updates:es) \
locale(plasma5-pk-updates:et) \
locale(plasma5-pk-updates:eu) \
locale(plasma5-pk-updates:fi) \
locale(plasma5-pk-updates:fr) \
locale(plasma5-pk-updates:gl) \
locale(plasma5-pk-updates:he) \
locale(plasma5-pk-updates:hu) \
locale(plasma5-pk-updates:id) \
locale(plasma5-pk-updates:it) \
locale(plasma5-pk-updates:ja) \
locale(plasma5-pk-updates:ko) \
locale(plasma5-pk-updates:lt) \
locale(plasma5-pk-updates:nl) \
locale(plasma5-pk-updates:nn) \
locale(plasma5-pk-updates:pa) \
locale(plasma5-pk-updates:pl) \
locale(plasma5-pk-updates:pt) \
locale(plasma5-pk-updates:pt_BR) \
locale(plasma5-pk-updates:ro) \
locale(plasma5-pk-updates:ru) \
locale(plasma5-pk-updates:sk) \
locale(plasma5-pk-updates:sl) \
locale(plasma5-pk-updates:sv) \
locale(plasma5-pk-updates:tr) \
locale(plasma5-pk-updates:uk) \
locale(plasma5-pk-updates:zh_CN) \
locale(plasma5-pk-updates:zh_TW) \
plasma5-pk-updates-lang \
plasma5-pk-updates-lang-all"

RDEPENDS:${PN} += "plasma5-pk-updates"

inherit rpm
