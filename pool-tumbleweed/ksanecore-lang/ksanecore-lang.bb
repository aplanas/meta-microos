SUMMARY = "Translations for package ksanecore"
DESCRIPTION = "Provides translations for the 'ksanecore' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "ksanecore-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "5bbdd7817ee49fcd0db5f08f0086c47211459cc22a4fbbbedeeb16a6f6475597437ea972bd21d357ba3c5feece54dd1a02f63eaaf741b4ecdc3dcab701dd324c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksanecore-lang \
ksanecore-lang-all \
locale(ksanecore:ar) \
locale(ksanecore:bg) \
locale(ksanecore:ca) \
locale(ksanecore:ca@valencia) \
locale(ksanecore:cs) \
locale(ksanecore:de) \
locale(ksanecore:en_GB) \
locale(ksanecore:es) \
locale(ksanecore:eu) \
locale(ksanecore:fi) \
locale(ksanecore:fr) \
locale(ksanecore:gl) \
locale(ksanecore:hi) \
locale(ksanecore:it) \
locale(ksanecore:ja) \
locale(ksanecore:ka) \
locale(ksanecore:ko) \
locale(ksanecore:lt) \
locale(ksanecore:nl) \
locale(ksanecore:nn) \
locale(ksanecore:pl) \
locale(ksanecore:pt) \
locale(ksanecore:pt_BR) \
locale(ksanecore:ro) \
locale(ksanecore:ru) \
locale(ksanecore:sk) \
locale(ksanecore:sl) \
locale(ksanecore:sv) \
locale(ksanecore:tr) \
locale(ksanecore:uk) \
locale(ksanecore:zh_CN) \
locale(ksanecore:zh_TW)"

RDEPENDS:${PN} += "ksanecore"

inherit rpm
