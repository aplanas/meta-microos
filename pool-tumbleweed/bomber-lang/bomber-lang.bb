SUMMARY = "Translations for package bomber"
DESCRIPTION = "Provides translations for the 'bomber' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "bomber-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "7d8a865aeada015e7fe6b2987445775f2ca5d6c97f0342e80f64658a4f33ec2d4504c1ef9e08d7689add79ff48ac40bf13f1e616eb4f74dce37d51a39d963565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bomber-lang \
bomber-lang-all \
locale(bomber:ar) \
locale(bomber:bg) \
locale(bomber:bs) \
locale(bomber:ca) \
locale(bomber:ca@valencia) \
locale(bomber:cs) \
locale(bomber:da) \
locale(bomber:de) \
locale(bomber:el) \
locale(bomber:en_GB) \
locale(bomber:eo) \
locale(bomber:es) \
locale(bomber:et) \
locale(bomber:eu) \
locale(bomber:fi) \
locale(bomber:fr) \
locale(bomber:ga) \
locale(bomber:gl) \
locale(bomber:gu) \
locale(bomber:he) \
locale(bomber:hr) \
locale(bomber:hu) \
locale(bomber:id) \
locale(bomber:is) \
locale(bomber:it) \
locale(bomber:ja) \
locale(bomber:ka) \
locale(bomber:kk) \
locale(bomber:km) \
locale(bomber:ko) \
locale(bomber:lt) \
locale(bomber:lv) \
locale(bomber:mai) \
locale(bomber:ml) \
locale(bomber:mr) \
locale(bomber:ms) \
locale(bomber:nb) \
locale(bomber:nds) \
locale(bomber:nl) \
locale(bomber:nn) \
locale(bomber:pa) \
locale(bomber:pl) \
locale(bomber:pt) \
locale(bomber:pt_BR) \
locale(bomber:ro) \
locale(bomber:ru) \
locale(bomber:sk) \
locale(bomber:sl) \
locale(bomber:sq) \
locale(bomber:sr) \
locale(bomber:sr@ijekavian) \
locale(bomber:sr@ijekavianlatin) \
locale(bomber:sr@latin) \
locale(bomber:sv) \
locale(bomber:th) \
locale(bomber:tr) \
locale(bomber:ug) \
locale(bomber:uk) \
locale(bomber:zh_CN) \
locale(bomber:zh_TW)"
RDEPENDS:${PN} += "bomber"

inherit rpm