SUMMARY = "Translations for package kmarkdownwebview"
DESCRIPTION = "Provides translations for the 'kmarkdownwebview' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "kmarkdownwebview-lang-0.5.6-1.12.noarch.rpm"
RPM_HASH = "d2327f20f679ee0c4e8dc66edc03c390b192699d9d4df8af821c5d524d155bd125e22cd3961297319b2efccf44dd8d7296cecf687d3deaa5736ab3983f13b92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmarkdownwebview-lang \
kmarkdownwebview-lang-all \
locale(kmarkdownwebview:ar) \
locale(kmarkdownwebview:bg) \
locale(kmarkdownwebview:bs) \
locale(kmarkdownwebview:ca) \
locale(kmarkdownwebview:ca@valencia) \
locale(kmarkdownwebview:cs) \
locale(kmarkdownwebview:da) \
locale(kmarkdownwebview:de) \
locale(kmarkdownwebview:el) \
locale(kmarkdownwebview:en_GB) \
locale(kmarkdownwebview:eo) \
locale(kmarkdownwebview:es) \
locale(kmarkdownwebview:et) \
locale(kmarkdownwebview:eu) \
locale(kmarkdownwebview:fa) \
locale(kmarkdownwebview:fi) \
locale(kmarkdownwebview:fr) \
locale(kmarkdownwebview:ga) \
locale(kmarkdownwebview:gl) \
locale(kmarkdownwebview:hu) \
locale(kmarkdownwebview:it) \
locale(kmarkdownwebview:kk) \
locale(kmarkdownwebview:km) \
locale(kmarkdownwebview:ko) \
locale(kmarkdownwebview:lt) \
locale(kmarkdownwebview:mai) \
locale(kmarkdownwebview:mr) \
locale(kmarkdownwebview:ms) \
locale(kmarkdownwebview:nb) \
locale(kmarkdownwebview:nds) \
locale(kmarkdownwebview:nl) \
locale(kmarkdownwebview:nn) \
locale(kmarkdownwebview:pa) \
locale(kmarkdownwebview:pl) \
locale(kmarkdownwebview:pt) \
locale(kmarkdownwebview:pt_BR) \
locale(kmarkdownwebview:ro) \
locale(kmarkdownwebview:ru) \
locale(kmarkdownwebview:sk) \
locale(kmarkdownwebview:sl) \
locale(kmarkdownwebview:sr) \
locale(kmarkdownwebview:sr@ijekavian) \
locale(kmarkdownwebview:sr@ijekavianlatin) \
locale(kmarkdownwebview:sr@latin) \
locale(kmarkdownwebview:sv) \
locale(kmarkdownwebview:th) \
locale(kmarkdownwebview:tr) \
locale(kmarkdownwebview:ug) \
locale(kmarkdownwebview:uk) \
locale(kmarkdownwebview:zh_CN) \
locale(kmarkdownwebview:zh_TW)"
RDEPENDS:${PN} += "kmarkdownwebview"

inherit rpm
