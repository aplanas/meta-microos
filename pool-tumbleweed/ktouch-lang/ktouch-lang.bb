SUMMARY = "Translations for package ktouch"
DESCRIPTION = "Provides translations for the 'ktouch' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktouch-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "51119af7b3eb30221f077d48668d19e1781385be8eb4c92f9331c3c7f4e4403b810d257a1f2544d717c20a5afe775c9bfd47a4f8381fe143cb1913e9f8655cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktouch-lang \
ktouch-lang-all \
locale(ktouch:af) \
locale(ktouch:ar) \
locale(ktouch:be) \
locale(ktouch:bg) \
locale(ktouch:bn) \
locale(ktouch:br) \
locale(ktouch:bs) \
locale(ktouch:ca) \
locale(ktouch:ca@valencia) \
locale(ktouch:cs) \
locale(ktouch:cy) \
locale(ktouch:da) \
locale(ktouch:de) \
locale(ktouch:el) \
locale(ktouch:en_GB) \
locale(ktouch:eo) \
locale(ktouch:es) \
locale(ktouch:et) \
locale(ktouch:eu) \
locale(ktouch:fa) \
locale(ktouch:fi) \
locale(ktouch:fr) \
locale(ktouch:ga) \
locale(ktouch:gl) \
locale(ktouch:gu) \
locale(ktouch:he) \
locale(ktouch:hi) \
locale(ktouch:hr) \
locale(ktouch:hu) \
locale(ktouch:ia) \
locale(ktouch:id) \
locale(ktouch:is) \
locale(ktouch:it) \
locale(ktouch:ja) \
locale(ktouch:ka) \
locale(ktouch:kk) \
locale(ktouch:km) \
locale(ktouch:ko) \
locale(ktouch:lt) \
locale(ktouch:lv) \
locale(ktouch:mai) \
locale(ktouch:mk) \
locale(ktouch:ml) \
locale(ktouch:mr) \
locale(ktouch:ms) \
locale(ktouch:nb) \
locale(ktouch:nds) \
locale(ktouch:ne) \
locale(ktouch:nl) \
locale(ktouch:nn) \
locale(ktouch:oc) \
locale(ktouch:pa) \
locale(ktouch:pl) \
locale(ktouch:pt) \
locale(ktouch:pt_BR) \
locale(ktouch:ro) \
locale(ktouch:ru) \
locale(ktouch:si) \
locale(ktouch:sk) \
locale(ktouch:sl) \
locale(ktouch:sq) \
locale(ktouch:sv) \
locale(ktouch:ta) \
locale(ktouch:tr) \
locale(ktouch:ug) \
locale(ktouch:uk) \
locale(ktouch:zh_CN) \
locale(ktouch:zh_TW)"

RDEPENDS:${PN} += "ktouch"

inherit rpm
