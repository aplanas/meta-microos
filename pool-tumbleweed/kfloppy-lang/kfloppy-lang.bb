SUMMARY = "Translations for package kfloppy"
DESCRIPTION = "Provides translations for the 'kfloppy' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kfloppy-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "d2042c3befb05d046d1e981444fe066885f800a7d68faef09e702666bfae3bcb91194595dea81e0da724566dfaaa908e28942c1c6d6bff6a566a97d5bf145edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfloppy-lang \
kfloppy-lang-all \
locale(kfloppy:af) \
locale(kfloppy:ar) \
locale(kfloppy:be) \
locale(kfloppy:bg) \
locale(kfloppy:br) \
locale(kfloppy:bs) \
locale(kfloppy:ca) \
locale(kfloppy:ca@valencia) \
locale(kfloppy:cs) \
locale(kfloppy:cy) \
locale(kfloppy:da) \
locale(kfloppy:de) \
locale(kfloppy:el) \
locale(kfloppy:en_GB) \
locale(kfloppy:eo) \
locale(kfloppy:es) \
locale(kfloppy:et) \
locale(kfloppy:eu) \
locale(kfloppy:fa) \
locale(kfloppy:fi) \
locale(kfloppy:fr) \
locale(kfloppy:ga) \
locale(kfloppy:gl) \
locale(kfloppy:he) \
locale(kfloppy:hi) \
locale(kfloppy:hr) \
locale(kfloppy:hu) \
locale(kfloppy:ia) \
locale(kfloppy:id) \
locale(kfloppy:is) \
locale(kfloppy:it) \
locale(kfloppy:ja) \
locale(kfloppy:ka) \
locale(kfloppy:kk) \
locale(kfloppy:km) \
locale(kfloppy:ko) \
locale(kfloppy:lt) \
locale(kfloppy:lv) \
locale(kfloppy:mk) \
locale(kfloppy:mr) \
locale(kfloppy:ms) \
locale(kfloppy:nb) \
locale(kfloppy:nds) \
locale(kfloppy:ne) \
locale(kfloppy:nl) \
locale(kfloppy:nn) \
locale(kfloppy:oc) \
locale(kfloppy:pa) \
locale(kfloppy:pl) \
locale(kfloppy:pt) \
locale(kfloppy:pt_BR) \
locale(kfloppy:ro) \
locale(kfloppy:ru) \
locale(kfloppy:sk) \
locale(kfloppy:sl) \
locale(kfloppy:sq) \
locale(kfloppy:sr) \
locale(kfloppy:sr@ijekavian) \
locale(kfloppy:sr@ijekavianlatin) \
locale(kfloppy:sr@latin) \
locale(kfloppy:sv) \
locale(kfloppy:ta) \
locale(kfloppy:th) \
locale(kfloppy:tr) \
locale(kfloppy:ug) \
locale(kfloppy:uk) \
locale(kfloppy:wa) \
locale(kfloppy:zh_CN) \
locale(kfloppy:zh_TW)"

RDEPENDS:${PN} += "kfloppy"

inherit rpm
