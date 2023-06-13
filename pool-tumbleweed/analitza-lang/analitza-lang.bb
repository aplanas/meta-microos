SUMMARY = "Translations for package analitza"
DESCRIPTION = "Provides translations for the 'analitza' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "analitza-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f6e6ae0453ebbbab7d029f0e1fde2eb31d6c2781e788e3defdbec3e5470e473390072b8afefff71d790f206172c7b28c1a98c3730edbb43538cb798a7ec726f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analitza-lang \
analitza-lang-all \
locale(analitza:ar) \
locale(analitza:bs) \
locale(analitza:ca) \
locale(analitza:ca@valencia) \
locale(analitza:cs) \
locale(analitza:da) \
locale(analitza:de) \
locale(analitza:el) \
locale(analitza:en_GB) \
locale(analitza:es) \
locale(analitza:et) \
locale(analitza:eu) \
locale(analitza:fi) \
locale(analitza:fr) \
locale(analitza:ga) \
locale(analitza:gl) \
locale(analitza:hu) \
locale(analitza:ia) \
locale(analitza:it) \
locale(analitza:ja) \
locale(analitza:ka) \
locale(analitza:kk) \
locale(analitza:ko) \
locale(analitza:lt) \
locale(analitza:lv) \
locale(analitza:ml) \
locale(analitza:mr) \
locale(analitza:nb) \
locale(analitza:nds) \
locale(analitza:nl) \
locale(analitza:nn) \
locale(analitza:pl) \
locale(analitza:pt) \
locale(analitza:pt_BR) \
locale(analitza:ru) \
locale(analitza:sk) \
locale(analitza:sl) \
locale(analitza:sv) \
locale(analitza:tr) \
locale(analitza:ug) \
locale(analitza:uk) \
locale(analitza:zh_CN) \
locale(analitza:zh_TW)"

RDEPENDS:${PN} += "analitza"

inherit rpm
