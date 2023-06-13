SUMMARY = "Translations for package libgda-6_0-6_0_0"
DESCRIPTION = "Provides translations for the 'libgda-6_0-6_0_0' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-6_0_0-lang-6.0.0-6.7.noarch.rpm"
RPM_HASH = "fa51a0e153d5cd6c9509cf4b699beb40fe65eab56f352a5ec29cba27e8ff68fee360852c47214a83fb2c740827e0998c6085c7c26a62efdcee08542a55960f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgda-6_0-6_0_0-lang \
libgda-6_0-6_0_0-lang-all \
locale(libgda-6_0-6_0_0:ar) \
locale(libgda-6_0-6_0_0:az) \
locale(libgda-6_0-6_0_0:bs) \
locale(libgda-6_0-6_0_0:ca) \
locale(libgda-6_0-6_0_0:ca@valencia) \
locale(libgda-6_0-6_0_0:cs) \
locale(libgda-6_0-6_0_0:da) \
locale(libgda-6_0-6_0_0:de) \
locale(libgda-6_0-6_0_0:dz) \
locale(libgda-6_0-6_0_0:el) \
locale(libgda-6_0-6_0_0:en_CA) \
locale(libgda-6_0-6_0_0:en_GB) \
locale(libgda-6_0-6_0_0:eo) \
locale(libgda-6_0-6_0_0:es) \
locale(libgda-6_0-6_0_0:eu) \
locale(libgda-6_0-6_0_0:fa) \
locale(libgda-6_0-6_0_0:fi) \
locale(libgda-6_0-6_0_0:fr) \
locale(libgda-6_0-6_0_0:ga) \
locale(libgda-6_0-6_0_0:gl) \
locale(libgda-6_0-6_0_0:hr) \
locale(libgda-6_0-6_0_0:hu) \
locale(libgda-6_0-6_0_0:id) \
locale(libgda-6_0-6_0_0:it) \
locale(libgda-6_0-6_0_0:ja) \
locale(libgda-6_0-6_0_0:ko) \
locale(libgda-6_0-6_0_0:lt) \
locale(libgda-6_0-6_0_0:lv) \
locale(libgda-6_0-6_0_0:mk) \
locale(libgda-6_0-6_0_0:ml) \
locale(libgda-6_0-6_0_0:ms) \
locale(libgda-6_0-6_0_0:nb) \
locale(libgda-6_0-6_0_0:ne) \
locale(libgda-6_0-6_0_0:nl) \
locale(libgda-6_0-6_0_0:oc) \
locale(libgda-6_0-6_0_0:pa) \
locale(libgda-6_0-6_0_0:pt) \
locale(libgda-6_0-6_0_0:pt_BR) \
locale(libgda-6_0-6_0_0:ro) \
locale(libgda-6_0-6_0_0:ru) \
locale(libgda-6_0-6_0_0:sk) \
locale(libgda-6_0-6_0_0:sl) \
locale(libgda-6_0-6_0_0:sq) \
locale(libgda-6_0-6_0_0:sr) \
locale(libgda-6_0-6_0_0:sr@latin) \
locale(libgda-6_0-6_0_0:sv) \
locale(libgda-6_0-6_0_0:tr) \
locale(libgda-6_0-6_0_0:uk) \
locale(libgda-6_0-6_0_0:vi) \
locale(libgda-6_0-6_0_0:zh_CN) \
locale(libgda-6_0-6_0_0:zh_HK) \
locale(libgda-6_0-6_0_0:zh_TW)"

RDEPENDS:${PN} += "libgda-6_0-6_0_0"

inherit rpm
