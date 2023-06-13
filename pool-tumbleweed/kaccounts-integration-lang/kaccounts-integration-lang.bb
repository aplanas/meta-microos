SUMMARY = "Translations for package kaccounts-integration"
DESCRIPTION = "Provides translations for the 'kaccounts-integration' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kaccounts-integration-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "2b01904af20fd9f2245677049b93c0ddced101b972fe494c275ef194a95e9afe682147eff13f6edbde967629a7c15b5c065fbc655db07f53e41fc9cbdc771245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaccounts-integration-lang \
kaccounts-integration-lang-all \
locale(kaccounts-integration:ar) \
locale(kaccounts-integration:az) \
locale(kaccounts-integration:bg) \
locale(kaccounts-integration:bs) \
locale(kaccounts-integration:ca) \
locale(kaccounts-integration:ca@valencia) \
locale(kaccounts-integration:cs) \
locale(kaccounts-integration:da) \
locale(kaccounts-integration:de) \
locale(kaccounts-integration:el) \
locale(kaccounts-integration:en_GB) \
locale(kaccounts-integration:es) \
locale(kaccounts-integration:et) \
locale(kaccounts-integration:eu) \
locale(kaccounts-integration:fi) \
locale(kaccounts-integration:fr) \
locale(kaccounts-integration:gl) \
locale(kaccounts-integration:hu) \
locale(kaccounts-integration:ia) \
locale(kaccounts-integration:id) \
locale(kaccounts-integration:it) \
locale(kaccounts-integration:ja) \
locale(kaccounts-integration:ka) \
locale(kaccounts-integration:ko) \
locale(kaccounts-integration:lt) \
locale(kaccounts-integration:nl) \
locale(kaccounts-integration:nn) \
locale(kaccounts-integration:pa) \
locale(kaccounts-integration:pl) \
locale(kaccounts-integration:pt) \
locale(kaccounts-integration:pt_BR) \
locale(kaccounts-integration:ro) \
locale(kaccounts-integration:ru) \
locale(kaccounts-integration:sk) \
locale(kaccounts-integration:sl) \
locale(kaccounts-integration:sr) \
locale(kaccounts-integration:sr@ijekavian) \
locale(kaccounts-integration:sr@ijekavianlatin) \
locale(kaccounts-integration:sr@latin) \
locale(kaccounts-integration:sv) \
locale(kaccounts-integration:tr) \
locale(kaccounts-integration:uk) \
locale(kaccounts-integration:zh_CN) \
locale(kaccounts-integration:zh_TW)"

RDEPENDS:${PN} += "kaccounts-integration"

inherit rpm
