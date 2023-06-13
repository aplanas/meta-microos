SUMMARY = "Translations for package kgamma5"
DESCRIPTION = "Provides translations for the 'kgamma5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kgamma5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "541cc72c8c8f504927688c5e2ce43124a2513ba8971bc34fed8c1c2fee4d400e82d58d0f4169ca3112fe125f30c4587d23204294e473f63a3fa8dbbc389027d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgamma5-lang \
kgamma5-lang-all \
locale(kgamma5:ar) \
locale(kgamma5:az) \
locale(kgamma5:be) \
locale(kgamma5:bg) \
locale(kgamma5:br) \
locale(kgamma5:bs) \
locale(kgamma5:ca) \
locale(kgamma5:ca@valencia) \
locale(kgamma5:cs) \
locale(kgamma5:cy) \
locale(kgamma5:da) \
locale(kgamma5:de) \
locale(kgamma5:el) \
locale(kgamma5:en_GB) \
locale(kgamma5:eo) \
locale(kgamma5:es) \
locale(kgamma5:et) \
locale(kgamma5:eu) \
locale(kgamma5:fa) \
locale(kgamma5:fi) \
locale(kgamma5:fr) \
locale(kgamma5:ga) \
locale(kgamma5:gl) \
locale(kgamma5:he) \
locale(kgamma5:hi) \
locale(kgamma5:hr) \
locale(kgamma5:hu) \
locale(kgamma5:ia) \
locale(kgamma5:id) \
locale(kgamma5:is) \
locale(kgamma5:it) \
locale(kgamma5:ja) \
locale(kgamma5:ka) \
locale(kgamma5:kk) \
locale(kgamma5:km) \
locale(kgamma5:ko) \
locale(kgamma5:lt) \
locale(kgamma5:lv) \
locale(kgamma5:mk) \
locale(kgamma5:ml) \
locale(kgamma5:mr) \
locale(kgamma5:ms) \
locale(kgamma5:nb) \
locale(kgamma5:nds) \
locale(kgamma5:ne) \
locale(kgamma5:nl) \
locale(kgamma5:nn) \
locale(kgamma5:oc) \
locale(kgamma5:pa) \
locale(kgamma5:pl) \
locale(kgamma5:pt) \
locale(kgamma5:pt_BR) \
locale(kgamma5:ro) \
locale(kgamma5:ru) \
locale(kgamma5:si) \
locale(kgamma5:sk) \
locale(kgamma5:sl) \
locale(kgamma5:sq) \
locale(kgamma5:sr) \
locale(kgamma5:sr@ijekavian) \
locale(kgamma5:sr@ijekavianlatin) \
locale(kgamma5:sr@latin) \
locale(kgamma5:sv) \
locale(kgamma5:ta) \
locale(kgamma5:th) \
locale(kgamma5:tr) \
locale(kgamma5:ug) \
locale(kgamma5:uk) \
locale(kgamma5:vi) \
locale(kgamma5:zh_CN) \
locale(kgamma5:zh_HK) \
locale(kgamma5:zh_TW)"

RDEPENDS:${PN} += "kgamma5"

inherit rpm
