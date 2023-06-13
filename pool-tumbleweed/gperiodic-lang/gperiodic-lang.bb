SUMMARY = "Translations for package gperiodic"
DESCRIPTION = "Provides translations for the 'gperiodic' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "gperiodic-lang-3.0.3-2.12.noarch.rpm"
RPM_HASH = "e65bece0ae6efd6bb56af50b1c34f175836d89faf89b8c0bbea9687e84756ebab9d73278c5dc1029419a207ad9c5af78b1a3e3e5f24b35b04b30482429748169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gperiodic-lang \
gperiodic-lang-all \
locale(gperiodic:ast) \
locale(gperiodic:be) \
locale(gperiodic:bg) \
locale(gperiodic:ca) \
locale(gperiodic:cs) \
locale(gperiodic:da) \
locale(gperiodic:de) \
locale(gperiodic:es) \
locale(gperiodic:fi) \
locale(gperiodic:fr) \
locale(gperiodic:gl) \
locale(gperiodic:id) \
locale(gperiodic:is) \
locale(gperiodic:it) \
locale(gperiodic:lt) \
locale(gperiodic:ms) \
locale(gperiodic:nl) \
locale(gperiodic:oc) \
locale(gperiodic:pl) \
locale(gperiodic:pt) \
locale(gperiodic:pt_BR) \
locale(gperiodic:ru) \
locale(gperiodic:sr) \
locale(gperiodic:sv) \
locale(gperiodic:tr) \
locale(gperiodic:uk) \
locale(gperiodic:zh_CN)"

RDEPENDS:${PN} += "gperiodic"

inherit rpm
