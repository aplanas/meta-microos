SUMMARY = "Translations for package purpose"
DESCRIPTION = "Provides translations for the 'purpose' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "purpose-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "a4326f8ff05a1a369e5f72c2e0a5dc8e98a39e649bc4a2411443142e25e5acb786e1d744a2b44ff2db563aa8af8b04ac66c53885d77b89b6b6f0e43f05cd41a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(purpose:ar) \
locale(purpose:az) \
locale(purpose:bg) \
locale(purpose:ca) \
locale(purpose:ca@valencia) \
locale(purpose:cs) \
locale(purpose:da) \
locale(purpose:de) \
locale(purpose:el) \
locale(purpose:en_GB) \
locale(purpose:es) \
locale(purpose:et) \
locale(purpose:eu) \
locale(purpose:fi) \
locale(purpose:fr) \
locale(purpose:gl) \
locale(purpose:hu) \
locale(purpose:ia) \
locale(purpose:id) \
locale(purpose:it) \
locale(purpose:ja) \
locale(purpose:ka) \
locale(purpose:ko) \
locale(purpose:lt) \
locale(purpose:ml) \
locale(purpose:nb) \
locale(purpose:nl) \
locale(purpose:nn) \
locale(purpose:pl) \
locale(purpose:pt) \
locale(purpose:pt_BR) \
locale(purpose:ro) \
locale(purpose:ru) \
locale(purpose:sk) \
locale(purpose:sl) \
locale(purpose:sq) \
locale(purpose:sv) \
locale(purpose:ta) \
locale(purpose:tr) \
locale(purpose:uk) \
locale(purpose:zh_CN) \
locale(purpose:zh_TW) \
purpose-lang \
purpose-lang-all"
RDEPENDS:${PN} += "purpose"

inherit rpm
