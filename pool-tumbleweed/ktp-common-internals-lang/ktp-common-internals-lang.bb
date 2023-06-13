SUMMARY = "Translations for package ktp-common-internals"
DESCRIPTION = "Provides translations for the 'ktp-common-internals' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-common-internals-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "60b548c78fbb6f15c820c4702617d4799a0813c2a5640d8a3bfc4b32dca41f2e508495dd1be95b6fa66ffb0c9fd7a8b016857759894b06675dfeb26b5a46c6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-common-internals-lang \
ktp-common-internals-lang-all \
locale(ktp-common-internals:ar) \
locale(ktp-common-internals:bs) \
locale(ktp-common-internals:ca) \
locale(ktp-common-internals:ca@valencia) \
locale(ktp-common-internals:cs) \
locale(ktp-common-internals:da) \
locale(ktp-common-internals:de) \
locale(ktp-common-internals:el) \
locale(ktp-common-internals:en_GB) \
locale(ktp-common-internals:es) \
locale(ktp-common-internals:et) \
locale(ktp-common-internals:eu) \
locale(ktp-common-internals:fi) \
locale(ktp-common-internals:fr) \
locale(ktp-common-internals:ga) \
locale(ktp-common-internals:gl) \
locale(ktp-common-internals:hu) \
locale(ktp-common-internals:ia) \
locale(ktp-common-internals:it) \
locale(ktp-common-internals:ja) \
locale(ktp-common-internals:ka) \
locale(ktp-common-internals:kk) \
locale(ktp-common-internals:ko) \
locale(ktp-common-internals:lt) \
locale(ktp-common-internals:mr) \
locale(ktp-common-internals:nb) \
locale(ktp-common-internals:nds) \
locale(ktp-common-internals:nl) \
locale(ktp-common-internals:nn) \
locale(ktp-common-internals:pa) \
locale(ktp-common-internals:pl) \
locale(ktp-common-internals:pt) \
locale(ktp-common-internals:pt_BR) \
locale(ktp-common-internals:ro) \
locale(ktp-common-internals:ru) \
locale(ktp-common-internals:sk) \
locale(ktp-common-internals:sl) \
locale(ktp-common-internals:sr) \
locale(ktp-common-internals:sr@ijekavian) \
locale(ktp-common-internals:sr@ijekavianlatin) \
locale(ktp-common-internals:sr@latin) \
locale(ktp-common-internals:sv) \
locale(ktp-common-internals:tr) \
locale(ktp-common-internals:ug) \
locale(ktp-common-internals:uk) \
locale(ktp-common-internals:zh_CN) \
locale(ktp-common-internals:zh_TW)"

RDEPENDS:${PN} += "ktp-common-internals"

inherit rpm
