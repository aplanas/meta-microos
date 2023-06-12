SUMMARY = "Translations for package malcontent"
DESCRIPTION = "Provides translations for the 'malcontent' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-lang-0.10.4-1.5.noarch.rpm"
RPM_HASH = "ba83bf338b0870641dde14f2a4d3f50b254a31ea53c3f22c2054c6f963007169fb3fd923ded61574573113989637447802a8333f8684b36272e072856b2297cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(malcontent:af) \
locale(malcontent:ar) \
locale(malcontent:bg) \
locale(malcontent:bn) \
locale(malcontent:ca) \
locale(malcontent:ca@valencia) \
locale(malcontent:cs) \
locale(malcontent:da) \
locale(malcontent:de) \
locale(malcontent:el) \
locale(malcontent:eo) \
locale(malcontent:es) \
locale(malcontent:eu) \
locale(malcontent:fa) \
locale(malcontent:fi) \
locale(malcontent:fr) \
locale(malcontent:fur) \
locale(malcontent:gd) \
locale(malcontent:gl) \
locale(malcontent:he) \
locale(malcontent:hi) \
locale(malcontent:hr) \
locale(malcontent:hu) \
locale(malcontent:id) \
locale(malcontent:it) \
locale(malcontent:kk) \
locale(malcontent:ko) \
locale(malcontent:lt) \
locale(malcontent:lv) \
locale(malcontent:ml) \
locale(malcontent:ms) \
locale(malcontent:nb) \
locale(malcontent:nl) \
locale(malcontent:oc) \
locale(malcontent:pa) \
locale(malcontent:pl) \
locale(malcontent:pt) \
locale(malcontent:pt_BR) \
locale(malcontent:ro) \
locale(malcontent:ru) \
locale(malcontent:sk) \
locale(malcontent:sl) \
locale(malcontent:sr) \
locale(malcontent:sr@latin) \
locale(malcontent:sv) \
locale(malcontent:th) \
locale(malcontent:tr) \
locale(malcontent:uk) \
locale(malcontent:vi) \
locale(malcontent:zh_TW) \
malcontent-lang \
malcontent-lang-all"
RDEPENDS:${PN} += "malcontent"

inherit rpm
