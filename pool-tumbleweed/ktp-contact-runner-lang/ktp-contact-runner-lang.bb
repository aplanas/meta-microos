SUMMARY = "Translations for package ktp-contact-runner"
DESCRIPTION = "Provides translations for the 'ktp-contact-runner' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-contact-runner-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "9c52c443eb3dc2c700e7c013431900b0d33367e8698dc4ce2eeeae73d20418a419f4cfdba3b33e201b262f4a8639d28ded2f94265b931a71d34b2cf0f2479973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-contact-runner-lang \
ktp-contact-runner-lang-all \
locale(ktp-contact-runner:bs) \
locale(ktp-contact-runner:ca) \
locale(ktp-contact-runner:ca@valencia) \
locale(ktp-contact-runner:cs) \
locale(ktp-contact-runner:da) \
locale(ktp-contact-runner:de) \
locale(ktp-contact-runner:el) \
locale(ktp-contact-runner:en_GB) \
locale(ktp-contact-runner:es) \
locale(ktp-contact-runner:et) \
locale(ktp-contact-runner:eu) \
locale(ktp-contact-runner:fi) \
locale(ktp-contact-runner:fr) \
locale(ktp-contact-runner:ga) \
locale(ktp-contact-runner:gl) \
locale(ktp-contact-runner:hu) \
locale(ktp-contact-runner:ia) \
locale(ktp-contact-runner:it) \
locale(ktp-contact-runner:ja) \
locale(ktp-contact-runner:ka) \
locale(ktp-contact-runner:kk) \
locale(ktp-contact-runner:km) \
locale(ktp-contact-runner:ko) \
locale(ktp-contact-runner:lt) \
locale(ktp-contact-runner:mr) \
locale(ktp-contact-runner:nb) \
locale(ktp-contact-runner:nds) \
locale(ktp-contact-runner:nl) \
locale(ktp-contact-runner:nn) \
locale(ktp-contact-runner:pa) \
locale(ktp-contact-runner:pl) \
locale(ktp-contact-runner:pt) \
locale(ktp-contact-runner:pt_BR) \
locale(ktp-contact-runner:ro) \
locale(ktp-contact-runner:ru) \
locale(ktp-contact-runner:sk) \
locale(ktp-contact-runner:sl) \
locale(ktp-contact-runner:sr) \
locale(ktp-contact-runner:sr@ijekavian) \
locale(ktp-contact-runner:sr@ijekavianlatin) \
locale(ktp-contact-runner:sr@latin) \
locale(ktp-contact-runner:sv) \
locale(ktp-contact-runner:tr) \
locale(ktp-contact-runner:ug) \
locale(ktp-contact-runner:uk) \
locale(ktp-contact-runner:vi) \
locale(ktp-contact-runner:zh_CN) \
locale(ktp-contact-runner:zh_TW)"

RDEPENDS:${PN} += "ktp-contact-runner"

inherit rpm
