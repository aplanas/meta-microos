SUMMARY = "Translations for package diffutils"
DESCRIPTION = "Provides translations for the 'diffutils' package."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.10"

RPM_NAME = "diffutils-lang-3.10-1.1.noarch.rpm"
RPM_HASH = "00efe227954a3d1d003ce2b97c0d2f8fc48d3dce8cc86bee8f3fb5a70317cd57ae1cb60ee7ef8ae66a166bf06f1a80a278e8b0a132ac264734644a589e0756fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffutils-lang \
diffutils-lang-all \
locale(diffutils:bg) \
locale(diffutils:ca) \
locale(diffutils:cs) \
locale(diffutils:da) \
locale(diffutils:de) \
locale(diffutils:el) \
locale(diffutils:eo) \
locale(diffutils:es) \
locale(diffutils:fi) \
locale(diffutils:fr) \
locale(diffutils:ga) \
locale(diffutils:gl) \
locale(diffutils:he) \
locale(diffutils:hr) \
locale(diffutils:hu) \
locale(diffutils:id) \
locale(diffutils:it) \
locale(diffutils:ja) \
locale(diffutils:ka) \
locale(diffutils:ko) \
locale(diffutils:lv) \
locale(diffutils:ms) \
locale(diffutils:nb) \
locale(diffutils:nl) \
locale(diffutils:pl) \
locale(diffutils:pt) \
locale(diffutils:pt_BR) \
locale(diffutils:ro) \
locale(diffutils:ru) \
locale(diffutils:sr) \
locale(diffutils:sv) \
locale(diffutils:tr) \
locale(diffutils:uk) \
locale(diffutils:vi) \
locale(diffutils:zh_CN) \
locale(diffutils:zh_TW)"
RDEPENDS:${PN} += "diffutils"

inherit rpm
