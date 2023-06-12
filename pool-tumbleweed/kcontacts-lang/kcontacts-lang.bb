SUMMARY = "Translations for package kcontacts"
DESCRIPTION = "Provides translations for the 'kcontacts' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcontacts-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "725f30ea0625f93fa57204af5095b4e88c3af000b28db0765ca9df918a05648c23b1d2a5cea628bea1894c0107f76b7b71a3010d4f60b2d198942988d8942382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcontacts-lang \
kcontacts-lang-all \
locale(kcontacts:ar) \
locale(kcontacts:az) \
locale(kcontacts:be) \
locale(kcontacts:bg) \
locale(kcontacts:bs) \
locale(kcontacts:ca) \
locale(kcontacts:ca@valencia) \
locale(kcontacts:cs) \
locale(kcontacts:da) \
locale(kcontacts:de) \
locale(kcontacts:el) \
locale(kcontacts:en_GB) \
locale(kcontacts:eo) \
locale(kcontacts:es) \
locale(kcontacts:et) \
locale(kcontacts:eu) \
locale(kcontacts:fi) \
locale(kcontacts:fr) \
locale(kcontacts:ga) \
locale(kcontacts:gl) \
locale(kcontacts:hi) \
locale(kcontacts:hu) \
locale(kcontacts:ia) \
locale(kcontacts:id) \
locale(kcontacts:it) \
locale(kcontacts:ja) \
locale(kcontacts:ka) \
locale(kcontacts:kk) \
locale(kcontacts:km) \
locale(kcontacts:ko) \
locale(kcontacts:lt) \
locale(kcontacts:lv) \
locale(kcontacts:mai) \
locale(kcontacts:ml) \
locale(kcontacts:mr) \
locale(kcontacts:nb) \
locale(kcontacts:nds) \
locale(kcontacts:nl) \
locale(kcontacts:nn) \
locale(kcontacts:pa) \
locale(kcontacts:pl) \
locale(kcontacts:pt) \
locale(kcontacts:pt_BR) \
locale(kcontacts:ro) \
locale(kcontacts:ru) \
locale(kcontacts:sk) \
locale(kcontacts:sl) \
locale(kcontacts:sq) \
locale(kcontacts:sr) \
locale(kcontacts:sr@ijekavian) \
locale(kcontacts:sr@ijekavianlatin) \
locale(kcontacts:sr@latin) \
locale(kcontacts:sv) \
locale(kcontacts:th) \
locale(kcontacts:tr) \
locale(kcontacts:ug) \
locale(kcontacts:uk) \
locale(kcontacts:zh_CN) \
locale(kcontacts:zh_TW)"
RDEPENDS:${PN} += "kcontacts"

inherit rpm
