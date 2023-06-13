SUMMARY = "Translations for package ibus"
DESCRIPTION = "Provides translations for the 'ibus' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-lang-1.5.28-2.1.noarch.rpm"
RPM_HASH = "edf884dc762e8b47187b60b2683e623366a35b17739f8172b7cc8b5cfc9289d0d64f02653a3181848a9a03f37204bc96405263303a3f8eed2cbc315f510165cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-lang \
ibus-lang-all \
locale(ibus:ar) \
locale(ibus:as) \
locale(ibus:bg) \
locale(ibus:bn) \
locale(ibus:bn_IN) \
locale(ibus:ca) \
locale(ibus:cs) \
locale(ibus:da) \
locale(ibus:de) \
locale(ibus:en_GB) \
locale(ibus:es) \
locale(ibus:et) \
locale(ibus:eu) \
locale(ibus:fa) \
locale(ibus:fi) \
locale(ibus:fr) \
locale(ibus:gu) \
locale(ibus:he) \
locale(ibus:hi) \
locale(ibus:hu) \
locale(ibus:ia) \
locale(ibus:id) \
locale(ibus:it) \
locale(ibus:ja) \
locale(ibus:ka) \
locale(ibus:kn) \
locale(ibus:ko) \
locale(ibus:lv) \
locale(ibus:ml) \
locale(ibus:mr) \
locale(ibus:nb) \
locale(ibus:nl) \
locale(ibus:oc) \
locale(ibus:or) \
locale(ibus:pa) \
locale(ibus:pl) \
locale(ibus:pt) \
locale(ibus:pt_BR) \
locale(ibus:ru) \
locale(ibus:sq) \
locale(ibus:sr) \
locale(ibus:sr@latin) \
locale(ibus:sv) \
locale(ibus:ta) \
locale(ibus:te) \
locale(ibus:tr) \
locale(ibus:uk) \
locale(ibus:vi) \
locale(ibus:zh_CN) \
locale(ibus:zh_HK) \
locale(ibus:zh_TW)"

RDEPENDS:${PN} += "ibus"

inherit rpm
