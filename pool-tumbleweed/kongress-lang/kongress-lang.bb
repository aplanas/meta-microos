SUMMARY = "Translations for package kongress"
DESCRIPTION = "Provides translations for the 'kongress' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kongress-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "a0d3e9d9f7c479f45afa05591b3f88853291113570236cf81650b908e38cfdca248528e86e0c3f339f3a27dc8b8abd9602620419c6ed64eac2ad772b1a2878b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kongress-lang \
kongress-lang-all \
locale(kongress:ca) \
locale(kongress:ca@valencia) \
locale(kongress:cs) \
locale(kongress:da) \
locale(kongress:de) \
locale(kongress:el) \
locale(kongress:en_GB) \
locale(kongress:es) \
locale(kongress:et) \
locale(kongress:fi) \
locale(kongress:fr) \
locale(kongress:gl) \
locale(kongress:ia) \
locale(kongress:it) \
locale(kongress:ja) \
locale(kongress:ka) \
locale(kongress:ko) \
locale(kongress:lt) \
locale(kongress:nl) \
locale(kongress:nn) \
locale(kongress:pa) \
locale(kongress:pl) \
locale(kongress:pt) \
locale(kongress:pt_BR) \
locale(kongress:ro) \
locale(kongress:ru) \
locale(kongress:sk) \
locale(kongress:sl) \
locale(kongress:sv) \
locale(kongress:tr) \
locale(kongress:uk) \
locale(kongress:zh_CN) \
locale(kongress:zh_TW)"

RDEPENDS:${PN} += "kongress"

inherit rpm
