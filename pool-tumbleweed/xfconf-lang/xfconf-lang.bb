SUMMARY = "Languages for package xfconf"
DESCRIPTION = "Provides translations to the package xfconf"
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfconf-lang-4.18.1-1.1.noarch.rpm"
RPM_HASH = "36ccddcb1de1ee98a251ee8f85072849ae3037a5a3375bb29f5209822fbedcb6cdb8335a7e8fe88d9a4603f52dc1486b9ddaab0b9cf3fc058b65107bab029950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfconf:ar) \
locale(xfconf:be) \
locale(xfconf:bg) \
locale(xfconf:bn) \
locale(xfconf:ca) \
locale(xfconf:cs) \
locale(xfconf:da) \
locale(xfconf:de) \
locale(xfconf:el) \
locale(xfconf:en_AU) \
locale(xfconf:en_CA) \
locale(xfconf:en_GB) \
locale(xfconf:es) \
locale(xfconf:eu) \
locale(xfconf:fi) \
locale(xfconf:fr) \
locale(xfconf:gl) \
locale(xfconf:he) \
locale(xfconf:hi) \
locale(xfconf:hr) \
locale(xfconf:hu) \
locale(xfconf:id) \
locale(xfconf:is) \
locale(xfconf:it) \
locale(xfconf:ja) \
locale(xfconf:ko) \
locale(xfconf:lt) \
locale(xfconf:lv) \
locale(xfconf:ms) \
locale(xfconf:nb) \
locale(xfconf:nl) \
locale(xfconf:nn) \
locale(xfconf:oc) \
locale(xfconf:pa) \
locale(xfconf:pl) \
locale(xfconf:pt) \
locale(xfconf:pt_BR) \
locale(xfconf:ro) \
locale(xfconf:ru) \
locale(xfconf:si) \
locale(xfconf:sk) \
locale(xfconf:sl) \
locale(xfconf:sq) \
locale(xfconf:sr) \
locale(xfconf:sv) \
locale(xfconf:te) \
locale(xfconf:th) \
locale(xfconf:tr) \
locale(xfconf:ug) \
locale(xfconf:uk) \
locale(xfconf:zh_CN) \
locale(xfconf:zh_HK) \
locale(xfconf:zh_TW) \
xfconf-lang \
xfconf-lang-all"

RDEPENDS:${PN} += "libxfconf-0-3"

inherit rpm
