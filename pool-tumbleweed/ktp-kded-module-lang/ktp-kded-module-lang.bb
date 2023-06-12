SUMMARY = "Translations for package ktp-kded-module"
DESCRIPTION = "Provides translations for the 'ktp-kded-module' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-kded-module-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "6220fa7ec71e93508b10a843dd0a661691be778670f3727861c1330c27434caa13a4ca2afc19c99c98181d78447c33733fc65a316740018b2fb5be73ef02d1d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-kded-module-lang \
ktp-kded-module-lang-all \
locale(ktp-kded-module:ar) \
locale(ktp-kded-module:bs) \
locale(ktp-kded-module:ca) \
locale(ktp-kded-module:ca@valencia) \
locale(ktp-kded-module:cs) \
locale(ktp-kded-module:da) \
locale(ktp-kded-module:de) \
locale(ktp-kded-module:el) \
locale(ktp-kded-module:en_GB) \
locale(ktp-kded-module:es) \
locale(ktp-kded-module:et) \
locale(ktp-kded-module:eu) \
locale(ktp-kded-module:fi) \
locale(ktp-kded-module:fr) \
locale(ktp-kded-module:ga) \
locale(ktp-kded-module:gl) \
locale(ktp-kded-module:hu) \
locale(ktp-kded-module:ia) \
locale(ktp-kded-module:it) \
locale(ktp-kded-module:ja) \
locale(ktp-kded-module:ka) \
locale(ktp-kded-module:kk) \
locale(ktp-kded-module:km) \
locale(ktp-kded-module:ko) \
locale(ktp-kded-module:lt) \
locale(ktp-kded-module:mr) \
locale(ktp-kded-module:nb) \
locale(ktp-kded-module:nds) \
locale(ktp-kded-module:nl) \
locale(ktp-kded-module:nn) \
locale(ktp-kded-module:pa) \
locale(ktp-kded-module:pl) \
locale(ktp-kded-module:pt) \
locale(ktp-kded-module:pt_BR) \
locale(ktp-kded-module:ro) \
locale(ktp-kded-module:ru) \
locale(ktp-kded-module:sk) \
locale(ktp-kded-module:sl) \
locale(ktp-kded-module:sr) \
locale(ktp-kded-module:sr@ijekavian) \
locale(ktp-kded-module:sr@ijekavianlatin) \
locale(ktp-kded-module:sr@latin) \
locale(ktp-kded-module:sv) \
locale(ktp-kded-module:tr) \
locale(ktp-kded-module:ug) \
locale(ktp-kded-module:uk) \
locale(ktp-kded-module:zh_CN) \
locale(ktp-kded-module:zh_TW)"
RDEPENDS:${PN} += "ktp-kded-module"

inherit rpm
